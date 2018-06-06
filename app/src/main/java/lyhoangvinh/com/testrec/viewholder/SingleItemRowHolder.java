package lyhoangvinh.com.testrec.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import lyhoangvinh.com.testrec.R;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class SingleItemRowHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public ImageView imgAvatar;

    public SingleItemRowHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        imgAvatar = itemView.findViewById(R.id.imgAvatar);
    }
}
