import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean systemOn = true;

        System.out.println("""
                ***********************
                Bem vindo! Vamos realizar um cadastro inicial.
                
                Digite seu nome completo:""");

        String name = scan.nextLine();
        System.out.println("Certo! Agora digite o tipo de conta que gostaria de aderir:");

        String accType = scan.nextLine();
        System.out.println("Perfeito! Estamos quase acabando. Só falta me dizer qual o valor inicial da sua conta:");

        int accountValue = scan.nextInt();
        System.out.printf("""
                ***********************
                Aqui estão seus dados iniciais:
                
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
                        
                        Seu saldo atual é de: R$ %d,00
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

        System.out.printf("Até logo %s!", name);
    }
}