
public class Cachorro {
	private String nome;
	private int idade;
	private String sexo;
	private String raca;
	
	void latir() {
		System.out.println("Au, Au!!");
	
	}
	
	public static void main(String[] args) {
		Cachorro teste = new Cachorro();
		teste.latir();

	}
}
