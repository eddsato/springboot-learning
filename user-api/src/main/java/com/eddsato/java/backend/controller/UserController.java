package com.eddsato.java.backend.controller;

import com.eddsato.java.backend.model.UserDTO;
import com.eddsato.java.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*

    Permite a criação de métodos que serão chamados via Web usando protocolos HTTP
*/
@RestController
public class UserController {

    /*
        Injeção de dependencia
     */
    @Autowired
    private UserService userService;

    @GetMapping("/user/")
    public List<UserDTO> getUsers() {
        List<UserDTO> usuarios = userService.getAll();
        return usuarios;
    }

    @GetMapping("/user/{id}")
    UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    UserDTO newUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    UserDTO findByCpf(@PathVariable String cpf) {
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    UserDTO delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> queryByName(
        @RequestParam(name="nome", required = true) String nome
    ) {
        return userService.queryByName(nome);
    }

    /*
        Run right after the container initializes the class
     */
//    @PostConstruct
//    public void initiateList() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setNome("Eduardo");
//        userDTO.setCpf("123");
//        userDTO.setEndereco("Rua A");
//        userDTO.setEmail("eduardo@email.com");
//        userDTO.setTelefone("1234-3454");
//        userDTO.setDataCadastro(new Date());
//
//        UserDTO userDTO2 = new UserDTO();
//        userDTO2.setNome("Luiz");
//        userDTO2.setCpf("456");
//        userDTO2.setEndereco("Rua B");
//        userDTO2.setEmail("luiz@email.com");
//        userDTO2.setTelefone("1234-3454");
//        userDTO2.setDataCadastro(new Date());
//
//        UserDTO userDTO3 = new UserDTO();
//        userDTO3.setNome("Bruna");
//        userDTO3.setCpf("678");
//        userDTO3.setEndereco("Rua C");
//        userDTO3.setEmail("bruna@email.com");
//        userDTO3.setTelefone("1234-3454");
//        userDTO3.setDataCadastro(new Date());
//
//        usuarios.add(userDTO);
//        usuarios.add(userDTO2);
//        usuarios.add(userDTO3);
//    }
}
