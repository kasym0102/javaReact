package com.Service;

import com.Repository.AddressIdentifier;
import com.dto.AddressDTO;
import com.Entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddresses(String email);


    Address addAddress(AddressDTO addressDTO);

    Boolean deleteAddress(AddressIdentifier addressIdentifier);

    Address updateAddress(Address address);


}
