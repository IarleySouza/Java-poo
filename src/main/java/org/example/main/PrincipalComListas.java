package org.example.main;

import org.example.models.Filme;
import org.example.models.Serie;
import org.example.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("O poderoso chefinho", 2020);
        Filme filme = new Filme("O poderoso chefinho", 2022);
        Serie lost = new Serie("Roud 6", 2000);
        var filmeDoIarley = new Filme("Avangers", 2021);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoIarley);
        lista.add(outroFilme);
        lista.add(filme);
        lista.add(lost);

        for (Titulo titulo : lista) {
            if(titulo instanceof Filme filmes && filmes.getClassificacao() > 2){
                System.out.println("Classificação: " + filmes.getClassificacao());
            }

        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("O poderoso chefinho");
        buscaArtista.add("Iarley");
        buscaArtista.add("Geovana");

        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);

        System.out.println("Lista ordenada: ");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
