package wtt.wtt16hack.io;

import java.util.ArrayList;

/**
 * Created by Davide on 12/11/2016.
 */

public class SimpleRow {

    ArrayList<SimplePage> mPagesRow = new ArrayList<SimplePage>();

    public void addPages(SimplePage page) {
        mPagesRow.add(page);
    }

    public SimplePage getPages(int index) {
        return mPagesRow.get(index);
    }

    public int size(){
        return mPagesRow.size();
    }
}
