package oopWithNlayereApp.dataAccess;

import oopWithNlayereApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        // sadece ve sadece DB erişim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile veri tabanına eklendi");

    }
