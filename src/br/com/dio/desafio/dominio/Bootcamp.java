package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome; // Nome do bootcamp
    private String descricao; // Descrição do bootcamp
    private final LocalDate dataInicial = LocalDate.now(); // Data de início do bootcamp
    private final LocalDate dataFinal = dataInicial.plusDays(45); // Data final do bootcamp (45 dias após a data inicial)
    private Set<Dev> devsInscritos = new HashSet<>(); // Conjunto de desenvolvedores inscritos no bootcamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // Conjunto de conteúdos do bootcamp

    // Método getter para o nome do bootcamp
    public String getNome() {
        return nome;
    }

    // Método setter para o nome do bootcamp
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para a descrição do bootcamp
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descrição do bootcamp
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método getter para a data inicial do bootcamp
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    // Método getter para a data final do bootcamp
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    // Método getter para os desenvolvedores inscritos no bootcamp
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    // Método setter para os desenvolvedores inscritos no bootcamp
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    // Método getter para os conteúdos do bootcamp
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Método setter para os conteúdos do bootcamp
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    // Método equals para comparar se dois objetos Bootcamp são iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(dataInicial, bootcamp.dataInicial) &&
                Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
                Objects.equals(conteudos, bootcamp.conteudos);
    }

    // Método hashCode para gerar um código hash para o objeto Bootcamp
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
