import java.util.*;

public class DelimeterCheck extends StackX {

	public DelimeterCheck(int s) {
		super(s);

	}
	
	public boolean checker(String expression) {
		int arrayCount = 0;
		for (int i = 0; i < expression.length(); i++) {
			char compare = expression.charAt(i);
			if (compare == '{') {
				this.push(compare);
			} else if (compare == '}') {
				this.pop();
			}
			arrayCount++;
		}
		boolean answer = false;
		if (arrayCount == expression.length()) {
			if (this.isEmpty()) {
				answer = true;
			} else
				answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expression;
		System.out.println("Enter a braced expression.");
		expression = scan.next();
		DelimeterCheck check = new DelimeterCheck(expression.length());
		// char [] array = new char[expression.length()];
		if(check.checker(expression)) {
			System.out.println("Good expression");
		}
		else
			System.out.println("Bad expression");

	}
}
