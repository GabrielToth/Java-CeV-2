package aula10;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAum(float a) {
        if (a >= 0) {
            this.setSalario(this.getSalario() + a);
            System.out.println("Aumento realizado com sucesso");
        }
    }
    
    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
