package com.example.pas_genap_absen5_absen11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BiodataAdapter extends RecyclerView.Adapter<BiodataAdapter.ViewHolder> {
    private List<BiodataModel> biodataList;

    public BiodataAdapter(List<BiodataModel> biodataList) {
        this.biodataList = biodataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_biodata, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BiodataModel biodata = biodataList.get(position);
        holder.tvNama.setText(biodata.getNamaLengkap());
        holder.tvPanggilan.setText("Nama panggilan: " + biodata.getNamaPanggilan());
        holder.tvAbsen.setText("Absen: " + biodata.getAbsen());
        holder.tvPeran.setText("Peran: " + biodata.getPeran());
        holder.tvEmail.setText("Email: " + biodata.getEmail());
        holder.tvNoHp.setText("No HP: " + biodata.getNoHp());
    }

    @Override
    public int getItemCount() {
        return biodataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvPanggilan, tvAbsen, tvPeran, tvEmail, tvNoHp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvPanggilan = itemView.findViewById(R.id.tvPanggilan);
            tvAbsen = itemView.findViewById(R.id.tvAbsen);
            tvPeran = itemView.findViewById(R.id.tvPeran);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvNoHp = itemView.findViewById(R.id.tvNoHp);
        }
    }
}
