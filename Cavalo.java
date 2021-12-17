package PacotePOOJavaInt;

public class Cavalo extends AnimalSuper implements AnimalInterface
{
	Cavalo(String nome, String idade, String som, String caracteristica)
	{
		super(nome,idade,som,caracteristica);
		nomeClasse = "cavalo";
	}
	
	@Override
	public String getNome(){
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getSom() {
		return som;
	}
	public String getCaracteristica() {
		return caracteristica;
	}

}
