package Core.Model;

import java.util.List;

public class Funcionario {
    
    
    private String cargo;
    private String nome;
    private int mescontratacao;
    private int anocontratacao;
    
    public Funcionario(String cargo, String nome, int mescontratacao, int anocontratacao) {
        this.cargo = cargo;
        this.nome = nome;
        this.mescontratacao = mescontratacao;
        this.anocontratacao = anocontratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMescontratacao() {
        return mescontratacao;
    }
    public void setMescontratacao(int mescontratacao) {
        this.mescontratacao = mescontratacao;
    }
    public int getAnocontratacao() {
        return anocontratacao;
    }
    public void setAnocontratacao(int anocontratacao) {
        this.anocontratacao = anocontratacao;
    }


    //● Um método que receba uma lista de funcionários, mês e ano e retorne o valor total 
    //  pago (salário e benefício) a esses funcionários no mês.
    public double calculaTotaldoMes( List<Funcionario> funcionarios, int mes, int ano){

        double total = 0;
        

        for(Funcionario funcs : funcionarios){

            if(funcs instanceof Vendedor){
                
                total += ((Vendedor)funcs).calculaSalarioeBeneficio(mes, ano);
                
            }else{
                
                total+= funcs.calculaSalarioeBeneficio(mes, ano);
            }
        }
        return total;
    }

    //● Um método que receba uma lista de funcionários, mês e ano e retorne o total pago 
    //  somente em salários no mês. 
    public double calculaSomenteSalario(List<Funcionario> funcionarios, int mes, int ano){

        double totalSalarios = 0;

        for(Funcionario funcs : funcionarios){
   
            totalSalarios += funcs.calculaSalario(mes, ano);
            
        }


        return totalSalarios;
    }
    //● Um método que receba uma lista somente com os funcionários que recebem benefícios, 
    //  mês e ano e retorne o total pago em benefícios no mês. 
    public double calculaSomenteBeneficiosporMes(List<Funcionario> funcionarios,int mes, int ano){

        double totalBeneficios = 0;

        for(Funcionario funcs : funcionarios){

            totalBeneficios += funcs.calculaBeneficios(mes, ano);

        }

        return totalBeneficios;
    }


    //Metodo polimorfico
    public double calculaSalarioeBeneficio(int mes, int ano){
        
        return 0.0;
    }
    //Metodo polimorfico
    public double calculaSalario(int mes, int ano){


        return 0.0;
    }
    //Metodo polimorfico
    public double calculaBeneficios(int mes, int ano){


        return 0.0;
    }
  

}
