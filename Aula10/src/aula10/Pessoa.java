package aula10;
public class Pessoa {
    private String nome, sexo;
    private int idade;

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Agora " + this.getNome() + " tem " + this.getIdade());
    }
    
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if ((idade <= 150) || (idade >= 0)) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
        
    }
    
    
    
}
