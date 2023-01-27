package mcl.back.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mcl.back.demo.model.User;
import mcl.back.demo.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
  @Autowired
  private UserRepository userRepos;

  @Override
  public void run(String... args) throws Exception {
    User usuario = new User();
    usuario.setName("Delicia");
    usuario.setUsername("gelada");
    usuario.setPassword("mcl123");
    userRepos.save(usuario);

    for (User u : userRepos.findAll()) {
      System.out.println(u.toString());
    }

    System.out.println("Filtro por NOME: " + userRepos.findByNameContaining("Marcelo"));
  }

}
