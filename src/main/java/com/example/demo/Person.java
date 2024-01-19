// Person model + getters and setters

package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "Persons")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_name")
    private String person_name;

    @Column(name = "personal_code")
    private String personal_code;

    @Column(name = "person_phonenumber")
    private Long phonenumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPersonal_code() {
        return personal_code;
    }

    public void setPersonal_code(String personal_code) {
        this.personal_code = personal_code;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
