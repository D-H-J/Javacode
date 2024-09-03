import java.util.*;

class DangerException extends Exception {
    private String goodsName;

    public DangerException(String goodsName) {
        this.goodsName = goodsName;
    }

    void toShow() {
        System.out.println(goodsName + " ��Σ����Ʒ����鲻ͨ��!");
    }
}

class Machine {
    void checkBag(Goods goods) throws DangerException {
        if (goods.danger) {
            throw new DangerException(goods.name);
        } else {
            System.out.println(goods.name + " ����Σ��Ʒ��" + goods.name + " ���ͨ��");
        }
    }
}

class Goods extends Machine {
    public String name;
    boolean danger;

    void setIsDanger(boolean danger) {
        this.danger = danger;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class dinghouji_07 {
    public static void main(String[] args) {
        try {
            Goods d1 = new Goods();
            d1.setName("ƻ��");
            d1.setIsDanger(false);
            d1.checkBag(d1);

            Goods d2 = new Goods();
            d2.setName("����");
            d2.setIsDanger(true);
            d2.checkBag(d2);
        } catch (DangerException e) {
            e.toShow();
        }
    }
}
