import java.util.Scanner;

public class App {
   public App() {
   }

   public static void main(String[] args) {
      String nome = "Felipe Penha";
      String tipo = "Corrente";
      double saldo = 2000.0;
      int opcao = 0;
      System.out.printf("\nNome do Cliente: " + nome);
      System.out.printf("\nTipo de Conta: " + tipo);
      System.out.printf("\nSaldo: " + saldo);
      String menu = "** Selecione sua op\u00e7\u00e3o **\n\n1- Saldo\n2- Trasferencia\n3- Receber\n4- Sair\n\n";
      Scanner digitacao = new Scanner(System.in);

      while(opcao != 4) {
         System.out.println(menu);
         opcao = digitacao.nextInt();
         if (opcao == 1) {
            System.out.println("Seu saldo \u00e9 " + saldo);
         } else {
            double valor;
            if (opcao == 2) {
               System.out.println("Qual o valor da sua transferencia?");
               valor = digitacao.nextDouble();
               if (valor > saldo) {
                  System.out.println("N\u00e3o h\u00e1 saldo suficiente para realizar essa opera\u00e7\u00e3o");
               } else {
                  saldo -= valor;
                  System.out.println("Seu novo saldo \u00e9 " + saldo);
               }
            } else if (opcao == 3) {
               System.out.println("valor recebido: ");
               valor = digitacao.nextDouble();
               saldo += valor;
               System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
               System.out.println("Op\u00e7\u00e3o invalida!");
            }
         }
      }

   }
}
