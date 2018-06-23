package kwaai.com.exampleepoxy;

import com.airbnb.epoxy.AutoModel;
import com.airbnb.epoxy.Typed2EpoxyController;

public class MyEpoxyController extends Typed2EpoxyController<String, String> {

    @AutoModel
    HeaderViewModel_ header_;

    @AutoModel
    IntroductionViewBindingModel_ introductionViewBindingModel_;

    @Override
    protected void buildModels(String data1, String data2) {
        header_.title(data1).addTo(this);
        introductionViewBindingModel_.title(data2).addTo(this);
    }
}
