package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru b = new Canguru();
        Cachorro c = new Cachorro();
        Cobra d = new Cobra();
        Tartaruga e = new Tartaruga();
        Goldfish f = new Goldfish();
        Arara g = new Arara();
        
        a.locomover();
        p.locomover();
        r.locomover();
        m.locomover();
        
        b.emitirSom();
        c.emitirSom();
        d.locomover();
        e.locomover();
        f.alimentar();
        g.alimentar();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
