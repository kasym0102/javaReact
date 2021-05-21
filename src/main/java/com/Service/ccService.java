package com.Service;

import com.Repository.paymentIden;
import com.Entity.cc;

import java.util.List;
import java.util.Optional;

public interface ccService {
    List<cc> getAllCCPayments();

    Optional<cc> getCCInfo(String e_mail, int bucketId);

    Optional<cc> getCCInfo(paymentIden ccIden);

    cc payWithCreditCard(String e_mail, int bucketId, String cardNum, int cvc);

    void payWithCreditCard(cc cc);
}
