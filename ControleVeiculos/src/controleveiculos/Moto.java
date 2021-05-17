package controleveiculos;
public class Moto extends Automovel{
    private int multa;
    
    //Easter EGG
    public void darGrau() {
        System.out.println("BOLOLOLOLOLOLOLOLOLO");
    }

    public Moto(String modelo) {
        super(modelo);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Moto{" + "modelo=" + this.getModelo() + ", multa=" + multa + '}';
    }
}
