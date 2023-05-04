package exercicio10;

public class Cliente {
    public String nome;
    public String endereco;
    public String telefone;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço" + this.endereco);
        System.out.println("Telefone:" + this.telefone);
    }
}
