public class Santander implements Banco {

    private double valor;

    public Santander() {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public void sacar(double valor) { System.out.println("Valor sacado: R$" + valor);}
}