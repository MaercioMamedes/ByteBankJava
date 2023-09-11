import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(1, "maercio");
        Menu menu = new Menu();
        Account account = new Account(111,client.getId(),"conta corrente", 0);
        Scanner scanner = new Scanner(System.in);
        int option_selected;


        do {
            menu.line();
            menu.options();
            option_selected = scanner.nextInt();

            switch (option_selected){
                case 1:
                    System.out.printf("Seu saldo é %.2f", account.getBalance());
                    break;
                case 2:
                    System.out.println("dfsdf");
                    break;

                case 3:
                    System.out.println("TRANSFERIR");
                    break;

                case 4:
                    System.out.println("DEPOSITAR");
                    break;

                case 0:
                    System.out.println("ATENDIMENTO ENCERRADO");
                    break;
            }
        } while (option_selected != 0);

    }

}
