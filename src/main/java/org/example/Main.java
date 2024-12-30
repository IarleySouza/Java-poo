package org.example;

import org.example.calculos.CalculadoraDeTempo;
import org.example.models.Filme;
import org.example.models.Serie;

public class Main {
    public static void main(String[] args) {


        Filme filme = new Filme();
        System.out.println("\nFilmes: ");
        filme.setNome("O poderoso chefinho");
        filme.setAnoLancamento(2020);
        filme.setDuracaoMinutos(200);
        filme.setIncluidoNoPlano(true);

        filme.setSomaAvaliacao(3);
        filme.setSomaAvaliacao(6);
        filme.setSomaAvaliacao(6);
        System.out.println("Soma das avaliações: " + filme.getSomaAvaliacao());
        System.out.println("Total de avaliações: " + filme.getTotalAvaliacao());
        System.out.printf("Media das avaliações: %.2f" , filme.pegarMedia());
        filme.exibirDados();


        Serie serie = new Serie();
        
        System.out.println("\nSeries: ");

        serie.setNome("Roud 6");
        serie.setAnoLancamento(2020);
        serie.setEpisodioPorTemporada(25);
        serie.setTemporadas(5);
        serie.setMinutosPorEpisodio(20);
        serie.exibirDados();
        System.out.println("Duração para maratonar serie: " + serie.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        System.out.println("\nFilmes: ");
        outroFilme.setNome("O poderoso chefinho");
        outroFilme.setAnoLancamento(2020);
        outroFilme.setDuracaoMinutos(20);

        CalculadoraDeTempo cal = new CalculadoraDeTempo();
        System.out.println("\nCalculadora: ");
        cal.inclui(filme);
        cal.inclui(outroFilme);
        cal.inclui(serie);
        System.out.println(cal.getTempoTotal());


    }
}