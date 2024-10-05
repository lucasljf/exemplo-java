
package exercicio;

public class Turma {
    private String descricao;
    private Curso curso;
    
    Turma(String descricao, Curso curso) {
        this.descricao = descricao;
        this.curso = curso;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Curso getCurso() {
        return this.curso;
    }
    
    
}
