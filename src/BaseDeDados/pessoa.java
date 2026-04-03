package BaseDeDados;

abstract class pessoa {

    private String nome;
    private String cpf;

    public pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    public abstract void exibirInfo();

}
