public class Product {

    public String name;
    private int id;
    private String name1;
    private String description;
    private double price;
    private int stokAmount;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStokAmount() {
        return stokAmount;
    }

    public void setStokAmount(int stokAmount) {
        this.stokAmount = stokAmount;
    }

    public String getKod() {

      return   this.name.substring(0,1)+id;
    }


}