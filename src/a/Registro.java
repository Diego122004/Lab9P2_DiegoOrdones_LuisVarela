
package a;


public class Registro {
    private int id;
    private String Orderid;
    private String Orderdate;
    private String shipdate;
    private String shipmode;
    private String customerid;
    private String customername;
    private String segment;
    private String country;
    private String city;
    private String state;
    private String postalcode ;
    private String region;
    private String productid;
    private String category;
    private String subcategory;
    private String productname;
    private String sales;
    private String quantity;
    private String discount;
    private String profit;

    public Registro() {
    }

    public Registro(int id, String Orderid, String Orderdate, String shipdate, String shipmode, String customerid, String customername, String segment, String country, String city, String state, String postalcode, String region, String productid, String category, String subcategory, String productname, String sales, String quantity, String discount, String profit) {
        this.id = id;
        this.Orderid = Orderid;
        this.Orderdate = Orderdate;
        this.shipdate = shipdate;
        this.shipmode = shipmode;
        this.customerid = customerid;
        this.customername = customername;
        this.segment = segment;
        this.country = country;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
        this.region = region;
        this.productid = productid;
        this.category = category;
        this.subcategory = subcategory;
        this.productname = productname;
        this.sales = sales;
        this.quantity = quantity;
        this.discount = discount;
        this.profit = profit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderid() {
        return Orderid;
    }

    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    public String getOrderdate() {
        return Orderdate;
    }

    public void setOrderdate(String Orderdate) {
        this.Orderdate = Orderdate;
    }

    public String getShipdate() {
        return shipdate;
    }

    public void setShipdate(String shipdate) {
        this.shipdate = shipdate;
    }

    public String getShipmode() {
        return shipmode;
    }

    public void setShipmode(String shipmode) {
        this.shipmode = shipmode;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", Orderid=" + Orderid + ", Orderdate=" + Orderdate + ", shipdate=" + shipdate + ", shipmode=" + shipmode + ", customerid=" + customerid + ", customername=" + customername + ", segment=" + segment + ", country=" + country + ", city=" + city + ", state=" + state + ", postalcode=" + postalcode + ", region=" + region + ", productid=" + productid + ", category=" + category + ", subcategory=" + subcategory + ", productname=" + productname + ", sales=" + sales + ", quantity=" + quantity + ", discount=" + discount + ", profit=" + profit + '}';
    }
    
    
    
}
