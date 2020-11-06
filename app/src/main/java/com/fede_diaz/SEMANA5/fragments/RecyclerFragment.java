package com.fede_diaz.SEMANA5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fede_diaz.SEMANA5.IRecyclerViewFragmentView;
import com.fede_diaz.SEMANA5.R;
import com.fede_diaz.SEMANA5.adapter.ContactoAdapter;
import com.fede_diaz.SEMANA5.pojo.Mascotas;
import com.fede_diaz.SEMANA5.presenter.IRecyclerViewFragmentPresenter;
import com.fede_diaz.SEMANA5.presenter.RecylcerViewFragmentPresenter;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment implements IRecyclerViewFragmentView {
    private RecyclerView listaMascotas;
    ArrayList<Mascotas> mMascotas;
    private IRecyclerViewFragmentPresenter presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recycler,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.recyclerview);
        presenter= new RecylcerViewFragmentPresenter(this,getContext());
        return v;
    }



    @Override
    public void generarLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public ContactoAdapter crearAdaptador(ArrayList<Mascotas> mascotas) {
        ContactoAdapter adapter =  new ContactoAdapter(mascotas,getActivity());
        return adapter;
    }

    @Override
    public void inicializarAdaptador(ContactoAdapter adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
