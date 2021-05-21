package com.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pp")
public class pp {

    @EmbeddedId
    com.Repository.paymentIden paymentIden;

    private String acc_num;

    public pp() {
    }

    public pp(com.Repository.paymentIden paymentIden, String acc_num) {
        this.paymentIden = paymentIden;
        this.acc_num = acc_num;
    }

    public com.Repository.paymentIden getPaymentIden() {
        return paymentIden;
    }

    public void setPaymentIden(com.Repository.paymentIden paymentIden) {
        this.paymentIden = paymentIden;
    }

    public String getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }
}
