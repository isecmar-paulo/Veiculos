package po.leit;

public class Veiculos {

    public static void main(String[] args) {

        // construct complete vehicles
        Veiculo hiace = new Veiculo(7, 16, 21);
        Veiculo desportivo = new Veiculo(2, 14, 12);
        double litros;
        int dist = 252;

        litros = hiace.combustivelnecessario(dist);

        System.out.println("Para ir " + dist + " kilometros hiace precisa " +
                litros + " litros de gasolina.");

        litros = desportivo.combustivelnecessario(dist);

        System.out.println("Para ir " + dist + " kilometros desportivo precisa " +
                litros + " litros de gasolina.");

    }

}
