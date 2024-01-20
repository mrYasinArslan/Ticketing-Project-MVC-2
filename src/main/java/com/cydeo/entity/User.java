package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class User extends BaseEntity {

    private String firstname;
    private String lastname;
    private String username;
    private String passWord;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserid, LocalDateTime lastUpdatedTime, Long lastUpdateUserId, String firstname, String lastname, String username, String passWord, boolean enabled, String phone, Role role, Gender gender) {
        super(id, insertDateTime, insertUserid, lastUpdatedTime, lastUpdateUserId);
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.passWord = passWord;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }
}
