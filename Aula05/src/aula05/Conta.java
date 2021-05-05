package aula05;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;
    
    
    //Some methods
    public void abrirConta(String t) {
        if ((t == "cc") || (t == "cp")) {
            this.setTipo(t);
            this.setStatus(true);
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
            this.setStatus(false);
        }
    }
    
    public void depositar(float d) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + d);    
        } else {
            System.out.println("Conta Não está aberta.");
        }
        
    }
    
    public void sacar(float s) {
        if (this.isStatus()) {
            if (s > this.getSaldo()) {
                System.out.println("Transação de Saque INVÁLIDA");
            } else {
                this.setSaldo(this.getSaldo() - s);
            }   
        }
    }
    
    public void pagarMensal() {
        float a = 0;
        if (this.getTipo() == "cp") {
            a = -12;
        } else {
            a = -20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > a) {
                this.setSaldo(this.getSaldo() - a);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            
        }
        
    }

    
    //Contructor
    public Conta(int numConta, String dono) {
        this.saldo = 0;
        this.status = false;
    }

    
    //Getters and Setters
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
