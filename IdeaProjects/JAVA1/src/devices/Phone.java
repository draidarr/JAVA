package devices;

import creatures.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements Sellable {
    String os;
    static final String DEFAULT_ADDRESS = "997.420.911";
    static final String DEFAULT_VERSION = "v8";
    static final String DEFAULT_PROTOCOL = "https";

    public Phone(String model, String producer) {
        super(model, producer);
        if (this.model == "3310" && this.producer == "nokia") {
            this.value = 999999.0;
        } else this.value = 10.0;
    }

    public void installAnApp(String appname) {
        System.out.println("You installed " + appname + "succesfully");
    }

    public void installAnApp(String appname, String version) {
        if (version == "default"){
            version = DEFAULT_VERSION;
        }
        System.out.println("You installed " + appname + " " + version + " succesfully");
    }

    public void installAnApp(String appname, String version, String address) {
        if (version == "default"){
            version = DEFAULT_VERSION;
        }
        if (address == "default"){
            address = DEFAULT_ADDRESS;
        }
        System.out.println("You installed " + appname + " " + version + " succesfully from: " + address);
    }

    public void installAnApp(String[] list) {
        for (String appname : list){
            this.installAnApp(appname);
        }
    }

    public void installAnApp(URL url) throws MalformedURLException {
        url.toString();
        System.out.println("You installed app from: " + url + " succesfully");
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
                System.out.println("You bought " + this);
            } else System.out.println("You can't buy that");
        } else System.out.println("Merchant doesn't have that item!");
    }
}
