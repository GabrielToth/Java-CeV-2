package aula11;
public class Tecnico extends Aluno{
    private String registro;

    public void praticar() {
        System.out.println(this.nome + " está praticando.");
    }
    
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
