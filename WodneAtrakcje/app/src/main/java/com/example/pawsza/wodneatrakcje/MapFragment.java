package com.example.pawsza.wodneatrakcje;

import android.app.Fragment;
import android.os.Bundle;
//import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by pawsza on 26.06.17.
 */

public class MapFragment  extends Fragment {

    MapView mMapView;
    private GoogleMap googleMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_maps, container, false);

        mMapView = (MapView) rootView.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume(); // needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                // For showing a move to my location button
              //  googleMap.setMyLocationEnabled(true);


                // For dropping a marker at a point on the Map
                LatLng sydney = new LatLng(50.6517462, 17.9023557);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Wodna Nuta Opole").snippet("Adres: Ul. Prószkowska 96, 45-758 Opole"));
                sydney = new LatLng(50.6647011, 17.9230033);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Kryta Pływalnia Akwarium").snippet("Adres: ul.Ozimska 48B, 45-368 Opole"));


                sydney = new LatLng(51.0910697, 17.0300844);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Wrocławski Park Wodny S.A").snippet("Adres: ul. Borowska 99, 50-558 Wrocław"));

                sydney = new LatLng(51.1200257, 16.9546067);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Fitness Academy Rogowska").snippet("Adres: ul.Rogowska 52A, 50-001 Wrocław"));
                sydney = new LatLng(51.1205876, 17.0092269);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Basen WKS Śląsk").snippet("Adres: ul. Racławicka 62, 11-400 Wrocław"));


                sydney = new LatLng(50.6966867, 17.9231535);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Jezioro Silesia").snippet("Adres: ul. Aleja Przyjaźni, 45-572 Opole"));
                sydney = new LatLng(50.6484698, 17.9404669);
                googleMap.addMarker(new MarkerOptions().position(sydney).title("Kąpielisko Bolko").snippet("Adres: ul. aleja Przyjaźni 45-572 Opole"));


                // For zooming automatically to the location of the marker
                CameraPosition cameraPosition = new CameraPosition.Builder().target(sydney).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        });

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}


