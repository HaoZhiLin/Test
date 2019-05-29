package max.jy.hzl.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import max.jy.hzl.test.adapter.RLVadapter;
import max.jy.hzl.test.contract.MeiContract;
import max.jy.hzl.test.presenter.MeiPresenter;

public class MainActivity extends AppCompatActivity implements MeiContract.View{

    private RecyclerView mRlv;
    private RLVadapter adaptetr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initMeiPresenter();
    }

    private void initMeiPresenter() {
        new MeiPresenter(this).getData();
    }

    private void initView() {
        mRlv = (RecyclerView) findViewById(R.id.rlv);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        adaptetr = new RLVadapter(this);

        mRlv.setAdapter(adaptetr);
    }

    @Override
    public void getData(MeiTuBean meiTuBean) {
        List<MeiTuBean.DataEntity> data = meiTuBean.getData();
        adaptetr.setList((ArrayList<MeiTuBean.DataEntity>) data);
    }
}
