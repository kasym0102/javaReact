package com.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cc")
public class cc {

    @EmbeddedId
    com.Repository.paymentIden paymentIden;

    private String card_num;
    private int cvc;

    public cc() {
    }

    public cc(com.Repository.paymentIden paymentIden, String card_num, int cvc) {
        this.paymentIden = paymentIden;
        this.card_num = card_num;
        this.cvc = cvc;
    }

    public com.Repository.paymentIden getPaymentIden() {
        return paymentIden;
    }

    public void setPaymentIden(com.Repository.paymentIden paymentIden) {
        this.paymentIden = paymentIden;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }
}
