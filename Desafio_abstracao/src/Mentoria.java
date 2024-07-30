import java.time.LocalDate;

public class Mentoria {
    private String tema;
    private LocalDate data;

    public Mentoria(String tema, LocalDate data) {
        this.tema = tema;
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public LocalDate getData() {
        return data;
    }
}
