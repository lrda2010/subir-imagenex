package controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;

public class CloudAPI {

    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dgki96asv",
            "api_key", "418528464326265",
            "api_secret", "xGS_MGnlkQ5GwYvmUG6onAltPwM"));

     void subida(File path) throws IOException {
         cloudinary.uploader().upload(path,ObjectUtils.emptyMap());
    }

}
