package oopWithNlayereApp.business;

import oopWithNlayereApp.core.logging.Logger;
import oopWithNlayereApp.dataAccess.HibernateProductDao;
import oopWithNlayereApp.dataAccess.JdbcProductDao;
import oopWithNlayereApp.dataAccess.ProductDao;
import oopWithNlayereApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }

    public void add(Product product) throws Exception {
        //response request
        // İş Kurlları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün Fiyatı 10 dan Küçük Olamaz.");
        }
        productDao.add(product);
        for (Logger logger: loggers
             ) {
            logger.log(product.getName());

        }


    }
}
