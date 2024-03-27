import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Professor p = new Professor("ana",50, 10000.00);
        Aluno a = new Aluno("joao", 7, 123);



        System.out.println("Dados do professor");


        System.out.println("nome  do professor:" +p.nome);

        System.out.println("Idade do professor:" + p.idade);

        System.out.println("salario do professor:" + p.getSalario());



        System.out.println("Dados do aluno" );

        System.out.println("Nome do aluno:" + a.nome);

        System.out.println("Idade do aluno:" + a.idade);

        System.out.println("matricula do aluno:" + a.getMatricula());

































    }












}
