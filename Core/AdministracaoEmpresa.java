package Core;

import java.util.List;

import Core.Model.*;

import java.util.ArrayList;

public class AdministracaoEmpresa {
    
    public static void main(String[] args) {

        List<Vendas> rue = new ArrayList<>();
        List<Vendas> aux = new ArrayList<>();
        //REGISTRO DE VENDAS ANA
        rue.add(new Vendas(12, 2021, "Ana Silva", 5200.00));
        rue.add(new Vendas(1, 2022, "Ana Silva", 4000.00));
        rue.add(new Vendas(2, 2022, "Ana Silva", 4200.00));
        rue.add(new Vendas(3, 2022, "Ana Silva", 5850.00));
        rue.add(new Vendas(4, 2022, "Ana Silva", 7000.00));
        //REGISTRO DE VENDAS JOÃO
        aux.add(new Vendas(12, 2021, "João Mendes", 3400.00));
        aux.add(new Vendas(1, 2022, "João Mendes", 7700.00));
        aux.add(new Vendas(2, 2022, "João Mendes", 5000.00));
        aux.add(new Vendas(3, 2022, "João Mendes", 5900.00));
        aux.add(new Vendas(4, 2022, "João Mendes", 6500.00));
        

    
        Funcionario abs = new Funcionario(null, null, 0, 0);
        Funcionario abs2 = new Funcionario(null, null, 0, 0);

        List<Funcionario> listadeFuncionarios = new ArrayList<>();
        Funcionario func = new Secretario("Secretario", "Jorge Carvalho", 1, 2018);
        listadeFuncionarios.add(func);

        Funcionario func2 = new Secretario("Secretario", "Maria Souza", 12, 2015);
        listadeFuncionarios.add(func2);

        Funcionario func3 = new Vendedor("Vendedor", "Ana Silva", 12, 2021,rue);
        listadeFuncionarios.add(func3);

        Funcionario func4 = new Vendedor("Vendedor", "João Mendes", 12, 2021,aux);
        listadeFuncionarios.add(func4);

        Funcionario func5 = new Gerente("Gerente", "Juliana Alves", 07, 2017);
        listadeFuncionarios.add(func5);

        Funcionario func6 = new Gerente("Gerente", "Bento Albino", 03, 2014);
        listadeFuncionarios.add(func6);

        Funcionario novo = new Funcionario(null, null, 0, 0);
      

        double x = abs.calculaTotaldoMes(listadeFuncionarios, 4, 2022);
        double y = abs2.calculaSomenteSalario(listadeFuncionarios, 4, 2022);
        double z = abs.calculaSomenteBeneficiosporMes(separaFuncionarios(listadeFuncionarios), 4, 2022);
    
        novo = maiorSalarionoMes(listadeFuncionarios, 4, 2022);

        String pessoaComMaisBeneficiosnoMes = maiorBeneficionoMes(separaFuncionarios(listadeFuncionarios), 4, 2022);
        Vendedor pessoaQueMaisVendeu = vendeuMais(separaVendedores(listadeFuncionarios), 4, 2022);

        
        System.out.println("\nVALOR TOTAL GASTO COM SALÁRIOS E BENEFÍCIOS NO MÊS: R$ " + x);
        System.out.println("VALOR GASTO SOMENTE COM SALÁRIOS NO MÊS (Sem benefícios): R$ "+ y);
        System.out.println("VALOR PAGO EM BENEFÍCIOS NO MÊS : R$ " + z);
        System.out.println("MAIOR SALARIO DO MÊS: " + novo.getNome() + " CARGO: " + novo.getCargo() + " CONTRATAÇÃO: "+ novo.getMescontratacao()+"/"+novo.getAnocontratacao());
        System.out.println("FUNCIONÁRIO COM MAIOR BENEFÍCIO DO MÊS: " + pessoaComMaisBeneficiosnoMes);
        System.out.println("FUNCIONÁRIO COM MAIS VENDAS NO MÊS: " + pessoaQueMaisVendeu.getNome() + " CONTRATAÇÃO: "+ pessoaQueMaisVendeu.getMescontratacao()+ "/"+ pessoaQueMaisVendeu.getAnocontratacao());



    }
    
    //Procura de acordo ao mês e ano qual vendeu vendeu mais
    //● Um método que receba uma lista de vendedores, mês e ano e retorne o que mais vendeu no mês.
    public static Vendedor vendeuMais(List<Vendedor> vendedores, int mes, int ano){

        List<Vendas> registro = new ArrayList<>();
        Vendedor novo = null;
        double maiorVenda = 0.0;
        double valorAtual = 0.0;


            for(Vendedor x : vendedores){
                registro = x.getVendas();

               for(Vendas c : registro){
                    valorAtual = c.getValor();
                    if(valorAtual > maiorVenda && c.getMesdavenda() == mes && c.getAnodavenda() == ano){
                        
                        maiorVenda = valorAtual;
                        novo = x;
                    }
                
               }
               registro = null;

            }

        return novo;
    }

    //De acordo ao mes e ano, calcula o salario + benefio e retorna o maior
    //● Um método que receba uma lista de funcionários, mês e ano e retorne o que recebeu o valor mais alto no mês. 
    public static Funcionario maiorSalarionoMes(List<Funcionario> funcionarios, int mes, int ano){

        Funcionario pessoaMaiorSalario = null;
        double maiorValor = 0.0;

            for(Funcionario func : funcionarios){
                double salarioAtual = func.calculaSalarioeBeneficio(mes, ano);
                if(salarioAtual > maiorValor){
                    maiorValor = salarioAtual;
                    pessoaMaiorSalario = func;
                }

            }
        
        return pessoaMaiorSalario;

    }

    //De acordo ao mes e ano, calcula o beneficio dos funcionarios que recebem beneficio e retorna o nome do que recebeu mais
    //● Um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor mais alto em benefícios no mês. 
    public static String maiorBeneficionoMes(List<Funcionario> funcionarios,int mes, int ano){

        Funcionario pessoaMaiorBeneficio= null;
        double maiorValor = 0.0;

            for(Funcionario func : funcionarios){
                double beneficioAtual = func.calculaBeneficios(mes, ano);
                if(beneficioAtual > maiorValor){
                    maiorValor = beneficioAtual;
                    pessoaMaiorBeneficio = func;
                }

            }
        
        return pessoaMaiorBeneficio.getNome();

    }

    //Função auxiliar para separar os funcionarios que recebem beneficio dos que não recebem
    public static List<Funcionario> separaFuncionarios(List<Funcionario> funcs) {
        
        List<Funcionario> FuncsComBeneficios = new ArrayList<>();

            for(Funcionario x : funcs){
                
                if(x instanceof Vendedor || x instanceof Secretario){
                    
                    FuncsComBeneficios.add(x);

                }
            }
        

        return FuncsComBeneficios;
        
    }
    //Função auxiliar para separar os vendedores dos demais funcionarios
    public static List<Vendedor> separaVendedores(List<Funcionario> funcs) {
        
        List<Vendedor> vendedores = new ArrayList<>();

            for(Funcionario x : funcs){
                
                if(x instanceof Vendedor){
                    
                    vendedores.add((Vendedor) x);

                }
            }
        

        return vendedores;
        
    }

}
