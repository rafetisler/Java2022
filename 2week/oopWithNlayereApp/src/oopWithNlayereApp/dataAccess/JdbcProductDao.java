package oopWithNlayereApp.dataAccess;

import oopWithNlayereApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        // sadece ve sadece DB erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veri tabanına eklendi");

    }

}

