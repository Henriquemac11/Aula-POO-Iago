public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private float quilometragem;
    private String tipoDeCombustivel;
    private boolean possuiArCondicionado;
    private boolean possuiCambioAutomatico;

    void buzinar() {
        System.out.println("BI-BI!!");
    }

    public static void main(String args[]) {
        Carro teste = new Carro();
        teste.buzinar();
    }
}
