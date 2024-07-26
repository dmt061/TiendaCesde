package Domain;

import java.util.Scanner;

public class User {

    int userId;

    String UsernName;
    String UserLastName;
    String Mail;
    String password;
    Scanner sc=new Scanner(System.in);

    public void CreateUser() {
        System.out.println("Ingrese Id");
        userId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre ");
        UsernName=sc.nextLine();

        System.out.println("Ingrese el Apellido");
        UserLastName=sc.nextLine();

        System.out.println("Ingrese el correo");
        Mail=sc.nextLine();

        System.out.println("Ingrese la contraseña");
        password=sc.nextLine();
    }

    public void ListUser() {
        System.out.println("Id:" + userId + "\n"+
        "Nombre:" + UsernName+ "\n"+
        "Apellido"+ UserLastName +"\n"+
        "Correo"+ Mail + "\n"
        );

    }

    public void UpdateUser(){

    }

    public void DeleteUser(){


    }



}
