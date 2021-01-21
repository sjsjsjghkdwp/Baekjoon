import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] name = new String[2];
		name[0] = sc.next();
		String name2 = sc.next();
		System.out.println(name[0]==name2);
		System.out.println(name[0].equals(name2));
		name[1] = "good";
		String name3 = "good";
		System.out.println(name[1]==name3);
	}
}
