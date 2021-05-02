package aula05;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;
    
    public void abrirConta(String t) {
        if ((t == "cc") || (t == "cp")) {
            this.setTipo(t);
            this.setStatus("Aberta");
            if (t == "cp") {
                this.saldo = 150;
            } else if (t == "cc"){
                this.saldo = 50;
            }
        } else {
            System.out.println("Tipo inválido");
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus("Fechado");
        }
    }
    
    public void depositar(float d) {
        this.setSaldo(this.getSaldo() + d);
    }
    
    public void sacar(float s) {
        if (s > this.getSaldo()) {
            System.out.println("Transação de Saque INVÁLIDA");
        } else {
            this.setSaldo(this.getSaldo() - s);
        }
    }
    
    public void pagarMensal() {
        if (this.getTipo() == "cp") {
            this.setSaldo(this.getSaldo() - 20);
        } else {
            this.setSaldo(this.getSaldo() - 12);
        }
    }

    public Conta(int numConta, String dono) {
        this.saldo = 0;
        this.status = "Fechado";
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
