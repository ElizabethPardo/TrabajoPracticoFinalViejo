package com.example.trabajopracticofinal.ui.contratos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.trabajopracticofinal.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import modelo.Contrato;

public class ContratoAdapter extends ArrayAdapter<Contrato> {

    private  Context context;
    private List<Contrato> contratos;
    private LayoutInflater li;

    public ContratoAdapter(@NonNull Context context, int resource, @NonNull List<Contrato> objects, LayoutInflater layoutInflater) {
        super(context, resource, objects);

        this.context=context;
        this.contratos=objects;
        this.li=layoutInflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item= convertView;

        if(item == null)
        {
            item= li.inflate(R.layout.contrato_fragment,parent,false);
        }

        Contrato contrato =contratos.get(position);
        TextInputEditText fechaIngreso= item.findViewById(R.id.etdFechaIngreso);
        TextInputEditText fechaSalida= item.findViewById(R.id.etdFechaSalida);
        TextInputEditText importe=item.findViewById(R.id.etdImporte);

        fechaIngreso.setText(contrato.getFechaIngreso());
        fechaSalida.setText(contrato.getFechaSalida());
        importe.setText(" $" +(int) contrato.getImporte());

        return  item;
    }
}