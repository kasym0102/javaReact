package com.Service;


import com.Repository.paymentIden;
import com.Entity.pp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ppServiceImpl implements ppService{

    @Autowired
    com.Repository.ppDAO ppDAO;

    @Override
    public List<pp> getAllPays(){
        return ppDAO.findAll();
    }

    @Override
    public Optional<pp> getPPInfo(String e_mail, int bucketId){
        return ppDAO.findById(new paymentIden(e_mail,bucketId));
    }

    @Override
    public Optional<pp> getPPInfo(paymentIden paymentIden){
        return ppDAO.findById(paymentIden);
    }

    @Override
    public pp payWithPayPal(String e_mail, int bucketId, String accNum){
        pp p = new pp(new paymentIden(e_mail,bucketId),accNum);
        ppDAO.save(p);
        return p;
    }

    @Override
    public void payWithPayPal(pp pp){
        ppDAO.save(pp);
    }
}
