import BaseDeDados.Emprestimo;
import BaseDeDados.Livro;
import BaseDeDados.cliente;
import BaseDeDados.funcionario;

public class ProgramaStart {
    public static void main(String[] args) {

        cliente cliente1 = new cliente("Ana Silva", "123.456.789-00");
        funcionario funcionario1 = new funcionario("Leonardo Coimbra de Paiva", "149610037-94", "Bibliotecário");


        Livro livro1 = new Livro("TROPA DE ELITE 2", "Diretor Jose Padilha");

        cliente1.exibirInfo();
        funcionario1.exibirInfo();

        Emprestimo emprestimo =  new Emprestimo(cliente1, livro1);
        Emprestimo.realizarEmprestimo();
        Emprestimo.finalizarEmprestimo();


    }
}
