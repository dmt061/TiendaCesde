package Domain;

public class Costumer extends User{

    String costumerType;

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
        System.out.println("Tipo de Cliente");
        costumerType=sc.nextLine();
    }

    @Override
    public void CreateUser() {
        super.CreateUser();
        System.out.println("tipo de cliente");
        costumerType=sc.nextLine();
        System.out.println("Tipo de cliente"+ costumerType);
    }
}



