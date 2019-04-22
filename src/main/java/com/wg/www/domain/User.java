package com.wg.www.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {

    private Integer id;
    private String username;
    @JsonIgnore
    private String password;
}
