package com.apiproject.test.apiproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;


@Data //TODO Creates the getter and setter of class
@Table(name = "userdetails") //TODO Refers to the name of table in mysql db
@NoArgsConstructor
@AllArgsConstructor
@Entity //TODO Shows that it's a table
public class userdetails implements java.io.Serializable { //TODO Basically a POJO for your table columns
    @GeneratedValue
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "UserName")
    private String UserName;
    @Column(name = "UserPass")
    private String UserPass;
    @Column(name = "UserType")
    private String UserType;

}
