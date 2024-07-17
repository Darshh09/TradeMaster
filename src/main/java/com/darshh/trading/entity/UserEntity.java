package com.darshh.trading.entity;

import com.darshh.trading.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private USER_ROLE role = USER_ROLE.CUSTOMER;

    @Embedded
    private TwoFactorAuthEntity twoFactorAuthEntity = new TwoFactorAuthEntity();
 }
