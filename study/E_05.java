class Bank {
    int savedMoney;  //�����
    int year;  //�������
    double interest; //�����Ϣ
    double interestRate; //���������
    double dayli; //ÿ������

    public double computeInterest() { //�����������Ϣ
        interest = year * interestRate * savedMoney;
        return interest;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void setSavedMoney(int savedMoney) {
        this.savedMoney = savedMoney;
    }

    public void setDayli(double dayli) {
        this.dayli = dayli;
    }

    double computeDay() { //���������Ϣ
        return day * dayli * savedMoney;
    }

    double total() { //��������Ϣ
        return computeInterest() + computeDay();
    }

    void show() { //��ʾ����Ϣ
        System.out.println(total());
    }
}

class ConstructionBank extends Bank {
    double year; // �Լ�����һ��double�͵�year����

    void setYear(double year) {
        this.year = year;
        super.year = (int) Math.floor(year); // ���������ָ������ص�year
    }

    void setDay() {
        day = (int) ((year * 1000) - (Math.floor(year) * 1000)); // ��������
    }

    @Override
    public double computeInterest() {
        super.computeInterest(); // ������������Ϣ
        return super.interest + computeDay(); // ���ϼ�����������Ϣ
    }
}

class BankOfDalian extends Bank {
    double year; // �Լ�����һ��double�͵�year����

    void setYear(double year) {
        this.year = year;
        super.year = (int) Math.floor(year); // ���������ָ������ص�year
    }

    void setDay() {
        day = (int) ((year * 1000) - (Math.floor(year) * 1000)); 
    }

    @Override
    public double computeInterest() {
        super.computeInterest(); 
        return super.interest + computeDay(); 
    }
}

public class E_05 {
    public static void main(String[] args) {
        ConstructionBank c1 = new ConstructionBank();
        BankOfDalian b1 = new BankOfDalian();

        c1.setYear(8.236);
        b1.setYear(8.236);

        c1.setInterestRate(0.035);
        b1.setInterestRate(0.035);

        c1.setSavedMoney(8000); // ���ô����
        b1.setSavedMoney(8000); // ���ô����

        c1.setDayli(0.0001); // ����ÿ������
        b1.setDayli(0.00012); // ����ÿ������

        c1.setDay();
        b1.setDay();

        c1.show();
        b1.show();
    }
}
