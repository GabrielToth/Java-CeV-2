package aula03;
public class Caneta {
    //Variáveis
    public String modelo;
    public String cor;
    protected int carga;
    private float ponta;
    protected boolean tampada;
    
    //Métodos
    public void status() {
        System.out.println("Caneta " + this.cor + " de ponta " + this.ponta + this.tampada);
    }
    
    public void pintar() {
        if (tampada) {
            System.out.println("Erro");
        } else {
            System.out.println("Pintar");
        } 
    }
    
    public void escrever() {
        if (tampada) {
            System.out.println("Erro");
        } else {
            System.out.println("Escrevendo");
        } 
    }
    
    public void rasbiscar() {
        if (tampada) {
            System.out.println("Erro");
        } else {
            System.out.println("Rasbico");
        }
    }

    public Caneta(String modelo, String cor, int carga, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.carga = carga;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public Caneta() {
        this.modelo = "Bic";
        this.cor = "Azul";
        this.carga = 100;
        this.ponta = 0.5f;
        this.setTampada(true);
    }

    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
}
