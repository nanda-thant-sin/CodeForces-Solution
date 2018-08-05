import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int indexs = s.length - 1;
		int indext = t.length - 1;
		int ans = indexs + indext + 2;
		for (int i = indexs, j = indext; i >= 0 && j >= 0; i--, j--) {
			if (s[i] != t[j]) {
				break;
			} else {
				ans -= 2;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
