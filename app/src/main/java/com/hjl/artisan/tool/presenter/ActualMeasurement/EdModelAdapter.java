package com.hjl.artisan.tool.presenter.ActualMeasurement;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.hjl.artisan.R;
import com.hjl.artisan.app.Contants;
import com.hjl.artisan.tool.view.ActualMeasurement.ActualMeasurementEndActivity;
import com.hjl.artisan.tool.view.ActualMeasurement.EdModelViewHolder;
import com.wusy.wusylibrary.base.BaseRecyclerAdapter;
import com.wusy.wusylibrary.util.CommonUtil;
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean;

public class EdModelAdapter extends BaseRecyclerAdapter<ModuleViewBean> {
    private int bingIndex=0;
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
            bingIndex++;
            EdModelViewHolder moduleViewHolder= (EdModelViewHolder) holder;
            moduleViewHolder.getTv().setText(getList().get(position).getTitle());
            if(getList().get(position).getIndex()!=null){
                moduleViewHolder.getEd().setText(getList().get(position).getIndex().toString());
            }
            if(getList().get(position).getIndex()!=null){
                moduleViewHolder.getEd().setText(getList().get(position).getIndex().toString());
            }
            TextWatcher textWatcher=new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if(CommonUtil.isNull(moduleViewHolder.getEd().getText().toString()))
                        getList().get(position).setIndex(null);
                    else getList().get(position).setIndex(moduleViewHolder.getEd().getText().toString());
                }
            };
            moduleViewHolder.getEd().addTextChangedListener(textWatcher);
            if(bingIndex<=getList().size()){
                ActualMeasurementEndActivity.Companion.getEditTextList().add(moduleViewHolder.getEd());
                moduleViewHolder.getEd().setOnFocusChangeListener((v, hasFocus) -> {
                    if(hasFocus){
                        ActualMeasurementEndActivity.Companion.setCurrentEditText(moduleViewHolder.getEd());
                        for (int i=0;i< ActualMeasurementEndActivity.Companion.getEditTextList().size();i++){
                            if(moduleViewHolder.getEd()==ActualMeasurementEndActivity.Companion.getEditTextList().get(i)){
                                ActualMeasurementEndActivity.Companion.setCurrentIndext(i);
                            }
                        }
                    }
                });
            }
        }
    }
}
