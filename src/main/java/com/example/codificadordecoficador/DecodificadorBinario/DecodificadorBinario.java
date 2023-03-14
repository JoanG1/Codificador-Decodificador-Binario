package com.example.codificadordecoficador.DecodificadorBinario;

import com.example.codificadordecoficador.Algoritmo.Algoritmo;

public class DecodificadorBinario extends Algoritmo {


    public DecodificadorBinario(int i) {
        super(i);
    }

    public String Decodificador (String valorBinarioCompleto ){

        String [] valorBinario = valorBinarioCompleto.split(" ");
        String Archivo = "";

        for (int i = 0; i<valorBinario.length ; i++){

            Archivo += (char)algoritmoMDRSalida(convertidorDecimal(valorBinario[i]));

        }


        return Archivo;

    }

    public int convertidorDecimal(String valorBinario){

        int valorSum = 0;

        int j = 7;

        char[] caracteres = valorBinario.toCharArray();

        for (char i : caracteres) {

            if (Integer.parseInt(String.valueOf(i)) == 1) {

                valorSum += Math.pow(2, j);

            }

            j--;

        }

        return valorSum;

    }
}
