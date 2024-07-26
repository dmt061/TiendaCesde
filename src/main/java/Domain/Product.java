package Domain;

import java.util.Scanner;

public class Product {

    int productId;

    String productName;

    String description;

    Category category;

    float price;

    float cost;

    float profit;

    boolean state;


    Scanner sc = new Scanner(System.in);


    public void createCategory(){

        System.out.println("Ingresa id producto");
        productId = sc.nextInt();
        System.out.println("Ingrese el nombre del producto:");
        productName = sc.nextLine();
        


    }

    public void listCategory(){

    }


    public void updateCategory(){

    }


    public void deleteCategory(){

    }
}
