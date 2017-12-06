package Demo;
//测试自动强制转型
public class Demo10 {
	public static void main(String [] args) {
		byte b = 123;
	//	byte b2 = 300;
	//	char c = -3;
		char c2 = 'a';
		int i = c2;
		long d01 = 123213;
		float f = d01;
		
		//强制转换类型
		int i2 = 100;
		char c3 =(char)i2;
		System.out.println(c3);
		
		//表达式中的类型提升问题
		int a1 = 3;
		long b1 = 4;
		double d1 = 5.3;
		int c1 = (int)(a1+b1);
		float f1 = (float)(a1+d1);
		
		int money = 1000000000;
		int year = 20;
		int total = money*year; //溢出
		long total2 = (long)money*year;
		System.out.println(total2);  
		
		//一个人70年心跳多少次
		 long time = (long)70*60*24*365*70;
		 System.out.println(time);
		
		
		
		
	}
}
