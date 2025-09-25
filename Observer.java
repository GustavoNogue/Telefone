// Interface Observer: qualquer classe que queira "observar"
// o PhoneModel precisa implementar esse método update.
public interface Observer {
    void update(PhoneModel model);
}