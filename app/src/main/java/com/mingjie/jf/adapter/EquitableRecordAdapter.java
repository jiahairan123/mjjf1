package com.mingjie.jf.adapter;

import android.content.Context;
import android.widget.ListView;

import com.mingjie.jf.bean.EquitableRecordBean;
import com.mingjie.jf.holder.BaseHolder;
import com.mingjie.jf.holder.EquitableRecordHolder;

import java.util.List;

/**
 * <p>项目名称：CunGuanKX
 * <p>包   名： com.minghao.cgkx.adapter
 * <p>版   权： 深圳市铭淏网络科技有限公司 2016
 * <p>描   述： 转让记录
 * <p>创 建 人： shenfei
 * <p>创建时间： 2016-12-19 20:58
 * <p>当前版本： V1.0.0
 * <p>修订历史： (版本、修改时间、修改人、修改内容)
 */
public class EquitableRecordAdapter extends BaseListViewAdapter<EquitableRecordBean.DataBean>
{
    public EquitableRecordAdapter(Context mContext, List<EquitableRecordBean.DataBean> result, ListView mListView)
    {
        super(mContext, result, mListView);
    }

    @Override
    protected BaseHolder<EquitableRecordBean.DataBean> getItemHolder()
    {
        return new EquitableRecordHolder(this, mContext, mListView);
    }
}
