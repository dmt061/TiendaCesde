package domain;

public class Vendor extends User{

    // Atributos

    String vendorType;
    String categoryVendor;
    boolean aviability;

    // Constructor

    public Vendor(){

        super();

    }

    public Vendor(String vendorType, String categoryVendor, boolean aviability) {
        this.vendorType = vendorType;
        this.categoryVendor = categoryVendor;
        this.aviability = aviability;
    }

    // Getter and Setter


    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public String getCategoryVendor() {
        return categoryVendor;
    }

    public void setCategoryVendor(String categoryVendor) {
        this.categoryVendor = categoryVendor;
    }

    public boolean isAviability() {
        return aviability;
    }

    public void setAviability(boolean aviability) {
        this.aviability = aviability;
    }


    // Metodos Propios

    @Override
    public void createUser() {
        super.createUser();

        System.out.println("Ingrese el tipo de vendedor");
        vendorType = sc.nextLine();
        System.out.println("Ingrese la categoria del vendedor");
        categoryVendor = sc.nextLine();
        System.out.println("Ingrese la disponibilidad del vendedor");
        aviability = sc.nextBoolean();
    }


    @Override
    public void listUser() {
        super.listUser();
        System.out.println("Tipo de vendedor: " + vendorType + "\n" +
                "Categoria de vendedor: " + categoryVendor + "\n" +
                "Disponibilidad" + aviability);
    }


    @Override
    public void updateUser() {
        super.updateUser();
    }

    @Override
    public void deleteUser() {
        super.deleteUser();
    }
}
