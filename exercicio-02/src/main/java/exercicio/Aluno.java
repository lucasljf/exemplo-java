package exercicio;


public class Aluno {
    private int codigo;
    private String nome;
    private String endereco;
    
    
    Aluno(int c, String n) {
        this.codigo = c;
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }
    
    
}
