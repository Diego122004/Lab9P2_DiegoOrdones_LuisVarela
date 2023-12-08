
package a;

/**
 *
 * @author 50432
 */
public class Orders extends Registro{

    public Orders() {
    }

    public Orders(String Orderid, String Orderdate, String shipdate, String shipmode, String customerid) {
        super(Orderid, Orderdate, shipdate, shipmode, customerid);
    }

    @Override
    public String toString() {
        return "Orders{" + '}';
    }
    
    
    
}
