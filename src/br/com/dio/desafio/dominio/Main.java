package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Fundamentos da Linguagem Java");
        curso1.setDescricaoo("O foco do deste curso é ensinar Java para iniciantes. Totalmente aberto e sem custos, você só precisa se matricular, sentar e estudar.");
        curso1.setCargaHoraria(56);

        Curso curso2 = new Curso("Javascrit do zero", "Curso Web Moderno Completo com JavaScript 2022 + Projetos", 120);

        Mentoria mentoria1 = new Mentoria("");

        System.out.println("Cursos disponíveis : \n  " + curso1 + "\n  " + curso2);


    }
}