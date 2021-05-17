package aula12;
public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave Pru pru piu piu");
    }
    
}
