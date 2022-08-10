import interfaces.Notificacao;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite 1 para notificar por email ou 2 para notificar por SMS:");

        int opcao = sc.nextInt();

        TipoNotificacao tipo = TipoNotificacao.values()[opcao - 1];
        Notificacao notificacao = tipo.obterTipo();

        System.out.println(notificacao.notificar());
    }
}
