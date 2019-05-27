import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeALunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaxAlunos){

        Curso curso1 = new Curso(nome, codigoCurso, quantidadeMaxAlunos);
        listaDeCursos.add(curso1);
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(codigoCurso);
        System.out.println("O curso foi removido com sucesso");
    }

    public void adicionarProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor,
                                          Integer codigoProfessor, Integer horasMonitoria){

        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto (nomeProfessor, sobrenomeProfessor, 0,
                                                            codigoProfessor, horasMonitoria);
        listaDeProfessores.add(professorAdjunto1);
    }

    public void adicionarProfessorTitular (String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor,
                                           String especialidade){

        ProfessorTitular professorTitular1 = new ProfessorTitular(nomeProfessor, sobrenomeProfessor, 0,codigoProfessor,
                                                                  especialidade);
        listaDeProfessores.add(professorTitular1);
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("O professor foi removido com sucesso");
    }

    public void registrarAluno (String nomeAluno, String sobrenomeAluno, Integer codigoAluno){
        Aluno aluno1 = new Aluno(nomeAluno, sobrenomeAluno, codigoAluno);
        listaDeALunos.add(aluno1);
    }
    public Aluno getAlunoPorCodigo(Integer codigoAluno){

        for (Aluno aluno : listaDeALunos) {
            if (aluno.getCodigoAluno().equals(codigoAluno)){
                return aluno;
            }
        }
        System.out.println("Nenhum aluno encontrado");
            return null;

    }

    public Curso getCursoPorCodigo(Integer codigoCurso){

        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoCurso().equals(codigoCurso)){
                return curso;
            }
        }
            return null;
    }

    public Professor getProfessorPorCodigo(Integer codigoProfessor){
    for (Professor professor : listaDeProfessores){
        if (professor.getCodigoProfessor().equals(codigoProfessor)){
            return professor;
        }
    }
    return null;
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

        Curso cursoencontrado = getCursoPorCodigo(codigoCurso);
        Aluno alunoencontrado = getAlunoPorCodigo(codigoAluno);


        if (cursoencontrado.adicionarUmAluno(alunoencontrado)){
            Matricula matricula = new Matricula(getAlunoPorCodigo(codigoAluno), getCursoPorCodigo(codigoCurso));
            listaDeMatriculas.add(matricula);
            System.out.println("O aluno foi matriculado com sucesso");
        }
        else{
            System.out.println("Não a vagas no curso");
        }
    }
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso cursoEncontrado = getCursoPorCodigo(codigoCurso);
        ProfessorTitular professorTitularEncontrado = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto professorAdjuntoEncontrado = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);

        cursoEncontrado.setProfessorTitular(professorTitularEncontrado);
        cursoEncontrado.setProfessorAdjunto(professorAdjuntoEncontrado);
    }

    public void alunoConsultarCurso(Integer codigoAluno){

        Aluno alunoEncontrado = getAlunoPorCodigo(codigoAluno);

        for (Curso curso : listaDeCursos) {
            for (Aluno aluno : curso.getListaDeAlunos()) {
                if (aluno.equals(alunoEncontrado)){
                    System.out.println("O aluno está matriculado no curso de: " + curso.getNomeCurso());
                    System.out.println("O nome do aluno é: " + aluno.getNomeAluno() + " " + aluno.getSobrenomeAluno());
                }
            }
        }

    }

}
