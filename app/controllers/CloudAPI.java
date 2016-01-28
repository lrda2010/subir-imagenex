package controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;

public class CloudAPI {

    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "hpvzktqsn",
            "api_key", "549348623392329",
            "api_secret", "PsuDIRaDkjZsNTqTl5Jw6bfm7ss"));

     void subida(File path) throws IOException {
         cloudinary.uploader().upload(path,ObjectUtils.emptyMap());
    }

}
