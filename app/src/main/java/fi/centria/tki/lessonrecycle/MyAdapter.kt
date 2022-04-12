package fi.centria.tki.lessonrecycle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val users: ArrayList<Users>): RecyclerView.Adapter<MyAdapter.TextHolder>() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.TextHolder {
        val inflatedView = inflater.inflate(R.layout.list_item,parent,false)
        return TextHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        var u = users.get(position)
        holder.addText(u)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class TextHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {

        var view: View = v
        lateinit var first: TextView
        lateinit var last: TextView
        var user : Users? = null

        init {
            first = view.findViewById(R.id.first_name)
            last = view.findViewById(R.id.last_name)
            v.setOnClickListener(this)

        }

        override fun onClick(p0: View?) {
            var toast = Toast.makeText(view.context,this.user?.firstName, Toast.LENGTH_LONG)
            toast.show()
        }

        fun addText(u: Users){
            this.user = u
            first.text = u.firstName
            last.text = u.lastName
        }
    }
}