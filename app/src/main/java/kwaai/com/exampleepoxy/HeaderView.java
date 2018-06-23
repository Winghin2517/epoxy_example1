package kwaai.com.exampleepoxy;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.airbnb.epoxy.ModelView;
import com.airbnb.epoxy.TextProp;

import butterknife.BindView;
import butterknife.ButterKnife;

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT, fullSpan=false)
public class HeaderView extends CardView {

    @BindView(R.id.hello)
    TextView hello;

    public HeaderView(Context context) {
        super(context);
        init();
    }


    private void init() {
        inflate(getContext(), R.layout.header_view, this);
        ButterKnife.bind(this);
    }

    @TextProp(defaultRes = R.string.app_name)
    public void setTitle(CharSequence title) {
        this.hello.setText(title);
    }

}
