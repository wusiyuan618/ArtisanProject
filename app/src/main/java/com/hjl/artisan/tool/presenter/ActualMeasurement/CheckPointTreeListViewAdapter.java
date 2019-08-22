package com.hjl.artisan.tool.presenter.ActualMeasurement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.hjl.artisan.R;
import com.hjl.artisan.tool.bean.ActualMeasurement.CheckPointTreeBean;
import com.hjl.artisan.treeList.Node;
import com.hjl.artisan.treeList.TreeListViewAdapter;

import java.util.List;

public class CheckPointTreeListViewAdapter extends TreeListViewAdapter<CheckPointTreeBean> {
	public CheckPointTreeListViewAdapter(ListView mTree, Context context,
										 List<CheckPointTreeBean> datas, int defaultExpandLevel, boolean isHide)
			throws IllegalArgumentException, IllegalAccessException {
		super(mTree, context, datas, defaultExpandLevel,isHide);
	}

	@SuppressWarnings("unchecked")
	@Override
	public View getConvertView(Node node, int position, View convertView,
							   ViewGroup parent) {
		ViewHolder viewHolder = null;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_tree, parent, false);
			viewHolder = new ViewHolder();
			viewHolder.icon =  convertView
					.findViewById(R.id.id_treenode_icon);
			viewHolder.label = convertView
					.findViewById(R.id.id_treenode_name);
			viewHolder.tvFinish=convertView.findViewById(R.id.tvFinish);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		if (node.getIcon() == -1) {
			viewHolder.icon.setVisibility(View.INVISIBLE);
		} else {
			viewHolder.icon.setVisibility(View.VISIBLE);
			viewHolder.icon.setImageResource(node.getIcon());
		}
		viewHolder.label.setText(node.getName());
		if(node.getQualifiendProbability()==null)
			viewHolder.tvFinish.setText("合格率:0.0%");
		else{
			String f=(node.getQualifiendProbability()*100)+"";
			if(f.length()>5){
				f=f.substring(0,5);
			}
			viewHolder.tvFinish.setText("合格率:"+f+"%");
		}
		if(node.getLevel()==0) viewHolder.tvFinish.setVisibility(View.VISIBLE);
		else viewHolder.tvFinish.setVisibility(View.GONE);

		return convertView;
	}
	private final class ViewHolder
	{
		ImageView icon;
		TextView label,tvFinish;
	}

}
