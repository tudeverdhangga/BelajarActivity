package pens.lab.app.belajaractivity.modul.profile;

public class ProfilePresenter implements ProfileContract.Presenter {
    private final ProfileContract.View view;

    public ProfilePresenter(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void showDataLogin(String email, String password) {
        view.setEmail(email);
        view.setPassword(password);
    }

    @Override
    public void start() {}
}
