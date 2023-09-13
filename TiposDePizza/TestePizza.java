package TiposDePizza;

public class TestePizza {

	public static void main(String[] args) {
	    CoberturaPizza queijo = new CoberturaQueijo();
	    CoberturaPizza pepperoni = new CoberturaPepperoni();

	    Pizza pizzaMassaFina = new PizzaMassaFina(queijo);
	    Pizza pizzaMassaGrossa = new PizzaMassaGrossa(pepperoni);

	    pizzaMassaFina.fazerPizza();
	    pizzaMassaGrossa.fazerPizza();
	}

}
