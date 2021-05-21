package com.Entity;

import com.Repository.AddressIdentifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "has_addresses")
public class Address {

    @EmbeddedId
    private AddressIdentifier addressIdentifier;
    private String address;

}
