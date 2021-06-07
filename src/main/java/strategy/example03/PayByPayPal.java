package strategy.example03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy{
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader((System.in)));
    private String email;

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("test1", "test1@gmail.com");
        DATA_BASE.put("test2", "test2@gmail.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if(signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal");
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter the user's email: ");
                email = READER.readLine();
                System.out.println("Enter password: ");
                password = READER.readLine();
                if(verify()) {
                    System.out.println("Data verfication has been successful.");
                }else {
                    System.out.println("Wrong email or password! ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return  signedIn;
    }
}
