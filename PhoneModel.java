import java.util.ArrayList;
import java.util.List;

// A classe PhoneModel é o "Subject" no padrão Observer.
// Ela mantém o estado do número discado e notifica os observadores
// sempre que esse estado mudar.
public class PhoneModel {
    // Armazena os dígitos do número discado
    private StringBuilder numero = new StringBuilder();

    // Lista de observadores interessados em mudanças no modelo
    private List<Observer> observers = new ArrayList<>();

    // Método chamado quando o usuário adiciona um dígito
    public void adicionarDigito(char digito) {
        numero.append(digito); // adiciona o dígito ao número
        notifyObservers();     // notifica todos os observadores
    }

    // Retorna o número completo discado até agora
    public String getNumero() {
        return numero.toString();
    }

    // Retorna o último dígito discado
    public char getUltimoDigito() {
        return numero.charAt(numero.length() - 1);
    }

    // --- Métodos relacionados ao padrão Observer ---

    // Permite que novos observadores se registrem
    public void addObserver(Observer o) {
        observers.add(o);
    }

    // Notifica todos os observadores registrados sobre uma mudança
    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this); // chama update em cada observador
        }
    }
}
