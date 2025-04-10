package Core.Model;


import java.util.List;

import Core.Utils.*;



public class Vendedor extends Funcionario {
    
    private List<Vendas> pacotes;

    public Vendedor(String cargo, String nome, int mescontratacao, int anocontratacao,List<Vendas> pacotes) {
        super(cargo, nome, mescontratacao, anocontratacao);
        this.pacotes = pacotes;
    }

    public void addvenda(Vendas venda) {
        pacotes.add(venda);
        
    }

    public List<Vendas> getVendas() {
        return pacotes;
    }

    public void setVendas(List<Vendas> vendas) {
        this.pacotes = vendas;
    }

    public double calculaSalarioeBeneficio(int mes, int ano){
        
        double valor = 0.0;
        

        for(Vendas b: pacotes){
            if(b.getAutor().equals(this.getNome()) && b.getMesdavenda() == mes && b.getAnodavenda() == ano){
                valor = 0.3 * b.getValor();
            }
        }
        

        int difereano = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(),mes,ano);
        
        return 12000.00 +(1800.00 * difereano) + valor;
    }

    public double calculaSalario(int mes, int ano){

        int anosTrabalhados = Verificadata.diferencaAnos(this.getMescontratacao(),this.getAnocontratacao(), mes, ano);
        double salario = 12000.00 + (1800.00 * anosTrabalhados);

        return salario;
    }

    public double calculaBeneficios(int mes, int ano){

        double beneficio = 0.0;
        
        for(Vendas b: pacotes){
            if(b.getAutor().equals(this.getNome()) && b.getMesdavenda() == mes && b.getAnodavenda() == ano){
                beneficio = 0.3 * b.getValor();
            }
        }

        return beneficio;

    }




  

}
