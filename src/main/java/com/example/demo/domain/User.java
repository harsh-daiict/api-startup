package com.example.demo.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.security.GrantAuthority;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity(name = "user")
public class User extends AbstractDomainEntity implements UserDetails {

	private static final long serialVersionUID = -5306601044839043773L;

	@Column
	@NotNull
	@Email(message = "email should be valid")
	private String email;
    
	@Column
	@NotEmpty(message = "password cannot be blank")
	private String password;
    
	@Column
	@NotEmpty(message = "first name cannot be blank")
	private String firstName;
	
	@Column
	private String lastName;
	
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<GrantAuthority> getGrantAuthorities() {
		return grantAuthorities;
	}

	public void setGrantAuthorities(List<GrantAuthority> grantAuthorities) {
		this.grantAuthorities = grantAuthorities;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Transient
	List<GrantAuthority> grantAuthorities;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public List<GrantAuthority> getAuthorities() {
        return grantAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

   
}
