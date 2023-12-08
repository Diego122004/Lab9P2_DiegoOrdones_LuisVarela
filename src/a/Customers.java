
package a;


public class Customers extends Registro{

    public Customers() {
    }

    
    public Customers(String customerid, String customername, String segment, String country, String city, String state, String postalcode, String region) {
        super(customerid, customername, segment, country, city, state, postalcode, region);
    }

    @Override
    public String toString() {
        return "Customers{" + '}';
    }
    
    
}
