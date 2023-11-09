public class Invoice {
    Order order;

    Invoice(Order order){
        this.order = order;
    }

    public String generateBill(){
        String orders ="";
        for (Food food:this.order.foods) {
            orders+= food.foodName + " -> " + food.price+"\n";
        }
        return "Customer : " + this.order.customerName + "\nOrders are : \n" + orders + "\nTotal Price : " + this.order.getTotalPrice();
    }

}
