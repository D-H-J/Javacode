
import java.util.Scanner;
public class Wangyuxiang {
	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("�������������Ĳ�����");
	        int n = scanner.nextInt();
	        
	        System.out.println(n + "���������ǣ�");
	        
	        for (int i = 1; i <= n; i++) {
	            // ����ո�
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }
	            
	            // �����������
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            
	            // ����ݼ�����
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            
	            System.out.println();
	        }
	    }

}