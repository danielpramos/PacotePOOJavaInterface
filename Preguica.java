package PacotePOOJavaInt;

public class Preguica extends AnimalSuper implements AnimalInterface 
{
	Preguica(String nome, String idade, String som, String caracteristica)
	{
		super(nome,idade,som,caracteristica);
		nomeClasse = "preguiça";
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
