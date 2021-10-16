package net.software.backendcursojava.services;

<<<<<<< HEAD
import org.springframework.security.core.userdetails.UserDetailsService;

import net.software.backendcursojava.shared.dto.UserDTO;

public interface UserServiceInterface extends UserDetailsService{

    public UserDTO createUser(UserDTO userDto);
=======
import net.software.backendcursojava.shared.dto.UserDTO;

public interface UserServiceInterface {

    public UserDTO createUser(UserDTO userDTO);
    
>>>>>>> 794d737a180a0bafca4c2a8884c40b4845b9394f
    
}
