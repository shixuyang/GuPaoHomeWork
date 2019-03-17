package prototype;

import java.util.ArrayList;
import java.util.Date;

public class CloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng seconde = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng == seconde);
            System.out.println(qiTianDaSheng.jinGuBang == seconde.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
