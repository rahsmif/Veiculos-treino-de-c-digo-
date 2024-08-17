package Veiculos;

class Carro extends Veiculo {
    int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas; 

    }

	@Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de Portas: " + numPortas);
    }
}