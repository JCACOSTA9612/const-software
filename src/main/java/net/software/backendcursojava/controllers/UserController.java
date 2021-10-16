package net.software.backendcursojava.controllers;

<<<<<<< HEAD

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
=======
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.software.backendcursojava.models.request.UserDetailRequestModel;
import net.software.backendcursojava.models.responses.UserRest;
import net.software.backendcursojava.services.UserServiceInterface;
import net.software.backendcursojava.shared.dto.UserDTO;

@RestController
<<<<<<< HEAD
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {

    @Autowired
    UserServiceInterface userService;


    @GetMapping //obtener consultar informacion
=======
@RequestMapping("/users") //localhost/users
public class UserController{

    @Autowired
    UserServiceInterface userService;
    

    @GetMapping //Obtener, consultar informacion
>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
    public String getUser(){
        return "Obtener usuarios";
    }

    @PostMapping //Creando informacion
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails){
<<<<<<< HEAD
        
        UserRest userToReturn = new UserRest();

        UserDTO userDTO = new UserDTO();

        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createdUser = userService.createUser(userDTO);

        BeanUtils.copyProperties(createdUser, userToReturn);

        return userToReturn;
=======
        UserRest UserToReturn= new UserRest();

        UserDTO userDTO =new UserDTO();

        BeanUtils.copyProperties(userDetails, userDTO);

        UserDTO createdUser= userService.createUser(userDTO);

        BeanUtils.copyProperties(createdUser, UserToReturn);

        return UserToReturn;
>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
    }

}
