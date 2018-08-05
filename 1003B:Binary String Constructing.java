import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int start = 1;
		if (b > a) {
			start = 0;
			sb.append(1);
			b--;
		} else {
			sb.append(0);
			a--;
		}
		for (int i = 0; i < x; i++) {
			if (start == 1) {
				sb.append(1);
				b--;
				start = 0;
			} else {
				sb.append(0);
				a--;
				start = 1;
			}
		}
		for (int i = a; i > 0; i--) {
			if (start != 0) {
				sb.append(0);
			} else {
				sb = new StringBuilder(sb.toString().replaceFirst("0", "00"));
			}
		}
		for (int i = b; i > 0; i--) {
			if (start != 1) {
				sb.append(1);
			} else {
				sb = new StringBuilder(sb.toString().replaceFirst("1", "11"));
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}

}
