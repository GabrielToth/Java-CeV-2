package aula11;
public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); - A classe é abstrata, portanto não pode criar um objeto.
        Visitante p2 = new Visitante();
        p2.setNome("João"); p2.setSexo("Masculino"); p2.setIdade(19);
        System.out.println(p2.toString());
        
        Aluno a = new Aluno();
        a.setNome("Jorge"); a.setSexo("Masculino"); a.setIdade(22);
        a.setCurso("ADS"); a.setMatr(99);
        a.pagarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setNome("Marcia"); b.setSexo("Feminino"); b.setIdade(56);
        b.setCurso("Medicina"); b.setMatr(96);
        b.pagarMensalidade();
        
        Professor p = new Professor();
        p.setNome("Marcia"); p.setSexo("Feminino"); p.setIdade(56);
        p.setEspecialidade("Matemática"); p.setSalario(5000.9f);
        p.receberAumento(999);
        
        Tecnico t = new Tecnico();
        t.setNome("Marcia"); t.setSexo("Feminino"); t.setIdade(56);
        t.setCurso("Medicina"); t.setMatr(96);
        t.pagarMensalidade();
    }
}
