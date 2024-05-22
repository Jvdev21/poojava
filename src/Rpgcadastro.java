public class Rpgcadastro {
/*    começando com uma classe base que inclua atributos como nome do jogador e saldo de moedas de ouro.
    Adicione métodos para ganhar moedas e consultar o saldo.
    Demonstre o funcionamento criando uma conta de jogador, ganhando moedas e imprimindo o saldo atual. Imagine que você está criando uma conta para um aventureiro em D&D.
*/
    private String nomedojogador;
    private String login;
    private String senha;
    private int saldoAtual;

    public Rpgcadastro(String nomedojogador, String login, int saldoAtual){
        this.nomedojogador = nomedojogador;
        this.login = login;
        this.saldoAtual = saldoAtual;

    }
    public  void imprimirinfos(){
        System.out.println("Seu login é: " + login);
        System.out.println("seu nome de exibição é" + nomedojogador);
        System.out.println("Seu saldo atual é : " + saldoAtual);

    }
    public void missoes(){
        System.out.printf("olá %s seja bem vindo, essas sao as missoes disponiveis\n",nomedojogador);
        System.out.println("mate dois npc");
        System.out.println("recompensa 50 gold\n");
        System.out.println("curta um jogador");
        System.out.println("reconmpensa 25 gold\n");

    }
    public void missoesconcluidas(){
        int sucesso = saldoAtual + 75;
        System.out.println("seu saldo atual é :"  +sucesso);

    }

    public String getNomedojogador() {
        return nomedojogador;
    }

    public void setNomedojogador(String nomedojogador) {
        this.nomedojogador = nomedojogador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
