package net.software.backendcursojava.services;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
import org.springframework.stereotype.Service;

import net.software.backendcursojava.UserRepository;
import net.software.backendcursojava.entities.UserEntity;
import net.software.backendcursojava.shared.dto.UserDTO;

@Service
<<<<<<< HEAD
public class UserService implements UserServiceInterface {

=======
public class UserService implements  UserServiceInterface{
>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f

    @Autowired
    UserRepository userRepository;

<<<<<<< HEAD
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDTO createUser(UserDTO userDto) {

        if(userRepository.findUserByEmail(userDto.getEmail()) != null) 
            throw new RuntimeException("El email ya existe");
        
        // TODO logica de la creacion del usuario
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        
        UUID userId = UUID.randomUUID();
        userEntity.setUserId(userId.toString());
       

        UserEntity storedUserDetail =  userRepository.save(userEntity);

        UserDTO userToReturn = new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, userToReturn);
        return userToReturn;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }
=======

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        
        if(userRepository.findUserByEmail(userDTO.getEmail()) != null) throw new RuntimeException("Su correo ya existe.");


        UserEntity userEntity =new UserEntity();
        BeanUtils.copyProperties(userDTO, userEntity);

        userEntity.setEncryptedPassword("testpassword");
        UUID userId= UUID.randomUUID();
        userEntity.setUserId(userId.toString());
        


        UserEntity storedUserDetail= userRepository.save(userEntity);

        UserDTO userToReturn = new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, userToReturn);


        return userToReturn;
    }

>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
    
}
