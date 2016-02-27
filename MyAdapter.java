package rjt2nd.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Robert Thomas on 12/20/2015.
 */
class MyAdapter extends ArrayAdapter{

    private final Context context;
    private final String[] values;

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
        this.values = values;
        this.context = context;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflator = LayoutInflater.from(getContext());

        View theView = theInflator.inflate(R.layout.row_layout2, parent, false);

        String painMed = (String) getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.painTextView);

        theTextView.setText(painMed);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView);

        theImageView.setImageResource(R.drawable.green);

        String s = values[position];

        if(s.equals("Acetaminophen")){
            theImageView.setImageResource(R.drawable.green);
        }else if(s.equals("Benzocaine")){
            theImageView.setImageResource(R.drawable.red);
        }else if(s.equals("Bromfenac")){
            theImageView.setImageResource(R.drawable.red);
        }else if(s.equals("Buprenorphine")){
            theImageView.setImageResource(R.drawable.green);
        }else if(s.equals("Butorphanol")){
            theImageView.setImageResource(R.drawable.yellow);
        }else{
            int r = (int) (Math.random()*3+1);
            if(r==1)
                theImageView.setImageResource(R.drawable.green);
            if(r==2)
                theImageView.setImageResource(R.drawable.yellow);
            if(r==3)
                theImageView.setImageResource(R.drawable.red);
        }

        return theView;
    }
}
