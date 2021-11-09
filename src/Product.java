public class Product {

    public enum Category {
        DGD, TT, MP, TP
    }

    String id;
    String name;
    double price;
    Category category;
    int quantity;
    int sold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public Product(String id, String name, double price, Category category, int quantity, int sold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.sold = sold;
    }

    @Override
    public String toString() {
        return  this.id + " - " + this.name + " - " + this.price + " - " + this.category + " - " + this.quantity + " - " + this.sold;
    }


}
