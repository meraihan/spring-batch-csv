package com.zoracorp.processor;

import com.zoracorp.model.User;

import com.zoracorp.model.UserDTO;
import org.springframework.batch.item.ItemProcessor;

public class UserProcessor implements ItemProcessor<User, UserDTO> {

    @Override
    public UserDTO process(final User user) throws Exception {
        System.out.println("Transforming User to UserDTO");
        final UserDTO userDTO = new UserDTO(user.getFirstname(), user.getPhone());

        return userDTO;
    }

}
