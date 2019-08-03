package evaluatorexpresii;
import java.lang.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluareaExpresiei {
	
	public static int postfixEvaluation(String exp){	
		Deque<Integer> stack = new ArrayDeque<>();
		if(exp.equals(null)) {
			return -1;
		}else {
			for (int i = 0; i < exp.length(); i++) {
				switch (exp.charAt(i)) {
			   		case '+':
			   			stack.push(stack.pop() + stack.pop());
			   			System.out.println(stack);
			   			break; 
			   		case '-':
			   			stack.push(-stack.pop()+stack.pop());
			   			System.out.println(stack);
			   			break; 
			   		case '*':
			   			stack.push(stack.pop()*stack.pop());
			   			System.out.println(stack);
			   			break;
			   		case '/':
			   			int n1 = stack.pop(), n2 = stack.pop();
			   			stack.push(n2 / n1);
			   			System.out.println(stack);
			   			break;
			   		case '^':
			   			int op1 = stack.pop();
			   			int op2 = stack.pop();
			   			int res = (int) Math.pow(op2,op1);
			   			stack.push(res);
			   			System.out.println(stack);
			   			break;
			   		default:
			   			stack.push(Character.getNumericValue(exp.charAt(i)));
			   			System.out.println(stack);
			    	}
			  	}
			return stack.peek();
		}
	}

	public static void main(String[] args) {
		String s = "321+232^^*+8512*2/-/-"; 
		System.out.println(postfixEvaluation(s));

	}

}
