package Leitura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeitorTecladoBasico implements LeitorTeclado {
    @Override
    public String lerEntrada() throws IOException {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        return leitor.readLine();
    }
}
