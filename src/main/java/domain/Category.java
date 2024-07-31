package domain;

import java.util.Scanner;

public class Category {



    private int categoryId;

    private String categoryName;

    Scanner sc = new Scanner(System.in);


    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }


    public Category(){

    }

    // Getter and Setter

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    // Métodos propios


    public void createCategory(){

        System.out.println("Ingrese el ID");
        categoryId = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        categoryName = sc.nextLine();

    }

    public void listCategory(){
        System.out.println("Id: " +categoryId + "\n" +
                "Nombre Categoria: " + categoryName);
    }






}
