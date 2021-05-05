package aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[1] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        l[1].apresentar();
        
        l[2] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        l[2].apresentar();
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 13, 0, 2, 1.93f, 81.6f);
        l[3].apresentar();
        
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
        l[4].apresentar();
        
        l[5] = new Lutador("Nerdaard", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
        l[5].apresentar();
        
        Luta u = new Luta();
        u.marcarLuta(l[1], l[2]);
        u.lutar();
    }
}
