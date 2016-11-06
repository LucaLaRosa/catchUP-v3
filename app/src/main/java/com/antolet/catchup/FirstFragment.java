package com.antolet.catchup;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FirstFragment extends Fragment {


    MapView mMapView;
    private GoogleMap googleMap;
    private Circle mCircle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflat and return the layout
        View v = inflater.inflate(R.layout.fragment_location_info, container,
                false);
        mMapView = (MapView) v.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();// needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        googleMap = mMapView.getMap();
        // latitude and longitude

        // create marker
        MarkerOptions marker = new MarkerOptions().position(new LatLng( 44.80330734, 10.318977399999994)).title("Emma").snippet("23 YO");

        // Changing marker icon
        marker.icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ROSE));

        // adding marker1
        googleMap.addMarker(marker);
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(44.8033073, 10.3593354)).zoom(18).build();
        googleMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));
        googleMap.setMyLocationEnabled(true);

        //adding marker2
        MarkerOptions marker2 = new MarkerOptions().position(new LatLng(44.7877344, 10.318977399999994)).title("Giulia").snippet("21 YO");
        marker2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.addMarker(marker2);

        // adding marker3
        MarkerOptions marker3 = new MarkerOptions().position(new LatLng(44.787506, 10.359629)).title("Carmen").snippet("19 YO");


        marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr1));

        googleMap.addMarker(marker3);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a " + arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });


        // adding marker4
        MarkerOptions marker4 = new MarkerOptions().position(new LatLng(44.787298, 10.360195)).title("Sara").snippet("26 YO");

        marker4.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr2));

        googleMap.addMarker(marker4);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a "+arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });

        // adding marker5
        MarkerOptions marker5 = new MarkerOptions().position(new LatLng(44.786511, 10.358867)).title("Amanda").snippet("25 YO");

        marker5.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr3));

        googleMap.addMarker(marker5);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a "+arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });


        // adding marker6 -campus
        MarkerOptions marker6 = new MarkerOptions().position(new LatLng(44.764642, 10.312136)).title("Amanda").snippet("25 YO");

        marker6.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr3));

        googleMap.addMarker(marker6);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a "+arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });

        // adding marker7 -campus
        MarkerOptions marker7 = new MarkerOptions().position(new LatLng(44.764919, 10.312104)).title("Silvia").snippet("22 YO");

        marker7.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr1));

        googleMap.addMarker(marker7);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a "+arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });

        // adding marker8 -campus
        MarkerOptions marker8 = new MarkerOptions().position(new LatLng(44.764919, 10.311338)).title("Marta").snippet("19 YO");

        marker8.icon(BitmapDescriptorFactory.fromResource(R.drawable.usr2));

        googleMap.addMarker(marker8);
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker arg0) {

                Toast.makeText(getActivity(), "Manda un messaggio a "+arg0.getTitle(), Toast.LENGTH_SHORT).show();
                Fragment mFragment = new MessageFragment();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mapView, mFragment).commit();
            }
        });

//ant: ---------------------------- /blocca lo scrolling della mappa

        /*googleMap.getUiSettings().setZoomControlsEnabled(false);
        googleMap.getUiSettings().setScrollGesturesEnabled(false);
        mMapView.getMap().getUiSettings().setAllGesturesEnabled(false);
*/
//---------------------------------

        double radiusInMeters = 10.0;
        //red outline
        int strokeColor = 0xffff0000;
        //opaque red fill
        int shadeColor = 0x44ff0000;


        CircleOptions circleOptions = new CircleOptions().center(new LatLng(44.8033073, 10.318977399999994)).radius(radiusInMeters).fillColor(shadeColor).strokeColor(strokeColor).strokeWidth(2);
        mCircle = googleMap.addCircle(circleOptions);
        GeoLocationHandler geoHandler = new GeoLocationHandler(getActivity().getApplicationContext());
        LatLng loc = new LatLng(44.8033073, 10.318977399999994);


        // Perform any camera updates here
        googleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
            @Override
            public void onMyLocationChange(Location location) {

                CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude()));
                CameraUpdate zoom=CameraUpdateFactory.zoomTo(18);
                googleMap.moveCamera(center);
                googleMap.animateCamera(zoom);

            }
        });
        return v;
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

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if (permissions.length == 1 &&
                permissions[0] == Manifest.permission.ACCESS_FINE_LOCATION &&
                grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            googleMap.setMyLocationEnabled(true);
        } else {
            // Permission was denied. Display an error message.
        }
    }




}
