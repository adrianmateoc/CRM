import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean login = true;
        char rol;

        while(login == true) {
            System.out.println("Welcome to the CRM app, are you Customer or Salesman? (C/S)");
            rol = scanner.next().charAt(0);
            if (String.valueOf(rol).equalsIgnoreCase("c")) System.out.println("Hello Customer");
            else if (String.valueOf(rol).equalsIgnoreCase("s")) System.out.println("Hello Salesman");
            else {
                System.out.println("That's the wrong answer");
                login = false;
            }
            Customer c = createCustomer();
            System.out.println(c.getDNI());
            System.out.println(c.getName());
            login = false;
        }
    }

    public static Customer createCustomer(){
        Customer customer = new Customer();
        customer.setDNI("123141D");
        customer.setName("Manolo");
        return customer;
    }
}
