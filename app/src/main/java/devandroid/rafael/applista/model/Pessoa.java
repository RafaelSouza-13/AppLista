package devandroid.rafael.applista.model;

public class Pessoa {
    private long id;
    private String nome;
    private String sobrenome;
    private Curso curso;
    private String telefone;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, Curso curso, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome:'" + this.nome +" "+this.sobrenome + ", curso desejado" + this.curso.getCurso() + ", telefone:'" + this.telefone;
    }
}
