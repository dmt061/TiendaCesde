package Domain;

public class Admin extends User{


    int Superkey;


    @Override
    public void UpdateUser() {
        super.UpdateUser();
    }

    @Override
    public void DeleteUser() {
        super.DeleteUser();
    }

    @Override
    public void ListUser() {
    super.ListUser();
        System.out.println("Ingresa la clave del administrador");
        Superkey=sc.nextInt();
    }

    @Override
    public void CreateUser() {
        super.CreateUser();
        System.out.println("Crear clave del andministrador");
        Superkey=sc.nextInt();
    }
}
