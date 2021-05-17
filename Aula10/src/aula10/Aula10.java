package aula10;
public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", "Masculino", 19);
        Aluno p2 = new Aluno("José", "Neutro", 22, "ADS");
        Professor p3 = new Professor("Maria", "Trans", 43, "Letras", 8500.0f);
        Funcionario p4 = new Funcionario("Stephany", "Feminino", 17, "Cargas");
        
        p1.getNome();
        p2.cancelarMatr();
        p3.fazerAniver();
        p4.mudarTrabalho("Fazendeira");
    }
    
}
