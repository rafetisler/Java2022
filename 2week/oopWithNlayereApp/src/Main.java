import oopWithNlayereApp.business.ProductManager;
import oopWithNlayereApp.dataAccess.HibernateProductDao;
import oopWithNlayereApp.dataAccess.JdbcProductDao;
import oopWithNlayereApp.entities.Product;

public class Main {
    public static void main(String[] args) throws  Exception{
        Product product1 =new Product(1,"İphone",9999);
        ProductManager productManager=new ProductManager( new HibernateProductDao());
        productManager.add(product1);


    }
}