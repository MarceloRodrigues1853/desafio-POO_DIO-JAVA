package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria; // Carga horária do curso

    // Implementação do método abstrato calcularXp() da classe Conteudo
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; // Calcula o XP com base na carga horária
    }

    // Construtor padrão da classe Curso
    public Curso() {
    }

    // Método getter para a carga horária do curso
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Método setter para a carga horária do curso
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método toString para representar o curso como uma string
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
