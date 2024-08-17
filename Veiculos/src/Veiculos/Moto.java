package Veiculos;

class Moto extends Veiculo {
    int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

	@Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindrada: " + cilindrada);
    }
}