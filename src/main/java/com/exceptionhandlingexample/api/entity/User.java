package com.exceptionhandlingexample.api.entity;

import org.h2.engine.UserBuilder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "USERS_TBL")
@Data

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class User {
	public static UserBuilder builder() {
        return new UserBuilder();
    }
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
    public User() {
    }

    public User userId(int userId) {
        this.userId = userId;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	 
 

     public User build(int i, String string, String string2, String string3, String string4, int j, String string5) {
         User user = new User();
         user.setUserId(userId);
         user.setName(name);
         user.setEmail(email);
         user.setMobile(mobile);
         user.setGender(gender);
         user.setAge(age);
         user.setNationality(nationality);
         return user;
     }
}