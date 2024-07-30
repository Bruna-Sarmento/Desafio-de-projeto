import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java");

        Curso curso = new Curso("Java Básico", "Curso introdutório de Java", 40);
        Mentoria mentoria = new Mentoria("Orientação de Carreira", LocalDate.now());
        Dev dev = new Dev("João", "joao@example.com", "Iniciante");

        bootcamp.adicionarCurso(curso);
        bootcamp.adicionarMentoria(mentoria);
        bootcamp.adicionarDev(dev);

        // Aqui você pode adicionar código para visualizar ou manipular os dados
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos: ");
        for (Curso c : bootcamp.getCursos()) {
            System.out.println(" - " + c.getNome() + ": " + c.getDescricao() + " (" + c.getCargaHoraria() + " horas)");
        }
        System.out.println("Mentorias: ");
        for (Mentoria m : bootcamp.getMentoria()) {
            System.out.println(" - " + m.getTema() + " em " + m.getData());
        }
        System.out.println("Devs: ");
        for (Dev d : bootcamp.getDev()) {
            System.out.println(" - " + d.getNome() + " (" + d.getEmail() + ") - " + d.getNivel());
        }
    }
}
