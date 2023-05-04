package exercicio07;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor" + this.autor);
        System.out.println("Ano:" + this.ano);
    }
}
