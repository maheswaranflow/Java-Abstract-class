abstract class DeliveryMethod {
    abstract void estimateTime();
}

class ExpressDelivery extends DeliveryMethod {

    @Override
    void estimateTime() {
        System.out.println("Estimated delivery time: 1-2 days");
    }
}

public class Main {
    public static void main(String[] args) {
        ExpressDelivery delivery = new ExpressDelivery();
        delivery.estimateTime();
    }
}