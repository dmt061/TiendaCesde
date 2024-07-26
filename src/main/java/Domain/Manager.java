package Domain;

public class Manager extends User{

    String auth;

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
        System.out.println("Ingresa la clave de usuario");
        auth=sc.nextLine();
    }

    @Override
    public void CreateUser() {
        super.CreateUser();
        System.out.println("Crear Clave de auntenticacion" );
          auth=sc.nextLine();}

}
