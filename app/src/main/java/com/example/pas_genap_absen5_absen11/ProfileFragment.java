package com.example.pas_genap_absen5_absen11;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



    public class ProfileFragment extends Fragment {

        private RecyclerView recyclerView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_profile, container, false);

            recyclerView = view.findViewById(R.id.rvBiodata);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            List<BiodataModel> biodataList = new ArrayList<>();

            // ✅ Tambahkan data lengkap sesuai model terbaru (termasuk email dan no HP)
            biodataList.add(new BiodataModel(
                    "Alif Nawaf Ahmad",
                    "Alif",
                    "5",
                    "Kolaborator",
                    "alif.nawaf@example.com",
                    "081234567890"
            ));

            biodataList.add(new BiodataModel(
                    "Desnian Danis Maulana",
                    "Danis",
                    "11",
                    "Project Leader",
                    "danis.desnian@example.com",
                    "0895321647472"
            ));

            BiodataAdapter adapter = new BiodataAdapter(biodataList);
            recyclerView.setAdapter(adapter);

            return view;
        }
    }

