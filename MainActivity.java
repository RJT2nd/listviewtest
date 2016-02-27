package rjt2nd.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] painMeds = {"Acetaminophen","Benzocaine","Bromfenac","Buprenorphine","Butorphanol",
                "Capsaicin","Celecoxib","Codeine","Dibucaine","Diclofenac","Diflunisal","Etodolac",
                "Fenoprofen","Flurbiprofen","Hydrocodone","Hydromorphone","Ibuprofen","Indomethacin"
                ,"Ketoprofen","Ketorolac","Levorphanol","Lidocaine","Meclofenamate","Mefenamic Acid"
                ,"Meloxicam","Meperidine","Methadone","Morphine","Nabumetone","Nalbuphine",
                "Naproxen","Oxaprozin","Oxycodone","Oxymorphone","Pentazocine","Phenylbutazone",
                "Piroxicam","Propoxyphene","Sulindac","Tapentadol","Tolmetin","Tramadol"};

        ListAdapter theAdapter = new MyAdapter(this, painMeds);

        ListView theListView = (ListView) findViewById(R.id.painListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String medPicked = "You selected " + String.valueOf(parent.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, medPicked, Toast.LENGTH_LONG).show();
            }
        });
    }
}
