package com.feelsgoodman.getinline.mvp.view;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * Created by noxqs on 03.04.16..
 */
public interface BaseView {

    void showProgress();
    void hideProgress();
    void showError(String message);
    void showDialog(String title, String message, MaterialDialog.SingleButtonCallback positiveCallback,
            MaterialDialog.SingleButtonCallback negativeCallback, String positiveButtonText, String negativeButtonText);

}
