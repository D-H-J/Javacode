import java.util.*;

public class dinghouji_08 {
    public static void main(String[] args) {
        try{

            Scanner scanner = new Scanner(System.in);
            System.out.println("������һ�����䣺");
            int a = scanner.nextInt();
            if(a > 100 || a < 0)
            {
                throw new AgeException();
            }
            else{
                System.out.println("������������ǣ�" + a);
            }
        }
        catch (AgeException a){
            a.show();

        }
        
    }
}

class Student{
    int age;
    void setage(int age){
        this.age = age;
    }
}

class AgeException extends Exception{
    void show()
    {
        System.out.println("����������ʽ�������������룡");
    }
}