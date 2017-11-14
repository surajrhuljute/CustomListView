package nareshit.com.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeListView();
    }

    private void initializeListView() {
        listView = (ListView) findViewById(R.id.listView);

      final  String[] donorname = {"Suraj Huljue", "Abhishek Burkule", "Braveheart", "The Patriot", "Pompeii", "Fast and Furious",
                "Die Hard", "The Fifth element", "X-Men", "Transformers", "Steve Jobs"};

        String[] bloodgroup = {"O", "AB+", "AB-", "A", "B+", "O",
                "O", "AB+", "AB-", "A", "B+"};

        MyAdapter adapter = new MyAdapter(this, donorname, bloodgroup);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = donorname[position];

                Toast.makeText(MainActivity.this, item+" is clicked", Toast.LENGTH_LONG).show();

          //      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            //            android.R.layout.simple_list_item_1, android.R.id.);
        Intent intent = new Intent(MainActivity.this,Details.class);
           startActivity(intent);

            }
        });
    }
    }




