package TiposDePizza;

public abstract class Pizza {
    protected CoberturaPizza cobertura;

    public Pizza(CoberturaPizza cobertura) {
        this.cobertura = cobertura;
    }

    public abstract void fazerPizza();
}

