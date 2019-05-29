package max.jy.hzl.test;

import java.util.List;

/**
 * Created by asus on 2019/5/29.
 */

public class MeiTuBean {
    /**
     * msg : 成功!
     * code : 200
     * data : [{"createdAt":"2017-08-13T23:43:02.253Z","publishedAt":"2017-08-14T17:04:50.266Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fiiiyfcjdoj20u00u0ju0.jpg"},{"createdAt":"2017-08-10T09:37:52.684Z","publishedAt":"2017-08-11T14:05:53.749Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fiednrydq8j20u011itfz.jpg"},{"createdAt":"2017-08-09T08:16:56.373Z","publishedAt":"2017-08-09T13:49:27.260Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fid5poqfznj20u011imzm.jpg"},{"createdAt":"2017-08-07T23:27:21.296Z","publishedAt":"2017-08-08T11:34:20.37Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fibksd2mbmj20u011iacx.jpg"},{"createdAt":"2017-08-03T07:51:00.249Z","publishedAt":"2017-08-03T12:08:07.258Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi678xgq1ij20pa0vlgo4.jpg"},{"createdAt":"2017-08-02T06:57:11.207Z","publishedAt":"2017-08-02T12:21:45.220Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi502l3eqjj20u00hz41j.jpg"},{"createdAt":"2017-07-31T06:48:15.386Z","publishedAt":"2017-08-01T11:48:20.466Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034gy1fi2okd7dtjj20u011h40b.jpg"},{"createdAt":"2017-07-27T14:13:34.914Z","publishedAt":"2017-07-27T14:16:33.773Z","type":"美图","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhyeyv5qwkj20u00u0q56.jpg"},{"createdAt":"2017-07-26T16:54:59.321Z","publishedAt":"2017-07-26T16:57:39.343Z","type":"美图","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhxe0hfzr0j20u011in1q.jpg"},{"createdAt":"2017-07-24T23:59:02.992Z","publishedAt":"2017-07-25T15:25:42.391Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034gy1fhvf13o2eoj20u011hjx6.jpg"},{"createdAt":"2017-07-24T09:32:49.583Z","publishedAt":"2017-07-24T12:13:11.280Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034gy1fhupzs0awwj20u00u0tcf.jpg"},{"createdAt":"2017-07-21T11:33:34.104Z","publishedAt":"2017-07-21T12:39:43.370Z","type":"美图","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhrcmgo6p0j20u00u00uu.jpg"},{"createdAt":"2017-07-20T08:45:18.437Z","publishedAt":"2017-07-20T15:11:16.10Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhq25406waj20u00u0b29.jpg"},{"createdAt":"2017-07-19T08:21:52.67Z","publishedAt":"2017-07-19T13:23:20.375Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhovjwwphfj20u00u04qp.jpg"},{"createdAt":"2017-07-18T08:32:57.632Z","publishedAt":"2017-07-18T16:12:55.381Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhnqjm1vczj20rs0rswia.jpg"},{"createdAt":"2017-07-14T09:08:23.898Z","publishedAt":"2017-07-17T12:22:21.307Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhj5228gwdj20u00u0qv5.jpg"},{"createdAt":"2017-07-14T09:09:11.591Z","publishedAt":"2017-07-14T13:24:31.177Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhj53yz5aoj21hc0xcn41.jpg"},{"createdAt":"2017-07-13T08:54:16.862Z","publishedAt":"2017-07-13T12:28:15.167Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhhz28n9vyj20u00u00w9.jpg"},{"createdAt":"2017-07-12T08:22:00.873Z","publishedAt":"2017-07-12T13:05:59.766Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhgsi7mqa9j20ku0kuh1r.jpg"},{"createdAt":"2017-07-11T08:18:28.124Z","publishedAt":"2017-07-11T13:46:33.911Z","type":"美图","url":"https://ws1.sinaimg.cn/large/610dc034ly1fhfmsbxvllj20u00u0q80.jpg"}]
     */
    private String msg;
    private int code;
    private List<DataEntity> data;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public class DataEntity {
        /**
         * createdAt : 2017-08-13T23:43:02.253Z
         * publishedAt : 2017-08-14T17:04:50.266Z
         * type : 美图
         * url : https://ws1.sinaimg.cn/large/610dc034ly1fiiiyfcjdoj20u00u0ju0.jpg
         */
        private String createdAt;
        private String publishedAt;
        private String type;
        private String url;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }
    }
}
