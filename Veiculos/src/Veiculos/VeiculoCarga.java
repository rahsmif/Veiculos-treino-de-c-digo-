package Veiculos;

class VeiculoCarga extends Caminhao {
	    int numEixos;
	    int quantTanque;

    public VeiculoCarga(String marca, String modelo, int ano, double capacidadeCarga, int  numEixos, int quantTanque) {
        super(marca, modelo, ano, capacidadeCarga);
    }
    
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de Eixos: " + numEixos);
        System.out.println("Quantidade de Tanques disponíveis: " + quantTanque);
    }
}
