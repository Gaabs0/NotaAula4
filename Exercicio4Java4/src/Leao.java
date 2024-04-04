public class Leao extends Animal{
    private String pelo;


    public Leao (String classe, String locomocao, String pelo) {
        this.classe = classe;
        this.locomocao = locomocao;
        this.pelo = pelo;





    }

    public String getPelo() {
        return pelo;
    }
    public void exibirinformcoes(){
        System.out.println(classe);
        System.out.println(locomocao);
        System.out.println(pelo);




    }
}

