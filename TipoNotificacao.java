import interfaces.Notificacao;

public enum TipoNotificacao {

    EMAIL{
        @Override
        public Notificacao obterTipo(){
            return new NotificacaoEmail();
        }
    },
    SMS{
        @Override
        public Notificacao obterTipo(){
            return new NotificacaoSms();
        }
    };

    public abstract Notificacao obterTipo();

}
