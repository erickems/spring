package com.demo.ufrn.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
public class User {
    private String name;
    private String password;
}
