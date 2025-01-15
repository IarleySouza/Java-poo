package org.example.models;

import org.example.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private double Totalavaliacao;

    public double getTotalavaliacao() {
        return Totalavaliacao;
    }

    public void setTotalavaliacao(double totalavaliacao) {
        Totalavaliacao = totalavaliacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (Totalavaliacao > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
