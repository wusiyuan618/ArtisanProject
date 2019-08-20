package com.hjl.artisan.tool.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.hjl.artisan.R;

public class EdModelViewHolder extends RecyclerView.ViewHolder{
    public TextView tv;
    public EditText ed;
    public EdModelViewHolder(View itemView) {
        super(itemView);
        ed= (EditText) itemView.findViewById(R.id.edModelItem);
        tv= (TextView) itemView.findViewById(R.id.tvModelItem);
    }
}
