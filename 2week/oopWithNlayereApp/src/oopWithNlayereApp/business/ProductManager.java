package oopWithNlayereApp.business;

import oopWithNlayereApp.dataAccess.HibernateProductDao;
import oopWithNlayereApp.dataAccess.JdbcProductDao;
import oopWithNlayereApp.dataAccess.ProductDao;
import oopWithNlayereApp.entities.Product;

public class ProductManager {
    public  void add(Product product) throws Exception {
        //response request
        // İş Kurlları
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün Fiyatı 10 dan Küçük Olamaz.");
        }

        ProductDao productDao=new HibernateProductDao();
        productDao.add(product);

    }
}
