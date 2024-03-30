package TesteEstágio.Utils;


public class Verificadata {
    
    public static int diferencaAnos(int mescontratacao, int anocontratacao, int mes2, int ano2) {
        int diferencaAnos = Math.abs(ano2 - anocontratacao);

        
        if ((ano2 == anocontratacao) || (ano2 > anocontratacao && mes2 < mescontratacao)) {
            if(diferencaAnos == 0){
                diferencaAnos = Math.abs(ano2 - anocontratacao);
            }else{
                diferencaAnos--;
            }
        }

        return diferencaAnos;
    }
}
