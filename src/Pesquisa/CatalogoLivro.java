package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        livroList.add(new Livro(nome, autor,anoPublicacao));

    }
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalosAnos.add(l);

                }
            }
        }
        return livrosPorIntervalosAnos;
    }
    //regra de negocio (imprimir o primeiro livro que a achar)
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                }
            }
        } else {
            System.out.println("Não tem nenhum livro com esse nome" + livroPorTitulo);
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {

        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("livro1","roberto carlos",1995);
        catalogoLivro.adicionarLivro("livro2","João",1997);
        catalogoLivro.adicionarLivro("livro3","João",2000);
        catalogoLivro.adicionarLivro("livro4","Pedro",2005);
        catalogoLivro.adicionarLivro("livro5","Roberto",2010);

        System.out.println(catalogoLivro.pesquisaPorTitulo("livo"));
    }
}
