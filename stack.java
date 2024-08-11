import java.util.Stack;
public class Main {
	public static void main(String [] args) {
		Stack <String> s=new Stack<String>();
		System.out.println(s.empty());
		s.push("A");
		s.push("R");
		s.push("v");
		s.push("i");
		s.push("n");
		s.push("d");
	   // String a=s.pop();
	    System.out.println(s.peek());
		System.out.println(s);
        //System.out.println(a);
        System.out.println(s.search("R"));
        
        
	}
}