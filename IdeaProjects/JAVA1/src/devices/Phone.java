package devices;

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
}
