import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do bootcamp Java Developer");

        Curso curso1 = new Curso("Curso Java Básico", "Aprenda o básico de Java", 8);
        Curso curso2 = new Curso("Curso Java Avançado", "Aprofunde-se em Java", 12);
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "Mentoria com dicas de carreira", LocalDate.now());

        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);

        Dev dev1 = new Dev("Alice");
        Dev dev2 = new Dev("Bob");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev1.progredir();
        dev2.progredir();

        System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());
        System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}