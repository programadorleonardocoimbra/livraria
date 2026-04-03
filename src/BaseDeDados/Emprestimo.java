package BaseDeDados;

public class Emprestimo {

    private static cliente  cliente;
    private static Livro livro;

    public Emprestimo(cliente cliente, Livro livro) {
        this.cliente = cliente;
        this.livro = livro;

    }

    public static void realizarEmprestimo() {
        System.out.print("Realizando empréstimo para " + cliente.getNome());
        livro.emprestar();
    }

    public static void finalizarEmprestimo() {
        System.out.print("Finalizando empréstimo de: " + cliente.getNome());
        livro.devolver();
    }
}
