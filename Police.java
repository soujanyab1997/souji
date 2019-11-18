import java.util.Scanner;

public class Police {
	
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	char[] chararray=input.toCharArray();
	for(int i=1;i<chararray.length-1;i++)
	{
		if(chararray[i-1]==chararray[i+1])
		{
			String s=new String(chararray,i-1,3);
			System.out.println(s);
		}
	}
	}
}
