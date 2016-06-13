import java.io.Reader;
import java.util.Scanner;

public class Using_various_String {
	public static void main(String args[]){
		String s1,s2,s3;
		s1=new String("we are JCman");
		s2=new String("We are JCman");   
		s3=new String("  Hello world!  ");
		System.out.println(s1.equals(s2)+"");
		System.out.println(s1.contains(s2)+"");
		System.out.println(s1.startsWith("we")+"");
		System.out.println(s1.compareTo(s2)+"");
		System.out.println("are所在字符串的位置"+s1.indexOf("are",3));
		System.out.println(s1.substring(7,s1.length()));
		System.out.println(s3.trim());//trim()是去掉前后空格
		int number=8658;
		System.out.println(number+"  "+Long.toString(number,16));
		System.out.println("请输入字符串：");
		Scanner reader=new Scanner(System.in);
		String s=reader.nextLine();
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		String s4=new String(a);
		String s5=new String(b);
		System.out.println(""+s4+"   "+s5);
		StringBuffer str=new StringBuffer("0123456789");
		str.setCharAt(0, 'a');
		str.setCharAt(1, 'b');
		System.out.println(str);
		str.insert(2, "**");
		System.out.println(str);
		str.delete(6,8);
		System.out.println(str);
	}
}
