package com.jhon.webservices.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jhon.webservices.pojo.Contacto;
import com.jhon.webservices.adaptadores.ContactoAdapter;
import com.jhon.webservices.R;
import com.jhon.webservices.presentador.FavoritaPresentador;
import com.jhon.webservices.presentador.IRecyclerViewPresentador;

import java.util.ArrayList;


public class MascotaFavoritaFragment extends Fragment implements ReciclerviewFragmentview {
    private RecyclerView ListaMascotas1;
    ArrayList<Contacto> contactos;
    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mascotas,container,false);
        ListaMascotas1 = v.findViewById(R.id.ListaM1);
        presenter = new FavoritaPresentador(this,getContext());
             return v;

    }

    @Override
    public void generarLinearLayout() {
        GridLayoutManager glm = new GridLayoutManager(getActivity() ,2 );
        ListaMascotas1.setLayoutManager(glm);
    }


    @Override
    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos) {
        ContactoAdapter adaptador  = new ContactoAdapter(contactos,getActivity());
        return adaptador;
    }
    @Override
    public void InicializarAdaptadorRV(ContactoAdapter adaptador) {
        ListaMascotas1.setAdapter(adaptador);
    }




}