public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara("azul","patas",32);

        System.out.println("Informações do Leao:");
        leao.exibirinformcoes();


        System.out.println("Informações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdovos());


    }
}