package aula09;
public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    //Construtor
    public Livro(String t, String a, int p, Pessoa leitor) {
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotPaginas(p);
        this.setLeitor(leitor);
        this.setAberto(false);
    }
    
    
    //Avulsos
    public String detalhes() {
        return "\nTítulo: " + this.getTitulo() + "\nAutor: " + this.getAutor() 
                + "\nTotal de páginas: " + this.getTotPaginas() + "\nPágina atual: "
                +  this.getPagAtual() + "\nAberto? " + this.isAberto();
    }
    
    
    //Interface
    @Override
    public void abrir() {
        if (this.isAberto()) {} else {this.setAberto(true);}
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {} else {this.setAberto(false);}
    }

    @Override
    public void folhear(int a) {
        if (this.isAberto() && (this.getPagAtual() + a <= this.getTotPaginas())) {
            this.setPagAtual(this.getPagAtual() + a);
            System.out.println("Foram folheadas as páginas.");
        } else {
            System.out.println("Abra o livro e folheie somente uma quantia menor do que o total de páginas até seu final");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() < this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Pagina avançada.");
                System.out.println("Pagina atual: " + this.getPagAtual());
            } else {
                System.out.println("Você ja está na ultima página");
            }
        } else {
            System.out.println("Abra o livro antes de avançar alguma página.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() > 1) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Pagina retrocedida.");
                System.out.println("Pagina atual: " + this.getPagAtual());
            } else {
                System.out.println("Você ja está na primeira página");
            }
        } else {
            System.out.println("Abra o livro antes de retroceder alguma página.");
        }
    }

    
    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
}
