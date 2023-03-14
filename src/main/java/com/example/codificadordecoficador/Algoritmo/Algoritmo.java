package com.example.codificadordecoficador.Algoritmo;

public class Algoritmo {

    public int valorProcesado = 0;
    public Algoritmo(int i) {

        valorProcesado = algoritmoMDRIngreso(i);
    }

    public int algoritmoMDRIngreso (int valorBruto){

        int valor = valorBruto;

        valor = (((valor*4)+2)/2);

        return valor;
    }

    public int algoritmoMDRSalida (int valorProcesado){

        int valor = valorProcesado;

        valor = (((valor*2)-2)/4);

        return valor;

    }
}
