import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Calculator {

    interface InterfaceMath{
        int opration(int a, int b);
    }

    public int operationBinary(int a, int b, InterfaceMath ab ){
        return ab.opration(a,b);
    }


    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        InterfaceMath add = (a,b) -> a+b;
        InterfaceMath sub  = (a,b) -> a-b;
        System.out.println(myApp.operationBinary(40,2, add));
        System.out.println(myApp.operationBinary(20,10, sub));

    }
}
