package domain;

public class TestUsers {


    public static void main(String[] args) {

        User user = new User();
        Vendor vendor = new Vendor();

        //user.createUser();
        //vendor.createUser();
        //vendor.listUser();


        vendor.setUserName("Maria");

        System.out.println(vendor.getUserName());

        //vendor.userLastName = "Machado";






    }
}
