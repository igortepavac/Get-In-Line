package com.feelsgoodman.getinline.activities;

import com.afollestad.materialdialogs.AlertDialogWrapper;
import com.afollestad.materialdialogs.MaterialDialog;
import com.feelsgoodman.getinline.R;
import com.feelsgoodman.getinline.mvp.view.BaseView;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;

/**
 * Created by itepavac on 03/04/16.
 */
public class BaseActivity extends AppCompatActivity implements BaseView {

    private MaterialDialog progressDialog;

    @Override
    public void showProgress() {
        if (progressDialog == null || !progressDialog.isShowing()) {
            progressDialog = new MaterialDialog.Builder(this)
                    .title(R.string.app_name)
                    .content(R.string.please_wait)
                    .progress(true, 0)
                    .build();
            progressDialog.setCanceledOnTouchOutside(false);
        }
        if (!isFinishing()) {
            progressDialog.show();
        }
    }

    @Override
    public void hideProgress() {
        if (progressDialog != null && progressDialog.isShowing() && !isFinishing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showError(String message) {
        final AlertDialogWrapper.Builder matBuilder = new AlertDialogWrapper.Builder(this);
        matBuilder.setTitle(R.string.app_name);

        if (message != null) {
            matBuilder.setMessage(Html.fromHtml(message));
        } else {
            matBuilder.setMessage("");
        }
        matBuilder.setPositiveButton(android.R.string.ok, null);
        if (!isFinishing()) {
            matBuilder.show();
        }
    }

    @Override
    public void showDialog(String title, String message, MaterialDialog.SingleButtonCallback positiveCallback,
            MaterialDialog.SingleButtonCallback negativeCallback, String positiveButtonText, String negativeButtonText) {
        MaterialDialog basicDialog = new MaterialDialog.Builder(this)
                .title(title)
                .content(message)
                .positiveText(positiveButtonText)
                .positiveColor(ContextCompat.getColor(this, R.color.colorAccent))
                .onPositive(positiveCallback)
                .onNegative(negativeCallback)
                .negativeText(negativeButtonText)
                .negativeColor(ContextCompat.getColor(this, R.color.colorAccent))
                .build();
        basicDialog.setCanceledOnTouchOutside(false);

        if (!isFinishing()) {
            basicDialog.show();
        }
    }
}
