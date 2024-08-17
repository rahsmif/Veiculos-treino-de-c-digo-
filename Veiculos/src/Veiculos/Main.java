package Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2023, 4);
        VeiculoPasseio carroPasseio = new VeiculoPasseio("Volkswagen", "Gol", 2018, 4, 5, true);
        
        Moto moto = new Moto("Yamaha", "R1", 2023, 1000);
        VeiculoEsportivo motoEsportiva = new VeiculoEsportivo("Yamaha", "YZF-R1", 2023, 998, 200, 2);
        
        Caminhao caminhao = new Caminhao("Mercedes-Benz", "Actros", 2021, 10000);
        VeiculoCarga caminhaoCarga = new VeiculoCarga("Volvo", "FH16", 2022, 80, 6, 2);


        carro.imprimirInformacoes();
        System.out.println();
        carroPasseio.imprimirInformacoes();
        System.out.println();
        moto.imprimirInformacoes();
        System.out.println();
        motoEsportiva.imprimirInformacoes();
        System.out.println();
        caminhao.imprimirInformacoes();
        System.out.println();
        caminhaoCarga.imprimirInformacoes();
        System.out.println();
       
    }
}