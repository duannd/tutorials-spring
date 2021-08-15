package com.duannd.spring.data.jpa.h2.dto;

import com.duannd.spring.data.jpa.h2.domain.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created By duan.nguyen
 */
@Getter
@Setter
@ToString
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;

    public UserDTO() {

    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }

}
