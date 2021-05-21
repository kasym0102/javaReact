package com.Service;

import com.Repository.ItemIdentifier;
import com.Repository.ProductIDentifier;
import com.Repository.RateDAO;
import com.Entity.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateServiceImpl implements RateService{
    @Autowired
    RateDAO rateDAO;

    @Override
    public List<Rate> getProductRate(ProductIDentifier productIDentifier) {
        return rateDAO.findByProduct(productIDentifier.getName(), productIDentifier.getPrinter(),
                productIDentifier.getWritter(), productIDentifier.getVolume());
    }

    @Override
    public Rate makeComment(Rate rate) {
        return rateDAO.save(rate);
    }

    @Override
    public boolean deleteComment(ItemIdentifier itemIdentifier) {
        try{
            rateDAO.deleteById(itemIdentifier);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Rate updateComment(Rate rate) {
        return rateDAO.save(rate);
    }

}
