package com.cis.siva.demo.model;

import com.cis.siva.demo.entity.LibraryMember;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
public class CheckoutDTO {
    private Integer id;
    private Long isbn;
    private Date checkoutDate;
    private Date dueDate;
    private boolean isReturned;
}