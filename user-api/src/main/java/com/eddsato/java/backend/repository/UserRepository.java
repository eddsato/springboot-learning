package com.eddsato.java.backend.repository;

import com.eddsato.java.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Automaticamente instaciado na inicialização da aplicação.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /*
        Consultas criadas apenas como o nome do método utilizando apenas algumas palavras chaves (find/and/or/like)
     */
    User findByCpf(String cpf);

    List<User> queryByNomeLike(String name);
}
