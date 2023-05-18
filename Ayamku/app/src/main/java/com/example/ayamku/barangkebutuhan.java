package com.example.ayamku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class barangkebutuhan extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String API_URL = "https://9d7b-103-109-209-244.ngrok-free.app/api/brg_kbth_ayam.php";

    private ListView listView;
    private List<Kebutuhan> kebutuhanList;
    private KebutuhanAdapter kebutuhanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barangkebutuhan);

        listView = findViewById(R.id.listView);
        kebutuhanList = new ArrayList<>();
        kebutuhanAdapter = new KebutuhanAdapter(this, kebutuhanList);
        listView.setAdapter(kebutuhanAdapter);

        fetchKebutuhanData();
    }

    private void fetchKebutuhanData() {
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, API_URL, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject jsonObject = response.getJSONObject(i);
                                String idKebutuhan = jsonObject.getString("id_kbth");
                                String namaKebutuhan = jsonObject.getString("nama_kbth");
                                String jumlahKebutuhan = jsonObject.getString("jumlah_kbth");

                                Kebutuhan kebutuhan = new Kebutuhan(idKebutuhan, namaKebutuhan, jumlahKebutuhan);
                                kebutuhanList.add(kebutuhan);
                            }

                            kebutuhanAdapter.notifyDataSetChanged();
                        } catch (JSONException e) {
                            Log.e(TAG, "Error parsing JSON: " + e.getMessage());
                            Toast.makeText(barangkebutuhan.this, "Error parsing JSON", Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e(TAG, "Error fetching kebutuhan data: " + error.getMessage());
                        Toast.makeText(barangkebutuhan.this, "Error fetching kebutuhan data", Toast.LENGTH_SHORT).show();
                    }
                });

        Volley.newRequestQueue(this).add(request);
    }
}