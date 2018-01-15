import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Member g = new Member();
		Scanner sc = new Scanner(System.in);
		g.setFirstName(sc.next());

		System.out.println(g.getFirstName());
	}
}
