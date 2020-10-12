package com.jhon.webservices.fragment;

import com.jhon.webservices.adaptadores.ContactoAdapter;
import com.jhon.webservices.pojo.Contacto;

import java.util.ArrayList;

public interface ReciclerviewFragmentview {
    public void generarLinearLayout();

    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos);

    public void InicializarAdaptadorRV(ContactoAdapter adaptador);
}