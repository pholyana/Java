package ListaExercicio01;

public class Produtos {
		private	String nome;
		private	double preco;
		private	int quantidadeestoque;
		
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public double getPreco() {
				return preco;
			}
			public void setPreco(double preco) {
				this.preco = preco;
			}
			public int getQuantidadeestoque() {
				return quantidadeestoque;
			}
			public void setQuantidadeestoque(int quantidadeestoque) {
				this.quantidadeestoque = quantidadeestoque;
			}
			public void adicionarestoque(int qtd) {
				this.quantidadeestoque+= qtd;
			}
			public void removerEstoque(int qtd) {
				if (qtd >=quantidadeestoque) {
					this.quantidadeestoque-=qtd;
				}else {
					System.out.println("nao ha valor disponivel");
				}
			}
			
}
