public class SMS implements Notificador {
    private String telefone;

    public SMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        if (mensagem.length() <= 40) {
            System.out.println("[SMS] para " + telefone + ": " + mensagem);
        } else {
            System.out.println("[SMS] para " + telefone + ": " + mensagem.substring(0, 40) + "...");
        }
    }

    @Override
    public String getCanal() {
        return "SMS";
    }
    
}
