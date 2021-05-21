package com.Service;

import com.Repository.paymentIden;
import com.Entity.cc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ccServiceImpl implements ccService {

    @Autowired
    com.Repository.ccDAO ccDAO;

    @Override
    public List<cc> getAllCCPayments(){
        return ccDAO.findAll();
    }

    @Override
    public Optional<cc> getCCInfo(String e_mail, int bucketId) {
        return ccDAO.findById(new paymentIden(e_mail,bucketId));
    }

    @Override
    public Optional<cc> getCCInfo(paymentIden ccIden){
        return ccDAO.findById(ccIden);
    }

    @Override
    public cc payWithCreditCard(String e_mail, int bucketId, String cardNum, int cvc){
        cc c = new cc(new paymentIden(e_mail,bucketId),cardNum,cvc);
        ccDAO.save(c);
        return c;
    }

    @Override
    public void payWithCreditCard(cc cc) {
        ccDAO.save(cc);
    }

}
