public class D{
	public static void main (String[] args)
	{
		int temp = 0;
		int first  = (int)'��';
		int last  = (int)'��';
		int n = 1023;
		for(int i  = first; i <= last; i ++)
		{ 
			
			if(temp % 5 == 0)
			{
				System.out.println("");
			}
			System.out.print(" " + (char)i);
			temp ++;
		}
	}
}
