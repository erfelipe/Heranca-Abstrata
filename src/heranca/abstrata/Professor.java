
package heranca.abstrata;

public class Professor extends Pessoa implements Autorizacao {
    
    private String inscricao; 
    private double salario;

    /**
     * @return the inscricao
     */
    public String getInscricao() {
        return inscricao;
    }

    /**
     * @param inscricao the inscricao to set
     */
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        
        System.out.println("Nome do Professor: " + getNome());
        System.out.println("Salário do Professor: " + getSalario());
        
    }

    @Override
    public boolean autorizaAluno(Aluno a) {
        //faz algum acesso ao banco de dados
        return true;
    }
    
    
    
}
