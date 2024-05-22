public class botamagica extends arma{
    private String atributo;
    private String raridade;
    public botamagica(String nomedoitem, String podermagico, String raridade, String atributo) {
        super(nomedoitem, podermagico);
        this.raridade = raridade;
        this.atributo =atributo;

    }
    public void  habilidadesunica(){
        System.out.printf("As habilidades unico do %s é", getNomedoitem() );
        System.out.println("Bota Alada pode conceder ao usuário habilidades especiais além de voo e super velocidade");
        System.out.println("Super Força: Aumento da força física do usuário, permitindo que ele levante objetos pesados ou realize feitos de força bruta.");
        System.out.println("Resistência Aprimorada: Maior resistência a danos físicos, como golpes, cortes ou quedas.");
    }
    public void imprimirtelabota(){
        System.out.println(getNomedoitem());
        System.out.println(getPodermagico());
        System.out.println(raridade);
        System.out.println(atributo);
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}
