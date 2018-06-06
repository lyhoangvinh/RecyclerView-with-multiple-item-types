package lyhoangvinh.com.testrec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lyhoangvinh.com.testrec.adapter.MyAdapter;
import lyhoangvinh.com.testrec.adapter.SpaceDividerItemDecoration;
import lyhoangvinh.com.testrec.object.Persons;
import lyhoangvinh.com.testrec.object.SectionDataModel;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rcv)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        RecyclerView rcv = findViewById(R.id.rcv);
//        rcv.setHasFixedSize(true);
//        MainAdapter adapter = new MainAdapter(createDummyData());
//        adapter.setContext(this);
//        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
//        rcv.setAdapter(adapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        MyAdapter myAdapter = new MyAdapter();
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.addItemDecoration(new SpaceDividerItemDecoration(getResources().getDimensionPixelOffset(R.dimen.divider)));
        myAdapter.setItemList(ItemBuilder.randomList(this));


    }

    public List<SectionDataModel> createDummyData() {
        List<SectionDataModel> allSampleData = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {

            SectionDataModel dm = new SectionDataModel();

            dm.setHeaderTitle("Section " + i);

            List<Persons> singleItem = new ArrayList<>();
            for (int j = 0; j <= 10; j++) {
                singleItem.add(new Persons("Item " + j));
            }

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);
        }
        return allSampleData;
    }
}
