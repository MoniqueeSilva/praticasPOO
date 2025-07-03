import java.util.ArrayList;

public class SistemaCadastro {
    private ArrayList <Aluno> list; //variável list que é uma lista de objetos do tipo Aluno

    //construtor
    public SistemaCadastro(){
        list = new ArrayList<>();
    }

    //metódo de adicionar alunos na lista
    public void addAluno(Aluno aluno){
        list.add(aluno);
    }
    
    //metódo de listar todos os alunos que estão na lista 
    public void listarAlunos(){
        System.out.println("Lista de alunos: ");
        for (Aluno aluno : list){
            aluno.exibeInfo();
        }
    }

    //metódo para buscar algum aluno pelo número de sua matrícula
    public Aluno buscarAluno(int matricula){
        for(Aluno aluno : list){ //for-each: (tipo, nomeVariável, lista)
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null; //caso não encontrado
    }
}
