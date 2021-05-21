package com.Service;

import com.Repository.BucketIdentifier;
import com.dto.ItemDTO;
import com.dto.OrderDTO;
import com.dto.addProductToBucketDTO;
import com.Entity.Bucket;
import com.Entity.Item;

import java.util.List;

public interface BucketService {

    List<ItemDTO> getBucket(String email);

    List<ItemDTO> getBucket(String email,int i);

     List<OrderDTO> getPaidBuckets(String email);

    List<OrderDTO> getPaidBuckets();

    List<Bucket> getAllBuckets();

    int getTotal(String email);

    List<ItemDTO> addTbucket(addProductToBucketDTO product);

    List<ItemDTO> updateBucket(Item item);

    public List<ItemDTO> deleteProduct(Item item);

    int getTotalPrice(BucketIdentifier k);

    Integer getTotalPrice(String email);
}
