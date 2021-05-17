package aula10;
public class Funcionario extends Pessoa{
    //Variáveis
    private String setor;
    private boolean trabalhando;

    
    //Avulsos
    public void mudarTrabalho(String a) {
        this.setSetor(a);
    }
    
    
    //Construtor
    public Funcionario(String nome, String sexo, int idade, String setor) {
        super(nome, sexo, idade);
        this.setor = setor;
    }

    
    //Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
