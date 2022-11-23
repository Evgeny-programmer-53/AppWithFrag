package evgeny.company.appwithfrags

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val items: List<MyItem>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val titleView = holder.itemView.findViewById<TextView>(R.id.itemTitle)
        val descriptionView = holder.itemView.findViewById<TextView>(R.id.itemDescription)

        titleView.text = items[position].name
        descriptionView.text = items[position].description
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

data class MyItem(val name: String, val description: String)

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}