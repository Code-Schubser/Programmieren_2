package calculator;

/**
 * Substraction class to subtract two inter
 */
public class Sub implements Operation {
    /**
     * The method of interface has to be implemented
     * @param a left operand (integer)
     * @param b right operand (integer)
     * @return
     */
    public int doOperation(int a, int b){
        return a - b;
    }
}
