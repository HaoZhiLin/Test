package max.jy.hzl.test.model;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import max.jy.hzl.test.MeiTuBean;
import max.jy.hzl.test.api.ApiService;
import max.jy.hzl.test.contract.MeiContract;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asus on 2019/5/29.
 */

public class MeiModel implements MeiContract.Model {
    @Override
    public void getData(final MeiContract.Icallback icallback) {
            new Retrofit.Builder()
                    .baseUrl(ApiService.url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                    .create(ApiService.class)
                    .getData()
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<MeiTuBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(MeiTuBean meiTuBean) {
                            icallback.getData(meiTuBean);
                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
    }
}
