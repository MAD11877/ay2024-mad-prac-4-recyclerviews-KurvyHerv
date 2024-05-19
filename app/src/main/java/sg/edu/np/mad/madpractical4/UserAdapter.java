package sg.edu.np.mad.madpractical4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private ArrayList<User> listObjects;

    public UserAdapter(ArrayList<User> listObjects, ListActivity activity) {
        this.listObjects = listObjects;
    }

    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_activity_list, parent, false);
        UserViewHolder holder = new UserViewHolder(view);
        return holder;
    }

    public void onBindViewHolder(UserViewHolder holder, int position) {
        User listItems = listObjects.get(position);
        holder.name.setText(listItems.getName());
        holder.description.setText(listItems.getDescription());
    }

    public int getItemCount() { return listObjects.size(); }
}
