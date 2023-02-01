package mcl.front.web.controller;

import org.springframework.web.bind.annotation.RestController;

import mcl.front.web.model.Usuario;
import mcl.front.web.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }
    @GetMapping("{username}")
    public Usuario find(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
