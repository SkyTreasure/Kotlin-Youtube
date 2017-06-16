package com.skytreasure.kotinyoutube.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.skytreasure.kotinyoutube.R
import com.skytreasure.kotinyoutube.adapter.YoutubeListAdapter
import com.skytreasure.kotinyoutube.constants.DataConstants

/**
 * Created by akash on 15/6/17.
 */
class RecyclerViewFragment : Fragment() {

    private var mPage : Int =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPage= arguments.getInt(ARG_PAGE)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.item_recycler_view, container, false)
        val recyclerView= view as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.hasFixedSize()
        recyclerView.adapter= YoutubeListAdapter(activity, DataConstants.youtubeVideoList,context)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }


    companion object{
        val ARG_PAGE ="ARG_PAGE"

        fun newInstance(page : Int ) : RecyclerViewFragment{
            val args = Bundle()
            args.putInt(ARG_PAGE,page)
            val fragment = RecyclerViewFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private fun Context.toast(text: String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}