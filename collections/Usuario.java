import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario (String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // mesmo objeto
        if (o == null || getClass() != o.getClass()) return false; // tipos diferentes
        Usuario usuario = (Usuario) o; // faz cast
        return Objects.equals(nome, usuario.nome); // compara o campo
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome); // gera hash com base no nome
    }
}

