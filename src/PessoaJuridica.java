class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Jurídica: " + nome + " | Idade: " + idade + " | CNPJ: " + cnpj);
    }
}