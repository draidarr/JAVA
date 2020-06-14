package devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {
    String os;

    public Phone(String model, String producer) {
        super(model, producer);
        if (this.model == "3310" && this.producer == "nokia") {
            this.value = 999999.0;
        } else this.value = 10.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Starting the system");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (buyer.cash != null && buyer.cash >= price) {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("You bought "+this);
            } else System.out.println("You can't buy that");
        } else System.out.println("Merchant doesn't have that item!");
    }
}
