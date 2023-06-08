package teste.CRUD.Java.srpingBootNew.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.CRUD.Java.srpingBootNew.enums.UsuarioSetor;
import teste.CRUD.Java.srpingBootNew.model.Usuarios;

import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findBySetor(UsuarioSetor usuarioSetor);
}
