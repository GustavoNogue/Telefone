// A classe Screen é a nossa UI (Interface do Usuário).
// É a única responsável por imprimir o resultado da discagem na tela.
// Ela observa o PhoneModel e reage às suas mudanças.
public class Screen {

    // Define o tamanho esperado do número de telefone para a mensagem final.
    private final int TAMANHO_FINAL_NUMERO = 12;

    public Screen(PhoneModel model) {

        // Observador 1: Imprime APENAS o último dígito discado.
        // Este observador é notificado a cada dígito adicionado.
        model.addObserver(new Observer() {
            @Override
            public void update(PhoneModel m) {
                System.out.println(m.getUltimoDigito());
            }
        });

        // Observador 2: Imprime a mensagem "Agora discando..." APENAS
        // quando o número de telefone atinge o tamanho final esperado.
        model.addObserver(new Observer() {
            @Override
            public void update(PhoneModel m) {
                // Verifica o estado do modelo para decidir se deve agir.
                if (m.getNumero().length() == TAMANHO_FINAL_NUMERO) {
                    System.out.println("Agora discando " + m.getNumero() + "...");
                }
            }
        });
    }
}