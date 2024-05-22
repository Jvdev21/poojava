public class cajadovazio extends  arma{
    private  String atributo;
    private  String raridade;
    public cajadovazio(String nomedoitem, String podermagico, String atributo, String raridade){
        super(nomedoitem, podermagico);
        this.atributo = atributo;
        this.raridade = raridade;
    }
    public void habilidaunica(){
        System.out.println("As habilidades uinicas do " + getNomedoitem() + " sao: \n");
        System.out.println("Manipulando o Vazio: A equipe poderia aproveitar o poder do Vazio, um reino do nada, para criar efeitos poderosos como teletransporte, portais ou explosões de energia.");
        System.out.println("\nInvocando Criaturas: A equipe pode invocar criaturas do Vazio para ajudar o usuário na batalha ou realizar outras tarefas.");
        System.out.println("\nPrevendo o Futuro: A equipe poderia conceder ao usuário vislumbres do futuro, permitindo-lhes tomar decisões informadas.");

    }
    public void imprimirtela(){
        System.out.println(getNomedoitem());
        System.out.println(getPodermagico());
        System.out.println(atributo);
        System.out.println(raridade);
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
