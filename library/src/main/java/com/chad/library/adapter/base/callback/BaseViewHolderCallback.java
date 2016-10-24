package com.chad.library.adapter.base.callback;

import android.view.View;

/**
 * Author    lingchen
 * Email     838878458@qq.com
 * Time      2016/10/24
 * Function  BaseViewHolder监听器
 */

public interface BaseViewHolderCallback {

    /**
     * 创建BaseViewHolder
     *
     * @param view
     */
    void onCreateBaseViewHolder(View view);

    /**
     * 适配器
     */
    abstract class BaseViewHolderCallbackAdpater implements BaseViewHolderCallback {
        @Override
        public void onCreateBaseViewHolder(View view) {

        }
    }
}
