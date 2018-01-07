package pattern;

public class IntToHexExpression implements Expression{
    private int i;
    
    public IntToHexExpression(int i) {
        this.i = i;
    }
 
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
