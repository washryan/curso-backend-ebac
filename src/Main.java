public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Carlos", 30, "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa XPTO", 10, "12.345.678/0001-99");

        pf.exibirDados();
        pj.exibirDados();
    }
}
