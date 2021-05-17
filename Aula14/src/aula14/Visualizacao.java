package aula14;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(float nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(int porc) {
        if ((porc >= 0) && (porc <= 100)) {
            this.filme.setAvaliacao(porc);
        } else {
            System.out.println("Porcentagem Inválida");
        }
    }
}
