package com.ozkhwarizmi.verificaflex.entities;

import java.io.Serializable;

//Implements é a interface que permite que uma classe seja passada de uma activity para outra
public class Avaliacao implements Serializable {
    private double valorAlcool;
    private double valorGasolina;
    private double valorCalculo;
    private String  mensagem;

    public Avaliacao(double valorAlcool, double valorGasolina, double valorCalculo, String mensagem) {
        this.valorAlcool = valorAlcool;
        this.valorGasolina = valorGasolina;
        this.valorCalculo = valorCalculo;
        this.mensagem = mensagem;
    }

    public double getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public double getValorCalculo() {
        return valorCalculo;
    }

    public void setValorCalculo(double valorCalculo) {
        this.valorCalculo = valorCalculo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
