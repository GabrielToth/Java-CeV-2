package aula07;
public class Lutador {
    //Variáveis
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    
    //Métodos
    public void apresentar() {
        this.setCategoria();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    
    public void status() {
        this.setCategoria();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Categoria: " + this.getCategoria());
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        System.out.println(this.getNome() + " venceu e soma " + this.getVitorias() + " vitórias.");
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
        System.out.println(this.getNome() + " empatou e soma " + this.getEmpates() + " empates.");
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
        System.out.println(this.getNome() + " perdeu e soma " + this.getDerrotas() + " derrotas.");
    }
    
    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.peso = peso;
        this.setCategoria();
    }
   
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2f) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
