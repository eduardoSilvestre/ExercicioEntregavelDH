public abstract class Professor {

    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;

    public Professor(String nomeProfessor, String sobrenomeProfessor,Integer tempoDeCasa, Integer codigoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public boolean equals(Object outroProfessor) {

        if (!(outroProfessor instanceof Professor)) {
            return false;
        }

        if (((Professor) outroProfessor).getCodigoProfessor() == this.getCodigoProfessor() &&
                ((Professor) outroProfessor).getNomeProfessor().equals(this.getNomeProfessor())) {
            return true;
        }
        return false;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
