package exercicio08;

public class Funcionario {
    public String nome;
    public String cargo;
    public float salario;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo" + this.cargo);
        System.out.println("Salário:" + this.salario);
    }
}
