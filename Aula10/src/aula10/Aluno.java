package aula10;
public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;

    public void cancelarMatr() {
        this.setMatr(false);
    }
    
    public Aluno(String nome, String sexo, int idade, String curso) {
        super(nome, sexo, idade);
        this.matr = true;
        this.curso = curso;
    }

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
