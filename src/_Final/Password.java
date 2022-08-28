package _Final;

public class Password {
    private static final int key = 75427436;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == 0) {
            System.out.println("Welcome in");
            return true;
        } else {
            System.out.println("Cannot come in");
            return false;
        }
    }
}
