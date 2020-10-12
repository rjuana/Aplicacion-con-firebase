package com.jhon.webservices.resApi;

import com.jhon.webservices.pojo.Mascota;

import java.util.ArrayList;

public class MascotaResponse {

    ArrayList<Mascota> profilepet;

    public ArrayList<Mascota> getProfilepet() {
        return profilepet;
    }

    public void setProfilepet(ArrayList<Mascota> profilepet) {
        this.profilepet = profilepet;
    }
}
