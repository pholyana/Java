package ListaExercicio01;

public class testeprodutos {
	public static void main(String[] args) {
		Produtos produto01 = new Produtos();
		produto01.setNome("O MELHOR LIVRO ANTIFEMINISTA DO BRASIL , DA ANA CAMPGNOLO");
		produto01.setPreco(10);
		produto01.setQuantidadeestoque(10);
		System.out.println(produto01.getPreco());
		System.out.println(produto01.getNome());
		System.out.println(produto01.getQuantidadeestoque());
		
	}

	}


