package kwaai.com.exampleepoxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.epoxy.EpoxyRecyclerView;

public class MainActivity extends AppCompatActivity {

    private final MyEpoxyController controller = new MyEpoxyController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EpoxyRecyclerView recyclerView = (EpoxyRecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(controller.getAdapter());
        controller.setData("Hello Header", "This is the introduction");
    }
}
