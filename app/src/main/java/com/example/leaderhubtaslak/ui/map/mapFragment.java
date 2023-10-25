package com.example.leaderhubtaslak.ui.map;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.leaderhubtaslak.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;


public class mapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap googleMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MapView mapView = (MapView) inflater.inflate(R.layout.fragment_map,container,false);

        mapView.getMapAsync(this);

        return mapView;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        this.googleMap = googleMap;

        //41.0069, 29.1899



        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(41.0069,29.1899),15));

        googleMap.setMaxZoomPreference(15);
    }
}