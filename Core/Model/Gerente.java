package Core.Model;
import Core.Utils.Verificadata;

public class Gerente extends Funcionario {

    public Gerente(String cargo,  String nome, int mescontratacao, int anocontratacao) {
        super(cargo, nome, mescontratacao, anocontratacao);

    }

    
    public double calculaSalarioeBeneficio(int mes, int ano){
        
        int i = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double x = 20000.00 + (3000.00 * i);

        return x;
        
    }
    

    public double calculaSalario(int mes, int ano){

        int anosTrabalhados = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double salario = 20000.00 + (3000.00 * anosTrabalhados);

        return salario;
    }
    
}
