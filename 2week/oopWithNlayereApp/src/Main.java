import oopWithNlayereApp.business.ProductManager;
import oopWithNlayereApp.core.logging.DatabaseLogger;
import oopWithNlayereApp.core.logging.FileLogger;
import oopWithNlayereApp.core.logging.Logger;
import oopWithNlayereApp.dataAccess.HibernateProductDao;
import oopWithNlayereApp.dataAccess.JdbcProductDao;
import oopWithNlayereApp.entities.Product;



public class Main {
    public static void main(String[] args) throws  Exception{
        Product product1 =new Product(1,"İphone",9999);
        Logger[]loggers ={new DatabaseLogger(),new FileLogger()};

        ProductManager productManager=new ProductManager( new HibernateProductDao(), loggers);
        productManager.add(product1);


    }
}