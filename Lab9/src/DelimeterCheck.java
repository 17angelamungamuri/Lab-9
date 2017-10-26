import java.util.*;

public class DelimeterCheck extends StackX {

	public DelimeterCheck(int s) {
		super(s);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expression;
		System.out.println("Enter a braced expression.");
		expression = scan.next();
		DelimeterCheck check = new DelimeterCheck(expression.length());
		// char [] array = new char[expression.length()];
		int arrayCount = 0;
		for (int i = 0; i < expression.length(); i++) {
			char compare = expression.charAt(i);
			if (compare == '{') {
				check.push(compare);
			} else if (compare == '}') {
				check.pop();
			}
			arrayCount++;
		}
		if (arrayCount == expression.length()) {
			if (check.isEmpty()) {
				System.out.println("Good expression");
			} else
				System.out.println("Bad expression");
		}
	}

}
