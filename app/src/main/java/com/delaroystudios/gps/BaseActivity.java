package com.delaroystudios.gps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by delaroy on 8/15/18.
 */

public class BaseActivity extends AppCompatActivity {
    private CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }

    public void addDisposable(Disposable disposable){
        this.compositeDisposable.add(disposable);
    }
}
