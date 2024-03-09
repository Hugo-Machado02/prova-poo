class Livro {
    private String isbn;
    private String titulo;
    private String autores;
    private int anoPublicacao;
    private boolean disponibilidade;

    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Livro(String isbn, String titulo, String autores, int anoPublicacao){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    public boolean emprestimo(){
        if(this.disponibilidade == true){
            this.disponibilidade = false;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean devolucao(){
        if(disponibilidade == false) {
            this.disponibilidade = true;
            return true;
        }
        else{
            return false;
        }
    }
}
