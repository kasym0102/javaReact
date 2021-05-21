package com.Entity;

import com.Repository.BucketIdentifier;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bucket")
public class Bucket {

    @EmbeddedId
    BucketIdentifier bucketIdentifier;

    public Bucket() {
    }

    public Bucket(BucketIdentifier bucketIdentifier) {
        this.bucketIdentifier = bucketIdentifier;
    }

    public BucketIdentifier getBucketIdentifier() {
        return bucketIdentifier;
    }

    public void setBucketIdentifier(BucketIdentifier bucketIdentifier) {
        this.bucketIdentifier = bucketIdentifier;
    }
}
