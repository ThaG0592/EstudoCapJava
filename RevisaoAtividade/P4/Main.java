package P4;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.setMarca("Toyota");
        car.setModelo("RAV4");
        car.setAnoFabricacao(2020);
        car.setCor("Preto");
        car.setChassi("9BG116GW04C400001");
        car.setNumPortas(4);
        car.setCapPortamalas(600);
        car.setNumPassage(5);

        Caminhao cam = new Caminhao();
        cam.setMarca("Scania");
        cam.setModelo("R470");
        cam.setAnoFabricacao(2020);
        cam.setCor("Vermelho");
        cam.setChassi("9BG116GW04C400002");
        cam.setCapCarga(20000);
        cam.setAntt("167459/9867");
        cam.setTracao("Sim");
        cam.setSemirreboque("Não");

        System.out.println("*******Dados Carro******");
        System.out.printf("\nMarca:         %s", car.getMarca());
        System.out.printf("\nModelo:        %s", car.getModelo());
        System.out.printf("\nAno:           %d", car.getAnoFabricacao());
        System.out.printf("\nCor:           %s", car.getCor());
        System.out.printf("\nChassi:        %s", car.getChassi());
        System.out.printf("\nPortas:        %d", car.getNumPortas());
        System.out.printf("\nPortamalas L:  %d", car.getCapPortamalas());
        System.out.printf("\nPassageiros:   %d\n", car.getNumPassage());
   

        System.out.println("\n*****Dados Caminhão*****");
        System.out.printf("\nMarca:         %s", cam.getMarca());
        System.out.printf("\nModelo:        %s", cam.getModelo());
        System.out.printf("\nAno:           %d", cam.getAnoFabricacao());
        System.out.printf("\nCor:           %s", cam.getCor());
        System.out.printf("\nChassi:        %s", cam.getChassi());
        System.out.printf("\nCapacidade L:  %d", cam.getCapCarga());
        System.out.printf("\nANTT:          %s", cam.getAntt());
        System.out.printf("\nTrçao:         %s", cam.getTracao());
        System.out.printf("\nSemirreboque:  %s", cam.getSemirreboque());
    }
    
}


