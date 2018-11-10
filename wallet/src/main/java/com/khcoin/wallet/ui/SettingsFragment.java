package com.bitcoinfinal.wallet.ui;

import android.os.Bundle;
import android.support.v4.preference.PreferenceFragment;

import com.bitcoinfinal.wallet.R;

/**
 * @author John L. Jegutanis
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        addPreferencesFromResource(R.xml.preferences);
    }
}
