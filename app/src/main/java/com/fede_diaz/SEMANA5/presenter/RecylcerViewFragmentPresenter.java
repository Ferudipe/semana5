package com.fede_diaz.SEMANA5.presenter;

import android.content.Context;

import com.fede_diaz.SEMANA5.IRecyclerViewFragmentView;
import com.fede_diaz.SEMANA5.db.ConstrutorMascotas;
import com.fede_diaz.SEMANA5.pojo.Mascotas;

import java.util.ArrayList;

public class RecylcerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {
    private IRecyclerViewFragmentView mIRecyclerViewFragmentView;
    private Context mContext;
    private ConstrutorMascotas mConstrutorMascotas;
    private ArrayList<Mascotas> mMascotas;

    public RecylcerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.mIRecyclerViewFragmentView=iRecyclerViewFragmentView;
        this.mContext=context;
        obtenerContactosBaseDatos();
    }

    @Override
    public void obtenerContactosBaseDatos() {
        mConstrutorMascotas = new ConstrutorMascotas(mContext);
        mMascotas= mConstrutorMascotas.obtenerMascotas();
        mostrarContactosRV();
    }

    @Override
    public void mostrarContactosRV() {
        mIRecyclerViewFragmentView.inicializarAdaptador(mIRecyclerViewFragmentView.crearAdaptador(mMascotas));
        mIRecyclerViewFragmentView.generarLayoutVertical();
    }
}
