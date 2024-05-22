public class cadastroCampeao {
    String nomedocampeao;
    private String rota;
    private String classe;
    public cadastroCampeao(String nomedocampeao, String rota, String classe){
        this.nomedocampeao = nomedocampeao;

        this.rota= rota;

        this.classe = classe;
    }

    public String getNomedocampeao() {
        return nomedocampeao;
    }

    public void setNomedocampeao(String nomedocampeao) {
        this.nomedocampeao = nomedocampeao;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}