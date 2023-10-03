package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {

    private List<Livro> livroList;

    public CatalogosLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return  livrosPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloANos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }



    public static void main(String[] args){
        CatalogosLivros catalogoLivros = new CatalogosLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2","Autor 1", 2023);
        catalogoLivros.adicionarLivro("Livro 3","Autor 2", 2019);
        catalogoLivros.adicionarLivro("Livro 4","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 5","Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 6","Autor 3", 2023);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloANos(2019,2022));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));


    }


}
