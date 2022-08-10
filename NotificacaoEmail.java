import interfaces.Notificacao;

public class NotificacaoEmail implements Notificacao {

    @Override
    public String notificar() {
        return "Notificando por E-mail";
    }
}
