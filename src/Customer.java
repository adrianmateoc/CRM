public class Customer extends Users{

    String billingAddress;
    int id;
    String shippingAddress;
    String DNI;

    public Customer(String billingAddress, int id, String shippingAddress, String DNI) {
        this.billingAddress = billingAddress;
        this.id = id;
        this.shippingAddress = shippingAddress;
        this.DNI = DNI;
    }

    public Customer() {
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    void register() {

    }

    @Override
    void login() {

    }

    @Override
    void logout() {

    }
}