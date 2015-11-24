package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bombeiros.pr.gov.br.sisgv.R;
import domain.RML;
import interfaces.RecyclerViewOnClickListenerHack;

/**
 * Created by Tadeu on 09/11/2015.
 */
public class RMLAdapter extends RecyclerView.Adapter<RMLAdapter.MyViewHolder> {

    private List<RML> mList;
    private LayoutInflater mLayoutInflater;
    private RecyclerViewOnClickListenerHack mRecyclerViewOnClickListenerHack;


    public RMLAdapter(Context c, List<RML> l) {
        mList = l;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("LOG", "onCreateViewHolder()");
        View v = mLayoutInflater.inflate(R.layout.item_home, parent, false);
        MyViewHolder mvh = new MyViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Log.i("LOG", "onBindViewHolder()");
        //myViewHolder.ivRML.setImageResource(mList.get(position).getPhoto());
        myViewHolder.tvRML1.setText(mList.get(position).getPGV());
        myViewHolder.tvRML2.setText(mList.get(position).getData());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setRecyclerViewOnClickListenerHack(RecyclerViewOnClickListenerHack r) {
        mRecyclerViewOnClickListenerHack = r;
    }


    public void addListItem(RML c, int position) {
        mList.add(c);
        notifyItemInserted(position);
    }


    public void removeListItem(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView ivRML;
        public TextView tvRML1;
        public TextView tvRML2;

        public MyViewHolder(View itemView) {
            super(itemView);

            ivRML = (ImageView) itemView.findViewById(R.id.iv_rml);
            tvRML1 = (TextView) itemView.findViewById(R.id.tv_rml_1);
            tvRML2 = (TextView) itemView.findViewById(R.id.tv_rml_2);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mRecyclerViewOnClickListenerHack != null) {
                mRecyclerViewOnClickListenerHack.onClickListener(v, getPosition());
            }
        }
    }

}
