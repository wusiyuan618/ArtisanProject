package com.hjl.artisan.tool.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.hjl.artisan.R;
import com.hjl.artisan.tool.view.EdModelViewHolder;
import com.wusy.wusylibrary.base.BaseRecyclerAdapter;
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean;

public class EdModelAdapter extends BaseRecyclerAdapter<ModuleViewBean> {

    private static final String TAG = "ModuleViewAdapter";

    public EdModelAdapter(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.ViewHolder onMyCreateViewHolder(ViewGroup parent, int viewType) {
        EdModelViewHolder holder = new EdModelViewHolder(LayoutInflater.from(
                getContext()).inflate(R.layout.item_edmodel, parent, false));
        return holder;
    }

    @Override
    public void onMyBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof EdModelViewHolder){
            EdModelViewHolder moduleViewHolder= (EdModelViewHolder) holder;
            moduleViewHolder.tv.setText(getList().get(position).getTitle());
            moduleViewHolder.ed.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    getList().get(position).setIndex(moduleViewHolder.ed.getText().toString());
                }
            });

        }
    }
}
