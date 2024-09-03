import java.math.BigDecimal;

class Student {
    private String name;
    private int age, score1, score2, score3;

    void set(String name, int age, int score1, int score2, int score3) {
        this.name = name;
        this.age = age;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    String getName() {
        return name;
    }

    public double getAverage() {
        return (score1 + score2 + score3) / 3.0;
    }
}

class UnderGraduate extends Student {
    int id;

    void set(String name, int age, int score1, int score2, int score3, int id) {
        super.set(name, age, score1, score2, score3);
        this.id = id;
    }

    void isPass() {
        double average = getAverage();

        int decimalPlaces = 1; // ������λС��
        BigDecimal bd = new BigDecimal(average);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_DOWN); // ����������.ROUND_FLOORҲ����
        double res = bd.doubleValue();
 

        if (average >= 78) {
            System.out.println("ѧ��" + id + getName() + "������ƽ����Ϊ��" + res + "�����õ�ѧλ֤");
        } else {
            System.out.println("ѧ��" + id + getName() + "������ƽ����Ϊ��" + res + "�������õ�ѧλ֤");
        }
    }
}

public class Dinghouji03_1 {
    public static void main(String[] args) {
        UnderGraduate u1 = new UnderGraduate();
        UnderGraduate u2 = new UnderGraduate();
        u1.set("������", 19, 90, 78, 89, 2001008);
        u2.set("������", 20, 50, 90, 68, 2001009);
        u1.isPass();
        u2.isPass();
    }
}
