
import java.util.Scanner;
import java.util.Random;
public class  work01{
	public static void main (String[] args)
	{
		Random r = new Random();
		int range1  = r.nextInt(101);
		int count  = 0,num =0;
		int guess = range1;
		System.out.print("����һ��1--100֮���������²�������֣�");
		while(num != guess)
		{
			Scanner scanner = new Scanner(System.in); 
			
			num  = scanner.nextInt();
			count ++;
			if (num > guess)
			{
				System.out.println("���˴��ˣ�������Сһ������֣�");

			}
			else if(num < guess)
			{
				System.out.println("С��С�ˣ��������һ������֣�");
			}

		}

		System.out.println("��һ��������"+ count+ "��");
	}
}