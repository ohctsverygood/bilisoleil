package com.yoyiyi.soleil.widget.section;

import android.view.View;

import com.yoyiyi.soleil.R;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2017/6/8 18:00
 * 描述:增加头部或者尾部
 */

public class HeadOrFooterSection extends StatelessSection {

    public View mItemView;

    public HeadOrFooterSection(int headerResourceId) {
        super(headerResourceId, R.layout.layout_empty);
    }

    @Override
    public void onBindHeaderViewHolder(ViewHolder holder) {
        mItemView = holder.itemView;
    }
}