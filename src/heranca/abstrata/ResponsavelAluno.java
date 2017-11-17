package heranca.abstrata;

public class ResponsavelAluno extends Pessoa implements Autorizacao{

    private String tipoResponsavel;
    private String matAluno;
    private String telContato;

    
    @Override
    public void imprime() {
        System.out.println("Responsável: " + getNome() );
    }

    /**
     * @return the tipoResponsavel
     */
    public String getTipoResponsavel() {
        return tipoResponsavel;
    }

    /**
     * @param tipoResponsavel the tipoResponsavel to set
     */
    public void setTipoResponsavel(String tipoResponsavel) {
        this.tipoResponsavel = tipoResponsavel;
    }

    /**
     * @return the matAluno
     */
    public String getMatAluno() {
        return matAluno;
    }

    /**
     * @param matAluno the matAluno to set
     */
    public void setMatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    /**
     * @return the telContato
     */
    public String getTelContato() {
        return telContato;
    }

    /**
     * @param telContato the telContato to set
     */
    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    @Override
    public boolean autorizaAluno(Aluno a) {
        //consulta do banco de dados
        return true;
    }
    
}
