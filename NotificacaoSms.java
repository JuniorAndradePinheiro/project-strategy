import interfaces.Notificacao;

public class NotificacaoSms implements Notificacao {
    @Override
    public String notificar() {
        return "Notificando por SMS";
    }
}
