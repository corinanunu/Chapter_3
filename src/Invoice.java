package Task3_12;

public class Invoice {
    private String idItem;
    private String description;
    private int quantity;
    private double price;

    public Invoice() {
    }



    public Invoice(String idItem, String description, int quantity, double price) {
        this.idItem = idItem;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getInvoiceAmount(){
        if(quantity < 0 && price < 0 ){
            quantity = 0;
            price = 0.0;
        }else{
            price = quantity * price;
        }
    }
}