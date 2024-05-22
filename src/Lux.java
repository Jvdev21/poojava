public class Lux extends cadastroCampeao{
    private String passiva;
    private String calter;

    public Lux(String nomedocampeao, String rota, String classe, String calter){
        super(nomedocampeao, rota, classe);
        this.calter =calter;



    }
    public void imprimirela(){
        System.out.println(getNomedocampeao());
        System.out.println(getRota());
        System.out.println(getClasse());
        System.out.println(calter);
        System.out.println("Passiva: Iluminação\n");
        System.out.println("As habilidades de Lux marcam o alvo com energia luminosa por 6s. Ao atacar o inimigo marcado, Lux incendeia a energia, causando dano mágico com base no seu nível.");

    }
    public  void  luxatck(){
        System.out.println(getNomedocampeao() + " elimnou o garen");
    }

}