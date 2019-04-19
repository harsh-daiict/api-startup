package com.example.demo.security;


import org.springframework.security.core.GrantedAuthority;

public class GrantAuthority implements GrantedAuthority {

	private static final long serialVersionUID = -3568521975594007207L;

	String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}

