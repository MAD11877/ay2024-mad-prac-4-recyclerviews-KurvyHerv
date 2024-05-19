package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView smallImage;
    TextView name;
    TextView description;
    public UserViewHolder(View itemView){
        super(itemView);
        smallImage = itemView.findViewById(R.id.smallimage);
        name = itemView.findViewById(R.id.nameTxt);
        description = itemView.findViewById(R.id.descriptionTxt);
    }
}
