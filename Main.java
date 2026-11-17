public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Email("ana@unileste.edu.br");
        notificador.enviar("Bem-vinda ao curso de POO! \n");
        
        CentralDeAvisos central = new CentralDeAvisos();
    
        Notificador [] canais = {
            new Email("ana@unileste.edu.br"),
            new SMS("(31) 99999-0001"),
            new WhatsApp("(31) 98888-0002"),
            new Telegram("@ana_poo")
        };

        central.avisarTodos(canais, "A prova de POO foi remarcada para sexta-feira às 19h.");

        System.out.println("\n");

        notificador = new WhatsApp("(31) 98888-0002");
        notificador.enviarUrgente("A sala mudou para o bloco B.");

        Agendavel email = new Email("ana@unileste.edu.br");
        email.agendar("18h00");

        //ERRO A: "Cannot instantiate the type Notificador" - Interface não pode ser instanciada diretamente, 
        // apenas classes concretas que implementam a interface podem ser instanciadas.

        //ERRO B: "The type WhatsApp must implement the inherited abstract method Notificador.getCanal()" - 
        // Ao implementar a interface Notificador, a classe WhatsApp deve conter todos os métodos da interface, 
        // incluindo getCanal().
    }
}