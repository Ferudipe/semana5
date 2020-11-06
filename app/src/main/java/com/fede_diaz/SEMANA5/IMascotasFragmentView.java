package com.fede_diaz.SEMANA5;

import com.fede_diaz.SEMANA5.adapter.MascotaAdapter;
import com.fede_diaz.SEMANA5.pojo.Mascotas;

import java.util.ArrayList;

public interface IMascotasFragmentView {

    public void generarLayoutGrid();

    public MascotaAdapter crearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptador(MascotaAdapter adaptador);
}
