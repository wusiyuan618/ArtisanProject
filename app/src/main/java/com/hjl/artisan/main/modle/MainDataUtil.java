package com.hjl.artisan.main.modle;


import android.content.Context;

import android.util.Log;
import com.hjl.artisan.R;
import com.hjl.artisan.home.view.HomeView;
import com.hjl.artisan.me.view.MeView;
import com.hjl.artisan.tool.view.ToolView;
import com.wusy.wusylibrary.view.bottomSelect.BottomSelectBean;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by XIAO RONG on 2018/5/6.
 */

public class MainDataUtil {
    private static MainDataUtil mainDataUtil;
    private List<BottomSelectBean> bottomSelectBeanList;

    private MainDataUtil() {

    }

    public static synchronized MainDataUtil getInstance() {
        if (mainDataUtil == null) mainDataUtil = new MainDataUtil();
        return mainDataUtil;
    }

    /**
     * 底部选择器构建数据
     *
     * @return
     */
    public List<BottomSelectBean> getBottomSelectData() {
        bottomSelectBeanList = new ArrayList<>();

        //首页构建数据
        BottomSelectBean home = new BottomSelectBean();
        home.setSelect(true);
        home.setTitle("首页");
        home.setNormalIcon(R.mipmap.icon_home_normal);
        home.setSelectIcon(R.mipmap.icon_home_selected);
        home.setFragment(new HomeView());
        home.setListener(() -> {
        });
        //工具构建数据
        BottomSelectBean tool = new BottomSelectBean();
        tool.setSelect(false);
        tool.setTitle("工具");
        tool.setNormalIcon(R.mipmap.icon_tool_normal);
        tool.setSelectIcon(R.mipmap.icon_tool_selected);
        tool.setFragment(new ToolView());
        tool.setListener(() -> {
        });
        //我的构建数据
        BottomSelectBean my = new BottomSelectBean();
        my.setSelect(false);
        my.setTitle("我的");
        my.setNormalIcon(R.mipmap.icon_my_normal);
        my.setSelectIcon(R.mipmap.icon_my_selected);
        my.setFragment(new MeView());
        my.setListener(() -> {
        });
        bottomSelectBeanList.add(home);
        bottomSelectBeanList.add(tool);
        bottomSelectBeanList.add(my);

        return bottomSelectBeanList;
    }
}
