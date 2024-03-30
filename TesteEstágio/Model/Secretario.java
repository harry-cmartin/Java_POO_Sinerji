package TesteEstágio.Model;

import TesteEstágio.Utils.Verificadata;

public class Secretario extends Funcionario {
    
    
  
    public Secretario( String cargo, String nome, int mescontratacao, int anocontratacao) {
        super(cargo, nome, mescontratacao, anocontratacao);
    }


    public double calculaSalarioeBeneficio(int mes, int ano){
        
        int i = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double x = 7000.00 + (1000.00 * i);

        return x + (0.2 * x);
        
    }


    public double calculaSalario(int mes, int ano){

        int anosTrabalhados = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double salario = 7000.00 + (1000.00 * anosTrabalhados);

        
        return salario;
    }
    
    public double calculaBeneficios(int mes, int ano){

        int i = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double salario = 7000.00 + (1000.00 * i);

        return (0.2 * salario);
  
    }
}
