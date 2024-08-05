package domain;

import java.util.Scanner;

public class Product {


    private int productId;
    private String productName;
    private String description;
     Category category;
    private float cost;
    private float profit;
    private float price = cost/(1 - (profit/100));
    private String state;

    Scanner sc = new Scanner(System.in);


    // Constructores

    public Product(){


    }

    public Product(int productId, String productName, String description, Category category, float cost, float profit, float price, String state) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.cost = cost;
        this.profit = profit;
        this.price = price;
        this.state = state;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    // Create categoria - metodo propio


    public void createProduct(){

        System.out.println("Ingrese el id del producto");
        productId = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del prodcuto");
        productName=sc.nextLine();
        System.out.println("Ingrese la descripcion del producto");
        description=sc.nextLine();
        System.out.println("Seleccione una categoria");
        category.getCategoryName();
        System.out.println("Ingrese el costo del producto");
        cost=sc.nextFloat();
        System.out.println("Ingrese el margen de ganancia ");
        profit=sc.nextFloat();
        sc.nextLine();
        System.out.println("Seleccione un estado");
        state=sc.nextLine();


    }

    public  void printProduct(){
        System.out.println("Id "+ productId + "\n"+
        "Nombre del producto" + productName + "\n"+
        "descripcion"+ description + "\n"+
        "categoria"+ category.getCategoryName() + "\n"+
        "Costo" + cost + "\n"+
        "ganancia"+ profit + "\n"+
        "precio"+ price+ "\n"+
        "Estado"+ state + "\n");

    }




}
