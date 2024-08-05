package domain;

public class TestProduct {


    public static void main(String[] args) {

        Category category=new Category();

        Product product= new Product();

        product.category=category;


        category.createCategory();

        product.createProduct();

        product.printProduct();



    }
}
