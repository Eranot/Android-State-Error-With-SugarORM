package com.example.eranot.androidstateerrorwithsugarorm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.evernote.android.state.Bundler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eranot on 08/08/17.
 */

public class AttributeBundler implements Bundler<ArrayList<Attribute>> {

    @Override
    public void put(@NonNull String key, @NonNull ArrayList<Attribute> value, @NonNull Bundle bundle) {
        bundle.putSerializable("SugarRecord", value);
    }

    @Nullable
    @Override
    public ArrayList<Attribute> get(@NonNull String key, @NonNull Bundle bundle) {
        return (ArrayList<Attribute>) bundle.getSerializable("SugarRecord");
    }
}