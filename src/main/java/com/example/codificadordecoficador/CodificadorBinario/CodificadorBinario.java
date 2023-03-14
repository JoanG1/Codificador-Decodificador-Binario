package com.example.codificadordecoficador.CodificadorBinario;

import com.example.codificadordecoficador.Algoritmo.Algoritmo;

public class CodificadorBinario extends Algoritmo {
    public CodificadorBinario(int i) {
        super(i);
    }

    public String codificador(String palabra) {

        String valorBinario = "";

        char[] caracteres = palabra.toCharArray();

        for (char i : caracteres) {

            valorBinario += convertidorBinario(algoritmoMDRIngreso(i)) +" ";

        }

        System.out.println(valorBinario);

        return valorBinario;
    }

    public String convertidorBinario(int i) {

        String valorBinario = "";

        for (int j = 0; j < 8; j++){

            if (i % 2 == 0) {

                valorBinario += 0;

            }else{

                valorBinario += 1;

            }

            i /= 2;

        }

        valorBinario = InvertirCadena(valorBinario);

        return valorBinario;
    }

    public static String InvertirCadena(String cadena) {

        String cadenaInvertida = "";

        for (int x = cadena.length() - 1; x >= 0; x--)

            cadenaInvertida = cadenaInvertida + cadena.charAt(x);

        return cadenaInvertida;
    }

}
