package mcl.back.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mcl.back.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUsername(String username);

    //@Query("SELECT * FROM user_table WHERE user_table.name LIKE '%:name%'")
    //@Query("SELECT * FROM user_table WHERE name LIKE %:name%")
    // @Query("SELECT * FROM user_table WHERE name LIKE '%C%'")
    // List<User> filtrarPorNome(@Param("name") String name);
}