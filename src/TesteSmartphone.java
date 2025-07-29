public class TesteSmartphone {
    public static void main(String[] args) {
        Smartphone meuCelular = new Smartphone("Samsung", "Galaxy S21");

        meuCelular.mostrarStatus();
        meuCelular.fazerLigacao("87 99999-0000");
        meuCelular.tirarFoto();
        meuCelular.mostrarStatus();
    }
}
