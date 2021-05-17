package aula12;
public class Reptil extends Animal {
    private String corEscama;
    
    @Override
    public void alimentar() {
        System.out.println("Comento Vegetais");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
}
