// A classe Screen é responsável por criar e registrar observadores
// no PhoneModel. Cada observador define uma reação diferente
// quando um novo dígito é digitado.
public class Screen {

    public Screen(PhoneModel model) {
        // Observador 1: imprime apenas o último dígito discado
        model.addObserver(new Observer() {
            @Override
            public void update(PhoneModel m) {
                System.out.println("Último dígito: " + m.getUltimoDigito());
            }
        });

        // Observador 2: imprime o número completo discado até agora
        model.addObserver(new Observer() {
            @Override
            public void update(PhoneModel m) {
                System.out.println("Agora discando " + m.getNumero() + "...");
            }
        });
    }
}