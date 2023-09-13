package TiposDePizza;

public class PizzaMassaGrossa extends Pizza {
    public PizzaMassaGrossa(CoberturaPizza cobertura) {
        super(cobertura);
    }

    @Override
    public void fazerPizza() {
        System.out.println("Preparando pizza de massa grossa com:");
        cobertura.adicionarCobertura();
    }
}

