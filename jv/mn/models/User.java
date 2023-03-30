package jv.mn.models;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data

public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int rowId;
    private String firstName;
    private String lastName;
    private String middleName;
	
    @JsonIgnore
	
    private String login;
	
    @JsonIgnore
	
    private String passwordHash;
	
    @Nullable
	
    private Integer groupId;
    private Integer roleId;

}
