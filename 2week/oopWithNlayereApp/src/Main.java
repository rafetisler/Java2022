import oopWithNlayereApp.business.ProductManager;
import oopWithNlayereApp.entities.Product;

public class Main {
    public static void main(String[] args) throws  Exception{
        Product product1 =new Product(1,"İphone",9999);
        ProductManager productManager=new ProductManager();
        productManager.add(product1);


    }
}