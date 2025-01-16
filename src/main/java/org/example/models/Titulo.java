package org.example.models;

public  class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinutos;


    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("AnoLancamento: " + anoLancamento);
        System.out.println("Incluido No Plano: " + incluidoNoPlano);
        System.out.println("Duracao Minutos: " + duracaoMinutos);
    }
    public void setSomaAvaliacao(double valiacao) {
        somaAvaliacao += valiacao;
        totalAvaliacao ++;
    }
    public double pegarMedia() {
        return somaAvaliacao / totalAvaliacao;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
