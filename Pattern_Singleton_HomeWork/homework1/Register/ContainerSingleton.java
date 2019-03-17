package singleton.Register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> map = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (map){
            if(!map.containsKey(className)){
                Object object = null;
                try{
                    object = Class.forName(className).newInstance();
                    map.put(className,object);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return object;
            }
            return map.get(className);
        }
    }
}
