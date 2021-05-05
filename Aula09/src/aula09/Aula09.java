package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "f", 25);
        
        l[0] = new Livro("Senhor dos Anéis", "Eu mesmo", 1000, p[0]);
        l[1] = new Livro("Harry Potter e a Pedra Filosofal", "Eu de novo", 2000, p[0]);
        l[2] = new Livro("Num sei", "Esse num foi eu naum", 20, p[1]);
        
        l[0].abrir();
        l[0].avancarPag();
        l[0].folhear(500);
        System.out.println(l[0].detalhes());
        
        
    }
    
}
