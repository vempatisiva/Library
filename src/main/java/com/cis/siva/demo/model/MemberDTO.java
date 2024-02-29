package com.cis.siva.demo.model;

import lombok.Data;

@Data
public class MemberDTO {
    private long memberId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Long phoneNumber;
    private String memberShipLevel;
}
