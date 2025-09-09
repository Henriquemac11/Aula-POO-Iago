package exemplos;

public class Pessoa {
	private String nome = "Henrique Maciel";
    private String trabalho = "Desenvolvedor";
    private float altura = 170;
    
    
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    System.out.println("O nome da pessoa é: " + p.nome);
    System.out.println("A altura é: "+ p.altura);
    System.out.println("E trabalha como: " + p.trabalho);
    

}
}
