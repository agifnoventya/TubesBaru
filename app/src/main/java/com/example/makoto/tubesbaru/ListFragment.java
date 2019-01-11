package com.example.makoto.tubesbaru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment extends Fragment {
    //variabel global
    ListView listView;
    //mmebuat array baru
    String[] Baju = {"Baju 1","Baju 2","Baju 3","Baju4","Celana 1","Celana 2"};
    //memanggil gambar
    int[] BajuImage = {R.drawable.body1,R.drawable.body2,R.drawable.body3,R.drawable.body4,R.drawable.legs1,R.drawable.legs2};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        //finding listview
        listView = rootView.findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),Detail.class);
                intent.putExtra("name",Baju[position]);
                intent.putExtra("image",BajuImage[position]);
                startActivity(intent);

            }
        });
        return rootView;
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return BajuImage.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.item_baju,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.txtJudul);
            ImageView image = view1.findViewById(R.id.imgBaju);
            name.setText(Baju[i]);
            image.setImageResource(BajuImage[i]);
            return view1;



        }
    }
}
