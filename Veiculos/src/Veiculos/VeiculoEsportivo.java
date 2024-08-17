package Veiculos;

class VeiculoEsportivo extends Moto {
	    int potencia;
	    int numPassageiros;

    public VeiculoEsportivo(String marca, String modelo, int ano, int cilindrada, int potencia, int numPassageiros) {
        super(marca, modelo, ano, cilindrada);
    }
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de passageiros: " + numPassageiros);
        System.out.println("Potencia do motor: " + potencia);
    }
}
