
package a;


public class Details extends Registro{

    public Details() {
    }

    
    public Details(String Orderid, String productid, String sales, String quantity, String discount, String profit) {
        super(Orderid, productid, sales, quantity, discount, profit);
    }

    @Override
    public String toString() {
        return "Details{" + '}';
    }
    
    
}
