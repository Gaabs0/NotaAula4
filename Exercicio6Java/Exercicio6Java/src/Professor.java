public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome,idade);
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return  idade ;
    }

    public double getSalario() {
        return salario;
    }

}
