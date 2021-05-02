package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.setPonta(0.5f);
        c1.setTampada(false);
        c1.status();
        
        Caneta c2 = new Caneta("Bic", "Preta", 70, 0.7f, false);
        c2.status();
    }
}
