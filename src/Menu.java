public class Menu {
    public void line(){
        System.out.println("**************************************");
    }

    public void options(){
        System.out.println("""
                ESOLHA A OPÇÃO DESEJADA
                
                1 - CONSULTAR SALDO
                2 - REALIZAR SAQUE
                3 - TRANSFERIR
                4 - DEPOSITAR
                0 - ENCERRAR ATENDIMENTO
                
                """);
    }
}
