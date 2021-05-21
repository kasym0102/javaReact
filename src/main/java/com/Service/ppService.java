package com.Service;

import com.Repository.paymentIden;
import com.Entity.pp;

import java.util.List;
import java.util.Optional;

public interface ppService {


    List<pp> getAllPays();

    Optional<pp> getPPInfo(String e_mail, int bucketId);

    Optional<pp> getPPInfo(paymentIden paymentIden);

    pp payWithPayPal(String e_mail, int bucketId, String accNum);

    void payWithPayPal(pp pp);
}
