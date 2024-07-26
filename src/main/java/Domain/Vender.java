package Domain;

public class Vender extends User{

    String VendorType;
    String CategoryVendor;

    boolean aviability;

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
        System.out.println("Tipo de vendedor:" + VendorType+ "\n"+
                "Categoria vendedor:" + CategoryVendor + "\n"+
                "Disponibilidad:" + Mail);
    }

    @Override
    public void CreateUser() {
        super.CreateUser();
        System.out.println("Ingrese el tipo de vendedor");
        VendorType=sc.nextLine();


        System.out.println("Ingrese la categoria del vendedor");
        CategoryVendor=sc.nextLine();

        System.out.println("Ingresa la disponibilidad del vendedor");
        aviability=sc.nextBoolean();
    }



}
