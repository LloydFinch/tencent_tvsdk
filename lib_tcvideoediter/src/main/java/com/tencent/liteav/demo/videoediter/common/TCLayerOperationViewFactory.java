package com.tencent.liteav.demo.videoediter.common;

import android.content.Context;
import android.view.View;


import com.tencent.liteav.demo.videoediter.R;
import com.tencent.liteav.demo.videoediter.common.widget.layer.TCLayerOperationView;

/**
 * Created by hanszhli on 2017/6/21.
 * <p>
 * 创建 OperationView的工厂
 */

public class TCLayerOperationViewFactory {

    public static TCLayerOperationView newOperationView(Context context) {
        return (TCLayerOperationView) View.inflate(context, R.layout.layout_layer_operation_view, null);
    }
}
