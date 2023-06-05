package exceptions;

public class CallHierarchy {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void methodA() throws Exception {
        System.out.println("Inside method A");
        methodB();
    }

    public static void methodB() throws Exception {
        System.out.println("Inside method B");
        methodC();
    }

    public static void methodC() throws Exception {
        System.out.println("Inside method C");
        methodD();
    }

    public static void methodD() throws Exception {
        System.out.println("Inside method D");
        throw new Exception("Error in method D");
    }


    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("Error in method3");
    }

}
