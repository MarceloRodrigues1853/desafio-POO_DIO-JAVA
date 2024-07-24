// Importação das classes necessárias do pacote br.com.dio.desafio.dominio
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação do primeiro curso e definição de seus atributos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        // Criação do segundo curso e definição de seus atributos
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // Criação de uma mentoria e definição de seus atributos
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criação de um bootcamp e adição dos cursos e da mentoria
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criação de um desenvolvedor e inscrição no bootcamp
        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());

        // Progresso do desenvolvedor no bootcamp
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXp());

        System.out.println("-------");

        // Criação de outro desenvolvedor e inscrição no bootcamp
        Dev devJoseane = new Dev();
        devJoseane.setNome("Joseane");
        devJoseane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joseane: " + devJoseane.getConteudosInscritos());

        // Progresso do desenvolvedor no bootcamp
        devJoseane.progredir();
        devJoseane.progredir();
        devJoseane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joseane: " + devJoseane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joseane: " + devJoseane.getConteudosConcluidos());
        System.out.println("XP: " + devJoseane.calcularTotalXp());
    }
}
