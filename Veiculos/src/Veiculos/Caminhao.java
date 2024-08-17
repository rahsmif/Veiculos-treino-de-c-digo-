package Veiculos;

class Caminhao extends Veiculo {
    double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga; 

    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }
}
