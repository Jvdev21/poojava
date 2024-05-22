public class arma {
    private String nomedoitem;
    private String podermagico;

    public arma(String nomedoitem, String podermagico){
        this.nomedoitem =nomedoitem;
        this.podermagico = podermagico;
    }

    public String getNomedoitem() {
        return nomedoitem;
    }

    public void setNomedoitem(String nomedoitem) {
        this.nomedoitem = nomedoitem;
    }

    public String getPodermagico() {
        return podermagico;
    }

    public void setPodermagico(String podermagico) {
        this.podermagico = podermagico;
    }
}
