package _Final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static init block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd init block called");
    }

    public void someMethod() {
        System.out.println("Some method called");
    }
}
