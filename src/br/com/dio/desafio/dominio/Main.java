package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Fundamentos da Linguagem Java");
        curso1.setDescricao("O foco do deste curso é ensinar Java para iniciantes. Totalmente aberto e sem custos, você só precisa se matricular, sentar e estudar.");
        curso1.setCargaHoraria(56);

        Conteudo curso2 = new Curso(120);
        curso2.setTitulo("Javascrit do zero");
        curso2.setDescricao("Curso Web Moderno Completo com JavaScript 2022 + Projetos");

        Mentoria mentoria1 = new Mentoria(LocalDate.now());
        mentoria1.setTitulo("Mentoria em JAVA");
        mentoria1.setDescricao("Mentoria para formação de programador JAVA Web Full-Stack. JDev Treinamento on-line. seg a sexta de 10h ás 18h");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Programador JAVA Web Full-Stack");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Javascript Developer");
        bootcamp2.setDescricao("Programador Javascript Web Full-Stack");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("\n Juliana Maria de Sousa Mesquita");
        dev1.inscreverBootcamp(bootcamp2);
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        System.out.println("  " + dev1.getNome() + "\n    - XP : " + dev1.calcularXp() + "\n    - Conteúdos inscritos : " + dev1.getConteudosInscritos() + "\n    - Conteúdos concluídos : " + dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("\n Pollyana Ramos");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("  " + dev2.getNome() + "\n    - XP : " + dev2.calcularXp() + "\n    - Conteúdos inscritos : " + dev2.getConteudosInscritos() + "\n    - Conteúdos concluídos : " + dev2.getConteudosConcluidos());

        System.out.println("\n Cursos: \n  " + curso1 + "\n  " + curso2 + "\n\n Mentorias: \n  " + mentoria1);

    }
}