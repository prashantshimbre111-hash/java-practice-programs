package ForloopQB42;

public class exwhile {

	public static void main(String[] args) {

		String s = "prashant";

		int i = 0;
		while (i < s.length()) {
			System.out.println(s.charAt(i));
			i++;
		}

		System.out.println("___________");

		int j = s.length() - 1;
		while (j >= 0) {
			System.out.println(s.charAt(j));
			j--;
		}

	}
}
