package Practice;

public class Exercise6 {

	public static void main(String[] args) {
		int i = 1;
		 while (i <= 6) {
		 method1(i,2);
		 i++;
		 }
		 System.out.println("i is " + i);
		 } //main
		 public static void method1(int i, int num) {
		 for (int j=1;j<=i;j++) {
		System.out.print(num + " ");
		num *= 2;
		 }
		 System.out.println();
	}

}
