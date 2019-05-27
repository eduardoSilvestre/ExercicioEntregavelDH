public class ProfessorTitular extends Professor{

    private String especialidade;

    public ProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer tempoDeCasa, Integer codigoProfessor, String especialidade) {
        super(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
