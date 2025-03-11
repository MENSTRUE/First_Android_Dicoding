package com.android.app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.myrecyclerview.Rider

class MainActivity : AppCompatActivity() {
    private lateinit var rvRider: RecyclerView
    private val list = ArrayList<Rider>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRider = findViewById(R.id.rv_heroes)
        rvRider.setHasFixedSize(true)

        // Mengisi data Rider
        list.addAll(getListRider())

        // Menampilkan RecyclerView
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_list ->{
                rvRider.layoutManager = LinearLayoutManager(this)
            }

            R.id.action_grid ->{
                rvRider.layoutManager = GridLayoutManager(this, 2)
            }

            R.id.action_about ->{
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun getListRider(): ArrayList<Rider> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listRider = ArrayList<Rider>()

        for (i in dataName.indices) {
            val rider = Rider(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listRider.add(rider)
        }
        dataPhoto.recycle() // Jangan lupa untuk melepaskan TypedArray
        return listRider
    }

    private fun showRecyclerList() {
        rvRider.layoutManager = LinearLayoutManager(this)
        val listRiderAdapter = ListRiderAdapter(list)
        rvRider.adapter = listRiderAdapter

        // Menangani klik item pada adapter
        listRiderAdapter.setOnItemClickCallback(object : ListRiderAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Rider) {
                // Anda bisa menambahkan aksi tambahan jika diperlukan di sini
            }
        })
    }
}
