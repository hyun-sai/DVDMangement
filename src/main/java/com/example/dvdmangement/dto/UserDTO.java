package com.example.dvdmangement.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor   // 기본 생성자
public class UserDTO {

    private  int userid;
    private  String name;
    private  int age;
    private  String id;
    private  String password;

    public UserDTO(int userid, String name, int age, String id, String password) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.id = id;
        this.password = password;
    }
}