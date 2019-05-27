public class ProfessorAdjunto extends Professor{

    private Integer horasMonitoria;

    public ProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer tempoDeCasa,
                            Integer codigoProfessor, Integer horasMonitoria) {
        super(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
