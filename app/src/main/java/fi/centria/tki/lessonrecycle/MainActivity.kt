package fi.centria.tki.lessonrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = linearLayoutManager
        val users = arrayListOf<Users>()
        users.add(Users("Risto","Hietala"))
        users.add(Users("Matti","Moinonen"))
        users.add(Users("Kalle","Liikanen"))
        myAdapter = MyAdapter(this, users)
        recyclerView.adapter = myAdapter


    }
}