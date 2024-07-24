package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome; // Nome do desenvolvedor
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Conteúdos em que o desenvolvedor está inscrito
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Conteúdos que o desenvolvedor concluiu

    // Método para inscrever o desenvolvedor em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // Adiciona todos os conteúdos do bootcamp aos conteúdos inscritos
        bootcamp.getDevsInscritos().add(this); // Adiciona o desenvolvedor à lista de inscritos no bootcamp
    }

    // Método para progredir no bootcamp, movendo um conteúdo de inscrito para concluído
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // Obtém o primeiro conteúdo inscrito
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); // Adiciona o conteúdo aos concluídos
            this.conteudosInscritos.remove(conteudo.get()); // Remove o conteúdo dos inscritos
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!"); // Mensagem de erro se não houver conteúdos inscritos
        }
    }

    // Método para calcular o total de XP dos conteúdos concluídos
    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        // Alternativa usando Stream API:
        // return this.conteudosConcluidos
        //         .stream()
        //         .mapToDouble(Conteudo::calcularXp)
        //         .sum();
    }

    // Método getter para o nome do desenvolvedor
    public String getNome() {
        return nome;
    }

    // Método setter para o nome do desenvolvedor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para os conteúdos inscritos
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    // Método setter para os conteúdos inscritos
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    // Método getter para os conteúdos concluídos
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    // Método setter para os conteúdos concluídos
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Método equals para comparar se dois objetos Dev são iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    // Método hashCode para gerar um código hash para o objeto Dev
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
