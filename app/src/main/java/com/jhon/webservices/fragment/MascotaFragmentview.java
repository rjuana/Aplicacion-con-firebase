package com.jhon.webservices.fragment;

import com.jhon.webservices.adaptadores.MascotaAdapter;
import com.jhon.webservices.pojo.Mascota;

import java.util.ArrayList;

public interface MascotaFragmentview {
    public void generargridLayout();
    public MascotaAdapter crearmascota (ArrayList<Mascota> mascotas);
    public void InicializarAdaptadorRV1(MascotaAdapter mascotaAdapter);
}
