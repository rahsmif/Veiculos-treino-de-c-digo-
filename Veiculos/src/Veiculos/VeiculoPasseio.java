package Veiculos;

class VeiculoPasseio extends Carro {
	   int numPassageiros;
	   boolean arCondicionado;

    public VeiculoPasseio(String marca, String modelo, int ano, int numPortas, int numPassageiros,boolean arCondicionado) {
        super(marca, modelo, ano, numPortas);
    }
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de passageiros: " + numPassageiros);
        System.out.println("Ar condicionado: " + arCondicionado);
    }
}
