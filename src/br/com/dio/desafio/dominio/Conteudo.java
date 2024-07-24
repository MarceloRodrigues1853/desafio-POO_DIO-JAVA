package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; // XP padrão que cada conteúdo oferece

    private String titulo; // Título do conteúdo
    private String descricao; // Descrição do conteúdo

    // Método abstrato para calcular o XP, a ser implementado pelas subclasses
    public abstract double calcularXp();

    // Método getter para o título do conteúdo
    public String getTitulo() {
        return titulo;
    }

    // Método setter para o título do conteúdo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método getter para a descrição do conteúdo
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descrição do conteúdo
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
