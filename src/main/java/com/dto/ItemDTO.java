package com.dto;

import com.Repository.ItemIdentifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private ItemIdentifier itemIdentifier;
    private int amount;
    private double unit_price;
    private String product_pic;

}
