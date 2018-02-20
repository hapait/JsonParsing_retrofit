package com.example.admin.retro_jsonparser;

/**
 * Created by Admin on 2/20/2018.
 */

public class JSONResponse {
    private AndroidVersion[] android;

    private  Informations[] informations;

    public Informations[] getInformations(){
        return informations;
    }
    public AndroidVersion[] getAndroid() {
        return android;
    }
}