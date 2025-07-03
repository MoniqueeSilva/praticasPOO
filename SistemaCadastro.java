import java.util.ArrayList;

public class SistemaCadastro {
    private ArrayList <Aluno> list;

    public SistemaCadastro(){
        list = new ArrayList<>();
    }

    public void addAluno(Aluno aluno){
        list.add(aluno);
    }
    public void listarAlunos(){
        System.out.println("Lista de alunos: ");
        for (Aluno aluno : list){
            aluno.exibeInfo();
        }
    }

    public Aluno buscarAluno(int matricula){
        for(Aluno aluno : list){
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }
}
