package programs;

public class SwappingwithoutusingThirdVar {

	public static void main(String[] args) {
    int a,b;
    a=20;
    b=30;
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("a = "+a+" "+"b ="+b);
	}

}
