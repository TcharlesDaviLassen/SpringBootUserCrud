package teste.CRUD.Java.springBootNew.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.CRUD.Java.springBootNew.enums.UsuarioSetor;
import teste.CRUD.Java.springBootNew.model.Usuarios;

import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findBySetor(UsuarioSetor usuarioSetor);
}
