package teste.CRUD.Java.springBootNew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import teste.CRUD.Java.springBootNew.enums.UsuarioSetor;
import teste.CRUD.Java.springBootNew.model.Usuarios;
import teste.CRUD.Java.springBootNew.model.repository.UsuarioRepository;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    

    @GetMapping("/home")
    public String home(Model model) {
    	List<Usuarios> usuarios = usuarioRepository.findAll();
    	
        var dados = model.addAttribute("usuarios", usuarios);
        return "home";
    }
   

    @GetMapping("/")
    public String setor(@RequestParam String setor, Model model) {
    	UsuarioSetor usuarioSetor = UsuarioSetor.valueOf(setor.toUpperCase());
        List<Usuarios> usuarios = usuarioRepository.findBySetor(usuarioSetor);
       
        model.addAttribute("usuarios", usuarios);
        return "home";
    }
   

}
