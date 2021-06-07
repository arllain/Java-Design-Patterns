package strategy.example03;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
