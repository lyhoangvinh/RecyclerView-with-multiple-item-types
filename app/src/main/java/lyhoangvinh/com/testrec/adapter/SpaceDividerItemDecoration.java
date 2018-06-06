package lyhoangvinh.com.testrec.adapter;


import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SpaceDividerItemDecoration extends RecyclerView.ItemDecoration {

    private final int mSpaceHeight;

    public SpaceDividerItemDecoration(int spaceHeight) {
        this.mSpaceHeight = spaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = mSpaceHeight;
        }
    }
}
