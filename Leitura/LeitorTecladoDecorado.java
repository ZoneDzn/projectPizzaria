package Leitura;

import java.io.IOException;

public class LeitorTecladoDecorado implements LeitorTeclado {
	private LeitorTeclado leitor;

	public LeitorTecladoDecorado(LeitorTeclado leitor) {
		this.leitor = leitor;
	}

	@Override
	public String lerEntrada() throws IOException {
		String entrada = leitor.lerEntrada();
		// Aqui você pode adicionar funcionalidades extras à leitura do teclado, se
		// necessário.
		return entrada;
	}
}
