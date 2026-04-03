package BaseDeDados;

public class Livro implements emprestavel {
    private static String titulo;
    private final String autor;
    private static boolean emprestado;

    public Livro(String titulo, String autor) {
        Livro.titulo = titulo;
        this.autor = autor;
        emprestado = false;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isEmprestado() { return emprestado; }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
        } else {
            System.out.println("Este livro não estava emprestado.");
        }
    }
}