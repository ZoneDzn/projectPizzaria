package TiposDePizza;

public class PizzaMassaFina extends Pizza {
    public PizzaMassaFina(CoberturaPizza cobertura) {
        super(cobertura);
    }

    @Override
    public void fazerPizza() {
        System.out.println("Preparando pizza de massa fina com:");
        cobertura.adicionarCobertura();
    }
}

