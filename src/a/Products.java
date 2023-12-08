
package a;


public class Products extends Registro{

    public Products() {
    }

    public Products(String productid, String category, String subcategory, String productname) {
        super(productid, category, subcategory, productname);
    }

    @Override
    public String toString() {
        return "Products{" + '}';
    }
    
    
}
