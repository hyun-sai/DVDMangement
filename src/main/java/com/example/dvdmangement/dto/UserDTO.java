package com.example.dvdmangement.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor   // 기본 생성자
public class UserDTO {

    private  Integer userid;
    private  String name;
    private  Integer age;
    private  String id;
    private  String password;

    public UserDTO(Integer userid, String name, Integer age, String id, String password) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
    }
}