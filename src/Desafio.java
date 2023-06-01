import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "Leonardo Diman Martins";
        String accType = "Corrente";
        int accountValue = 2000;
        boolean systemOn = true;

        System.out.printf("""
                ***********************
                Dados iniciais do cliente:
                
                Nome:             %s
                Tipo de conta:    %s
                Saldo Inicial:    R$ %d,00
                ***********************
                """, name, accType, accountValue);



        while (systemOn) {
            System.out.println("""
                                
                Menu
                
                    1- Consultar seu saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                
                Digite a opção desejada:
                 """);

            int interaction = scan.nextInt();

            if (interaction == 1) {
                System.out.printf("""
                        
                        Seu saldo atual é de: %d
                        -----------------------------------------
                        """, accountValue);
            } else if (interaction == 2) {
                System.out.print("Informe o valor a receber: ");

                int inputValue = scan.nextInt();

                accountValue = accountValue + inputValue;

                System.out.printf("""
                        
                        Saldo atualizado: R$ %d,00
                        -----------------------------------------
                        """, accountValue);
            } else if (interaction == 3) {
                System.out.print("Digite o valor a transferir: ");

                int inputValue = scan.nextInt();

                if (inputValue > accountValue) {
                    System.out.printf("""
                        
                        Não há saldo para essa transferência.
                        Seu saldo atual é de: R$ %d,00
                        -----------------------------------------
                        """, accountValue);
                } else {
                    accountValue = accountValue - inputValue;

                    System.out.printf("""
                        
                        Saldo atualizado: R$ %d,00
                        -----------------------------------------
                        """, accountValue);
                }
            }
            else if (interaction == 4) {
               systemOn = false;
            }
        }

        System.out.println("Até logo!");
    }
}