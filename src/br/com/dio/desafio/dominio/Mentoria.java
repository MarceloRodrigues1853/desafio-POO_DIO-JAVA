package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data; // Data da mentoria

    // Implementação do método abstrato calcularXp() da classe Conteudo
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // Calcula o XP da mentoria somando um valor fixo ao XP padrão
    }

    // Construtor padrão da classe Mentoria
    public Mentoria() {
    }

    // Método getter para a data da mentoria
    public LocalDate getData() {
        return data;
    }

    // Método setter para a data da mentoria
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método toString para representar a mentoria como uma string
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
