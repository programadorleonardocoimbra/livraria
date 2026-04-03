package BaseDeDados;

public class funcionario extends pessoa{

    private String cargo;

    public funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;

    }

    @Override
    public void exibirInfo() {
        System.out.println("Funcionário: " + getNome() + " | Cargo: " + cargo);
    }


}