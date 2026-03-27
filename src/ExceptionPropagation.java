import java.util.*;
public class ExceptionPropagation {
    static void method1(){
        int a = 5 ;
        int b = 0 ;
        int result = a / b ;

    }
    static  void method2(){
        method1();
    }
    public static  void main(String[] args){
        try {
            method2();
        }
        catch(ArithmeticException e) {
            System.out.println("Exception was handled in main");
        }
    }
}
