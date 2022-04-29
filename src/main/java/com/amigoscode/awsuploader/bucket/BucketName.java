package com.amigoscode.awsuploader.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-bucket-image-uploader");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}