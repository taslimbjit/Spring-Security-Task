package com.taslim.springSecurityDemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponeModel {
    private Long id;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
}