import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(1, "maercio");
        Menu menu = new Menu();
        Account account = new Account(111,client.getId(),"conta corrente", 0);
        Scanner scanner = new Scanner(System.in);
        double deposit;
        double withDraw;
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
                    System.out.print("DIGITE UMA QUANTIA PARA SACAR");
                    withDraw = scanner.nextDouble();
                    account.toWithdraw(withDraw);
                    System.out.printf("Seu saldo agora é R$ %.2f \n", account.getBalance());
                    break;

                case 3:
                    System.out.println("TRANSFERIR");
                    break;

                case 4:
                    System.out.print("digite a quantia para depósito: ");
                    deposit = scanner.nextDouble();
                    account.toDeposit(deposit);
                    System.out.println("Depósito realizado com sucesso");
                    System.out.printf("Seu saldo agora é R$ %.2f \n", account.getBalance());
                    break;

                case 0:
                    System.out.println("ATENDIMENTO ENCERRADO");
                    break;
            }
        } while (option_selected != 0);

    }

}
