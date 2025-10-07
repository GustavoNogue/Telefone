public class Main {
    public static void main(String[] args) {
        // O número que queremos simular a discagem.
        String numeroParaDiscar = "081999887766";

        // 1. Construir o gráfico de objetos (Model, UI, Controller)
        // O PhoneModel (o modelo) não sabe nada sobre a Screen (a UI).
        PhoneModel model = new PhoneModel();

        // A Screen (a UI) observa o modelo para se atualizar.
        Screen screen = new Screen(model);

        // O KeyPad (o controlador) age sobre o modelo.
        KeyPad keyPad = new KeyPad(model);

        // 2. Executar a simulação
        // Itera sobre cada dígito do número e simula o pressionamento da tecla.
        for (char digito : numeroParaDiscar.toCharArray()) {
            System.out.println("Pressionando: " + digito);
            keyPad.press(digito);
        }
    }
}