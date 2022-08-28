package _Final;

public class ExtendsPassword extends Password{
    private int decryptedPassword;

    public ExtendsPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
