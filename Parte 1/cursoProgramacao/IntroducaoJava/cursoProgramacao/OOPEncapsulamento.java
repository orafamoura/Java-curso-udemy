package cursoProgramacao;

public class OOPEncapsulamento {

	//IMPLEMENTACAO DE GETTERS E SETTERS
	private String name; // nao deve expor nenhum atributo se usa o private;
	private double price; //nao pode ser acessado por outra classe;
	
	
	//por convencao sao colocados depois dos construtores
	
	public String getName() { //acessa o nome do produto;
		return name;
	}
	public void setName(String name) { //altera o valor do atributo;
		this.name = name;
	}
	public double getPrice() { //acessa o nome do produto;
		return price;
	}
	public void setPrice(double price) { // altera o valor do atributo;
		this.price = price;
	}
}
