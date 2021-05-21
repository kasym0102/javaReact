package com.Service;

import com.Repository.paymentIden;
import com.Entity.payment;
import com.dto.PaymentDTO;
import com.dto.ccDTO;
import com.dto.ppDTO;
import com.dto.statDTO;

import java.util.List;
import java.util.Optional;

public interface paymentService {

    Optional<payment> getPayment(paymentIden paymentIden);

    List<payment> getPayments();

    List<payment> getPayments(int page);

    int getPaymentType(paymentIden paymentIden);

    payment updateStat(statDTO new_stat);

    void makePayment(payment payment);

    PaymentDTO makePaymentWCC(ccDTO cc);

    PaymentDTO makePaymentWPP(ppDTO pp);

}
