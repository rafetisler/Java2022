public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStokAmount(3);
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add2(1, "Rafet", 2, 200);

        System.out.println(product.getKod());

    }
}