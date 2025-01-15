package org.example;

import org.example.calculos.CalculadoraDeTempo;
import org.example.calculos.FiltroRecomendacao;
import org.example.models.Episodio;
import org.example.models.Filme;
import org.example.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Filme filme = new Filme("O poderoso chefinho", 2022);
        System.out.println("\nFilmes: ");
        filme.setDuracaoMinutos(200);
        filme.setIncluidoNoPlano(true);

        filme.setSomaAvaliacao(3);
        filme.setSomaAvaliacao(6);
        filme.setSomaAvaliacao(6);
        System.out.println("Soma das avaliações: " + filme.getSomaAvaliacao());
        System.out.println("Total de avaliações: " + filme.getTotalAvaliacao());
        System.out.printf("Media das avaliações: %.2f" , filme.pegarMedia());
        filme.exibirDados();


        Serie serie = new Serie("Roud 6", 2000);
        
        System.out.println("\nSeries: ");
        serie.setEpisodioPorTemporada(25);
        serie.setTemporadas(5);
        serie.setMinutosPorEpisodio(20);
        serie.exibirDados();
        System.out.println("Duração para maratonar serie: " + serie.getDuracaoMinutos());

        Filme outroFilme = new Filme("O poderoso chefinho", 2020);
        System.out.println("\nFilmes: ");
        outroFilme.setDuracaoMinutos(20);

        CalculadoraDeTempo cal = new CalculadoraDeTempo();
        System.out.println("\nCalculadora: ");
        cal.inclui(filme);
        cal.inclui(outroFilme);
        cal.inclui(serie);
        System.out.println(cal.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("\nFiltro: ");
        filtro.filtrar(outroFilme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalavaliacao(100);
        filtro.filtrar(episodio);


        var filmeDoIarley = new Filme("Avangers", 2021);
        filmeDoIarley.setDuracaoMinutos(200);
        ArrayList<Filme> listaFilmes = new ArrayList<>();

        listaFilmes.add(filmeDoIarley);
        listaFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro item da lista de filmes: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("toString de filme: " + listaFilmes.toString());
    }
}