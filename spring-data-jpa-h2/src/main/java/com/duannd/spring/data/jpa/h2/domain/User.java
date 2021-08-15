package com.duannd.spring.data.jpa.h2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By duan.nguyen
 */
@Entity
@Getter
@Setter
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

}
