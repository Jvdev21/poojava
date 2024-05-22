public class Heroi {
    /*Desafio 1: Cadastro de Super-Heróis

Crie uma estrutura que permita armazenar informações sobre um super-herói, incluindo seu nome e nível de poder.
Implemente métodos para definir e obter essas informações.
Crie um exemplo prático onde você cria um super-herói, define suas informações e as imprime. Pense em heróis como Superman ou Mulher-Maravilha.*/

    private String nomePessoal;
    private int idade;
    private String nomeHero;
    private String poderDoHeroi;

    public Heroi(String nomePessoal, int idade, String nomeHero, String poderDoHeroi) {
        this.idade = idade;
        this.nomeHero = nomeHero;
        this.poderDoHeroi = poderDoHeroi;
        this.nomePessoal = nomePessoal;
    }
    public void atckdoheroi(){
        System.out.printf("o %s usou %s ",nomeHero,poderDoHeroi);
    }
    public void print(){
        System.out.println("seu nome é " + nomePessoal);
        System.out.println("sua idade é " + idade);
        System.out.println("seu nome de heroi é " + nomeHero);
        System.out.println("seu nome de poder é " + poderDoHeroi);

    }

    public String getNomePessoal() {
        return nomePessoal;
    }

    public void setNomePessoal(String nomePessoal) {
        this.nomePessoal = nomePessoal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeHero() {
        return nomeHero;
    }

    public void setNomeHero(String nomeHero) {
        this.nomeHero = nomeHero;
    }

    public String getPoderDoHeroi() {
        return poderDoHeroi;
    }

    public void setPoderDoHeroi(String poderDoHeroi) {
        this.poderDoHeroi = poderDoHeroi;
    }
}
