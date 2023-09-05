

public class Main {

    public static void main(String[] args) {
        Client client = new Client(1, "maercio");
        Account account = new Account(111,client.getId(),"conta corrente", 0);

        System.out.printf("Cliente criado foi %s, sua conta tem R$ %.2f", client.getName(), account.getBalance());
    }
}
