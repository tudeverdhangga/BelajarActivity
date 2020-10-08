package pens.lab.app.belajaractivity.modul.profile;

import android.os.Bundle;
import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;

public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment(getIntent().getExtras());
        setCurrentFragment(profileFragment, false);
    }
}
