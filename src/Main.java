import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudoInscritos());
        System.out.println("-------");
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Bruno: " + devBruno.getConteudoConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("<--------------------------->");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudoInscritos());
        System.out.println("------");
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Pedro: " + devPedro.getConteudoConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
    }
}
