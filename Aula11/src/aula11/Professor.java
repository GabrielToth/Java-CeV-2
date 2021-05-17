package aula11;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float a) {
        if (a > 0) {
            this.setSalario(this.getSalario() + a);
            System.out.println("Salário Atual: " + this.getSalario());
        } else {
            System.out.println("Aumento inválido");
        }
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
