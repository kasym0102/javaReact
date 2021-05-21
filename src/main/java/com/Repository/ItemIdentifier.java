package com.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ItemIdentifier implements Serializable {

    @Column(length = 50)

    private String user_email;
    private int bucket_id;
    @Column(length = 50)

    private String product_author;
    @Column(length = 50)

    private String product_name;
    @Column(length = 50)

    private String product_printer;
    private int product_volume;
}
