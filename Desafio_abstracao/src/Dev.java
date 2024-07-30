public class Dev {
    private String nome;
    private String email;
    private String nivel;

    public Dev(String nome, String email, String nivel) {
        this.nome = nome;
        this.email = email;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNivel() {
        return nivel;
    }
}
