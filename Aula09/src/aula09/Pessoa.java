package aula09;
public class Pessoa {
    private String nome, sexo;
    private int idade;
    
    
    //Avulsos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
    
    
    //Construtor
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    
    //Getters e setters
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
        if ((sexo == "M") ||(sexo == "m") ||(sexo == "F") ||(sexo == "f")) {
            this.sexo = sexo;
        }
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if ((idade >= 0) && (idade <= 150)) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }
    
    
}
