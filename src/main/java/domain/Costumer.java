package domain;

public class Costumer extends User{

    //Atributo

    private String costumerType;




    //Getter and Setter
    public String getCostumerType() {
        return costumerType;
    }


    // Getter and Setter

    public void setCostumerType(String costumerType) {
        this.costumerType = costumerType;
    }

    @Override
    public void createUser() {
        super.createUser();
        System.out.println("Tipo de cliente");
        costumerType = sc.nextLine();
    }


    @Override
    public void listUser() {
        super.listUser();
        System.out.println("Tipo cliente" + costumerType);
    }
}
