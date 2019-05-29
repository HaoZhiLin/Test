package max.jy.hzl.test.presenter;

import max.jy.hzl.test.MeiTuBean;
import max.jy.hzl.test.contract.MeiContract;
import max.jy.hzl.test.model.MeiModel;

/**
 * Created by asus on 2019/5/29.
 */

public class MeiPresenter implements MeiContract.Presenter {
    private final MeiModel meiModel;
    private MeiContract.View view;

    public MeiPresenter(MeiContract.View view) {
        this.view = view;
        meiModel = new MeiModel();
    }

    @Override
    public void getData() {
        if(meiModel!=null){
            meiModel.getData(new MeiContract.Icallback() {
                @Override
                public void getData(MeiTuBean meiTuBean) {
                    view.getData(meiTuBean);
                }
            });
        }
    }
}
