package com.dto;

import com.Entity.Address;
import com.Entity.cc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ccDTO {

    private cc cc;
    private List<ItemDTO> items;
    private Address address;
}
