package pattern;

/**
 * 출처: http://palpit.tistory.com/199 [palpit's log-b]
 */
public class Main {

	public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";
 
        InterpreterMain ec = new InterpreterMain(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));
	}

}
