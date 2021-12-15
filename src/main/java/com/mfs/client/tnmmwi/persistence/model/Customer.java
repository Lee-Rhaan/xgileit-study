package com.mfs.client.tnmmwi.persistence.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

/**
 * The Customer details of TNM Malawi gets stored in this class
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    private String name;

    private String customerMsisdn;

    private String email;

}