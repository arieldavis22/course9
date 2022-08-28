package _Final;

public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());


        int pw = 12314;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(0);
        password.letMeIn(3987432);
        password.letMeIn(123324);
        password.letMeIn(75427436);
    }
}
