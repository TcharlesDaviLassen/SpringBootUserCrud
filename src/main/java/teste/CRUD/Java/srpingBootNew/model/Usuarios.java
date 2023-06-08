package teste.CRUD.Java.srpingBootNew.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import teste.CRUD.Java.srpingBootNew.enums.UsuarioSetor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String cargo;
    private BigDecimal salario;
    private LocalDateTime dataContratacao = LocalDateTime.now();


    @Enumerated(EnumType.STRING)
    private UsuarioSetor setor;

    public void setSetor(UsuarioSetor setor) {
        this.setor = setor;
    }
   
}
