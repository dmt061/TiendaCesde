package domain;

import java.util.Scanner;

public class User {



    // Atributos
    private int userId;
    private String userName;
    private String userLastName;
    private String mail;
    private String password;

    // Instancia de Scanner
    Scanner sc = new Scanner(System.in);

    // Getter and Setter

    public int getUserId(){
        return this.userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodos propios


    public void createUser(){

        System.out.println("Ingrese Id");
        userId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        userName = sc.nextLine();

        System.out.println("Ingrese el apellido");
        userLastName = sc.nextLine();

        System.out.println("Ingrese el correo");
        mail = sc.nextLine();

        System.out.println("Ingrese el password");
        password = sc.nextLine();

    }

    public void listUser(){

        System.out.println("Id: " + userId + "\n" +
                "Nombre: " + userName + "\n" +
                "Apellido: " + userLastName + "\n" +
                "Correo: " + mail + "\n"
                );
    }

    public void updateUser(){


    }

    public void deleteUser(){


    }








}
