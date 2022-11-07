import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b+c != 180) {
			System.out.println("Error");
			return;
		}
		
		if (a==60 && b==60) {
			System.out.println("Equilateral");
			return;
		}
		
		if (a==b || b==c || c==a) {
			System.out.println("Isosceles");
			return;
		}
		
		System.out.println("Scalene");
	}

}
