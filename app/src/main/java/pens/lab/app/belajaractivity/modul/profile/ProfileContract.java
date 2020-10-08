package pens.lab.app.belajaractivity.modul.profile;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter>{
        void setEmail (String email);
        void setPassword (String password);
    };

    interface Presenter extends BasePresenter {
        void showDataLogin(String email, String password);
    }
}
