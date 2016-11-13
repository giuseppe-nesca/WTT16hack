package wtt.wtt16hack.gui.frag;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import wtt.wtt16hack.R;

/**
 * Created by Davide on 12/11/2016.
 */

public class CustomFragment extends Fragment {

    TextView textView;
    String myText;
    ImageView imageView;
    private int position;

    public CustomFragment(){
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.custom_fragment, container, false);
        imageView = (ImageView) view.findViewById(R.id.image_fragment);
        textView = (TextView) view.findViewById(R.id.text_fragment);

        switch (position) {
            case 0: {
                textView.setText(myText);
                imageView.setEnabled(false);
                break;
            }
            case 1: {
                textView.setEnabled(false);
                imageView.setImageDrawable(getActivity().getDrawable(R.drawable.gesture));
                break;
            }
            case 2: {
                textView.setEnabled(false);
                imageView.setImageDrawable(getActivity().getDrawable(R.drawable.gesture2));
                break;
            }
        }

        return view;
    }

    public void setMyText(String text){
        myText = text;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
