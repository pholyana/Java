package Acabou;

public class competicao {
	public static void main(String[] args) {
		Corredor corredor01= new Corredor("pholyana",21);
		Nadador nadador01= new Nadador("mycha", 25);
		Ciclista ciclista01 = new Ciclista("agata", 23);
		nadador01.aquecer();
		nadador01.Nadar();
		corredor01.correr();
		corredor01.PararCorrer();
	}

}
