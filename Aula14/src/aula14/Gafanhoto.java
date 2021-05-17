package aula14;
public class Gafanhoto extends Pessoa{
    private int login, totAssistido;

    public Gafanhoto(int login, int totAssistido) {
        this.login = login;
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
