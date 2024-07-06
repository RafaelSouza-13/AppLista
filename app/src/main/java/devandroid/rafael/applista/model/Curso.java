package devandroid.rafael.applista.model;

public class Curso {
    private long id;
    private String curso;

    public Curso(){

    }

    public Curso(long id, String curso) {
        this.id = id;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Curso: '" + this.curso;
    }
}
