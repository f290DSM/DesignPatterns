package domain.revisao;

import java.util.Objects;

public class Aluno {
    private String email;

    public void setEmail(String email) {
        if (Objects.isNull(email) || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
        this.email = email;
    }
}
