import java.util.*;

public class dinghouji_06 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        try {
            System.out.println("--��������������--");
            Scanner scanner = new Scanner(System.in);
            System.out.println("������a:");
            a = scanner.nextInt();

            System.out.println("������b:");
            b = scanner.nextInt();

            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("�����쳣 ������������ " + e);
        }
        catch (InputMismatchException s) {
            System.out.println("���������쳣,���������� " + s);
        }

        System.out.println("�������н���");
    }
}
