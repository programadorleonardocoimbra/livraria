package BaseDeDados;

public class cliente extends pessoa {

    //Herança

    public cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente: " + getNome() + " | CPF: " + getCpf());

    }
}
