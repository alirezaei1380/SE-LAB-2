package PaymentServices;

public interface OrderService extends PaymentService, RegistrationService{
    void payment(int foodPrice);
    void register(String customerName);
}
