package com.fede_diaz.SEMANA5;

import com.fede_diaz.SEMANA5.adapter.ContactoAdapter;
import com.fede_diaz.SEMANA5.pojo.Mascotas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView  {

    public void generarLayoutVertical();

    public ContactoAdapter crearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptador(ContactoAdapter adaptador);
}
