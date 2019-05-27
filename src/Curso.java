import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private Integer codigoCurso;
    private Integer numMaxAlunos;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public Curso(String nomeCurso, Integer codigoCurso, Integer numMaxAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.numMaxAlunos = numMaxAlunos;
    }

    @Override
    public boolean equals(Object outroCurso) {

        if (!(outroCurso instanceof Curso)) {
            return false;
        }

        if (((Curso) outroCurso).getCodigoCurso() == this.getCodigoCurso() &&
                ((Curso) outroCurso).getNomeCurso().equals(this.getNomeCurso())) {
            return true;
        }
        return false;
    }

        public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Integer getNumMaxAlunos() {
        return numMaxAlunos;
    }

    public void setNumMaxAlunos(Integer numMaxAlunos) {
        this.numMaxAlunos = numMaxAlunos;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if (listaDeAlunos.size() < numMaxAlunos){
            System.out.println("Você adicionou um aluno ao curso.");
            listaDeAlunos.add(umAluno);
            return true;
        }
        System.out.println("Curso sem vagas no momento");
        return false;
    }

    public void excluirAluno(Aluno umAluno){

        listaDeAlunos.remove(umAluno);

    }

}
