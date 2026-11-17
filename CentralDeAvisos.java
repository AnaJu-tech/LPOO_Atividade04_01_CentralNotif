public class CentralDeAvisos {
    public void avisar(Notificador canal, String mensagem) {
        canal.enviar(mensagem);
    }

    public void avisarTodos(Notificador[] canais, String mensagem) {
        for (Notificador canal : canais) {
            System.out.println("Enviando por " + canal.getCanal() + "...");
            canal.enviar(mensagem);
        }
        System.out.println("Total de canais avisados: " + canais.length);
    }
}
