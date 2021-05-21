package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class statDTO {

    private com.Repository.paymentIden paymentIden;
    private String new_stat;

}
