package pens.lab.app.belajaractivity.modul.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter>
        implements ProfileContract.View {

    TextView tvEmail;
    TextView tvPassword;
    Bundle bundle;

    public ProfileFragment(Bundle bundle) {
        this.bundle = bundle;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        tvEmail = fragmentView.findViewById(R.id.tv_email);
        tvPassword = fragmentView.findViewById(R.id.tv_password);

        if (bundle != null) {
            String email = bundle.getString("EMAIL");
            String passowrd = bundle.getString("PASSWORD");

            setEmail(email);
            setPassword(passowrd);
        }

        setTitle("Profile View");

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setEmail(String email) {
        tvEmail.setText(email);
    }

    @Override
    public void setPassword(String password) {
        tvPassword.setText(password);
    }
}
