package PaymentServices;

public class PhoneOrderService implements OrderService{

    @Override
    public void register(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }

    @Override
    public void payment(int foodPrice) {
        System.out.println("phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
