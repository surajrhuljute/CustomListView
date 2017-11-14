package nareshit.com.customlistview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by nareshit on 6/13/2017.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    String[] donorname;
    String[] bloodgroup;


    public MyAdapter(Context context, String[] donorname, String[] bloodgroup) {
        this.context = context;
        this.donorname = donorname;
        this.bloodgroup = bloodgroup;
    }

    @Override
    public int getCount() {
        return donorname.length;
    }

    @Override
    public Object getItem(int position) {
        return donorname[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);

        TextView textDonorname = (TextView) view.findViewById(R.id.textView);
        TextView textbloodgroup = (TextView) view.findViewById(R.id.textView3);

        String donornamelist = donorname[position];
        String bloodgrouplist = bloodgroup[position];

        textDonorname.setText(donornamelist);
        textbloodgroup.setText(bloodgrouplist);
        return view;
    }

}
