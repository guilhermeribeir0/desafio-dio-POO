import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso de Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Java");
        mentoria.setDate(LocalDate.now());

        /**
          * System.out.println(curso1);
          *System.out.println(curso2);
          * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Guilherme" + devGuilherme.getConteudoInscritos());
        devGuilherme.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos - Guilherme" + devGuilherme.getConteudoInscritos());
        System.out.println("Conteudos Concluidos - Guilherme" + devGuilherme.getConteudoConcluidos());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());
        System.out.println("-------------------------------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Pedro" + devPedro.getConteudoInscritos());
        devPedro.progredir();
        System.out.println("----");
        System.out.println("Conteudos Inscritos - Pedro" + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos - Pedro" + devPedro.getConteudoConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

    }

}
