package heranca.abstrata;

public class HerancaAbstrata {

    public static void main(String[] args) {

        //Pessoa p = new Pessoa();
        //p.setnome("Felício da Silva");

        
        Aluno a1 = new Aluno();
        a1.setNome("Alex Kid Junior");
        a1.setProva1(20);
        a1.setProva2(40);
        //a1.autorizaAluno(a1);

        Professor p1 = new Professor();
        p1.setNome("William Hurt");
        p1.setSalario(1500);
        p1.autorizaAluno(a1);
        
        ResponsavelAluno ra = new ResponsavelAluno();
        ra.setNome("Aldebarã Gomes");
        ra.autorizaAluno(a1);
        
        
        
        
        a1.imprime();
        p1.imprime();

    }

}
