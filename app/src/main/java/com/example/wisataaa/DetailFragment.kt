package com.example.wisataaa

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wisataaa.R.string

class DetailFragment : Fragment() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var adapter: WisataAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var wisataArrayList: ArrayList<Wisata>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_wisata)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        adapter = WisataAdapter(wisataArrayList) { wisata ->
            val intent = Intent(context, DetailWisataActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, wisata)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        wisataArrayList = arrayListOf<Wisata>()

        var image = arrayOf(
            R.drawable.bajo,
            R.drawable.bintan,
            R.drawable.gili,
            R.drawable.kelimutu,
            R.drawable.lombok,
            R.drawable.sumba,
            R.drawable.bajo,
            R.drawable.danautoba,
            R.drawable.kelimutu,
            R.drawable.pulaukomodo,
            R.drawable.waerebo
        )

        val title = arrayOf(
            getString(string.bajo),
            getString(string.bintan),
            getString(string.gili),
            getString(string.kelimutu),
            getString(string.lombok),
            getString(string.sumba),
            getString(string.bajo),
            getString(string.danautoba),
            getString(string.pulaukomodo),
            getString(string.waraebo),
            getString(string.waraebo),
        )

        for (i in image.indices) {

            val wisata = Wisata(image[i],title[i], descriptions[i])
            wisataArrayList.add(wisata)
        }
    }
}
