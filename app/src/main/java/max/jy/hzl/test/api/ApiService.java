package max.jy.hzl.test.api;

import io.reactivex.Observable;
import max.jy.hzl.test.MeiTuBean;
import retrofit2.http.GET;

/**
 * Created by asus on 2019/5/29.
 */

public interface ApiService {
    String url="https://www.apiopen.top/";
    @GET("meituApi?page=3")
    Observable<MeiTuBean>   getData();
}
