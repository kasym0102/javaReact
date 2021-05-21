package com.Service;

import com.Repository.ItemIdentifier;
import com.Repository.ProductIDentifier;
import com.Entity.Rate;

import java.util.List;

public interface RateService {
    List<Rate> getProductRate(ProductIDentifier productIDentifier);

    Rate makeComment(Rate rate);

    boolean deleteComment(ItemIdentifier itemIdentifier);

    Rate updateComment(Rate rate);
}
