package com.dto;

import com.Entity.Address;
import com.Entity.pp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ppDTO {

    private pp pp;
    private List<ItemDTO> items;
    private Address address;
}
