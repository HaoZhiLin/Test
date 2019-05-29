package max.jy.hzl.test.contract;

import max.jy.hzl.test.MeiTuBean;

/**
 * Created by asus on 2019/5/29.
 */

public interface MeiContract {
    interface Model {
        void  getData(Icallback icallback);
    }

    interface View {
        void  getData(MeiTuBean meiTuBean);
    }

    interface Presenter {
        void  getData();
    }

    interface Icallback {
        void  getData(MeiTuBean meiTuBean);
    }
}
