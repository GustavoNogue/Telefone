// A classe KeyPad representa o teclado do telefone.
// Sempre que uma tecla é pressionada, ela informa o PhoneModel
// para atualizar o número discado.
public class KeyPad {
    private PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    // Método chamado quando o usuário pressiona uma tecla
    public void press(char digit) {
        // Chama o método do PhoneModel para adicionar o dígito
        model.addDigit(digit);
    }
}