package Demo;
//测试char
public class Demo9 {
	public static void main(String[] args) {
	/*	char c1 = 'a';
		char c2 = '尚'; //unicode 2字节:0-65535
		char c3 = '\'';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		*/
		char c4 ='a';
		int i = c4+2;
		System.out.println(i);
		char c5 = (char)i;
		System.out.println(c5);
		//for 循环打印a-z
		for(int j=0;j<26;j++) {
			char temp =(char)(c4+j);
			System.out.print(temp);	
		}
		//java里面的字符串 定义为String类
		String str ="abcdefghijklmnopqrstuvwxyz";
		System.out.println("\n"+str);
		
		boolean b = false;
		if(b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
