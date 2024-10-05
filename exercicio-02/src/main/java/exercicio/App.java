package exercicio;

public class App {
    public static void main(String[] args) {
        //instanciar todas as classes criadas
            Aluno a1 = new Aluno(100, "Fulano");
            Aluno a2 = new Aluno(200, "Ciclano");
            
            a1.setNome("Lucas");
            
            Curso c1 = new Curso("Sistemas", 8);
            Curso c2 = new Curso("Zootecnia", 10);
            
            Turma t1 = new Turma("2o periodo", c1);
            
            Matricula m1 = new Matricula(20241, a1, t1);
            Matricula m2 = new Matricula(20242, a2, t1);
        
        //imprimir tudo que conseguir
        System.out.println(m1.getAluno().getNome());
        System.out.println(m1.getTurma().getDescricao());
        System.out.println(m1.getTurma().getCurso().getNome());
    }
}
