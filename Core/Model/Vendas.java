package Core.Model;

public class Vendas {
    
    private int mesdavenda;
    private int anodavenda;
    private String autor;
    private double valor;

    public Vendas(int mesdavenda, int anodavenda, String autor, double valor) {
        this.mesdavenda = mesdavenda;
        this.anodavenda = anodavenda;
        this.autor = autor;
        this.valor = valor;
    }

    public int getMesdavenda() {
        return mesdavenda;
    }

    public void setMesdavenda(int mesdavenda) {
        this.mesdavenda = mesdavenda;
    }

    public int getAnodavenda() {
        return anodavenda;
    }

    public void setAnodavenda(int anodavenda) {
        this.anodavenda = anodavenda;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

    

    
}
