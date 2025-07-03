public class Aluno{
    //atributos
    private String nome, curso;
    private int matricula;

    //construtor 
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    //métodos get
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public int getMatricula(){
        return matricula;
    }

    //métodos set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    //método para exibir informações dos alunos
    public void exibeInfo(){
        System.out.println("== INFORMAÇÕES DO ALUNO(A) ==");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        
    }
}