import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = m;
		for (int i = 0; i < n; i++) {
			a -= sc.nextInt();
			int res = 0;
			if (a <= 0) {
				res = 1;
				res += -1 * (a / m);
				a = m - (-1 * a) % m;
			}

			if (i != n - 1)
				System.out.print(res + " ");
			else
				System.out.println(res);

		}
		sc.close();
	}
}
