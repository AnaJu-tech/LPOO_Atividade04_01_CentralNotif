public interface Notificador {
    void enviar(String mensagem);
    String getCanal();
    default void enviarUrgente(String mensagem) {
        System.out.println("URGENTE: " + mensagem);
    }
}