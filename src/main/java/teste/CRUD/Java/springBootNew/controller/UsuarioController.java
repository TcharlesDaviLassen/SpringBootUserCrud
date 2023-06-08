package teste.CRUD.Java.springBootNew.controller;

import jakarta.validation.Valid;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teste.CRUD.Java.springBootNew.model.Usuarios;
import teste.CRUD.Java.springBootNew.model.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Acessa o formulario
    @GetMapping("/form")
    public String funcionariosForm(Usuarios usuarios) {
    	
        return "addFuncionariosForm";
    }

    // Adiciona novo funcionario
    @PostMapping("/add")
    public String novo(@Valid Usuarios usuarios, BindingResult result) {

        if (result.hasFieldErrors()) {
            return "redirect:/form";
        }

        usuarioRepository.save(usuarios);

        return "redirect:/home";
    }

    // Acessa o formulario de edição
    @GetMapping("form/{id}")
    public String updateForm(Model model, @PathVariable(name = "id") int id) {

        Usuarios usuarios = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
       
        model.addAttribute("usuarios", usuarios);
        return "atualizaForm";
    }

    // Atualiza funcionario
    @PostMapping("update/{id}")
    public String alterarProduto(@Valid Usuarios usuario, BindingResult result, @PathVariable int id) {

        if (result.hasErrors()) {
            return "redirect:/form";
        }

        usuarioRepository.save(usuario);
        return "redirect:/home";
    }

    @GetMapping("delete/{id}")
    @CacheEvict(value = "funcionarios", allEntries = true)
    public String delete(@PathVariable(name = "id") int id, Model model) {

        Usuarios usuarios = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        usuarioRepository.delete(usuarios);
        return "redirect:/home";
    }

}
