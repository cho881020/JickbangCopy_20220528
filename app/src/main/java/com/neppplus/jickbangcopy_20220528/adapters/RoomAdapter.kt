package com.neppplus.jickbangcopy_20220528.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20220528.R
import com.neppplus.jickbangcopy_20220528.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {

            tempRow =  LayoutInflater.from(mContext).inflate( R.layout.room_list_item, null )

        }

        val row = tempRow!!


        val data = mList[ position ]

        val txtPrice = row.findViewById<TextView>( R.id.txtPrice )
        val txtAddressFloor = row.findViewById<TextView>( R.id.txtAddressFloor )
        val txtDescription = row.findViewById<TextView>( R.id.txtDescription )

        txtDescription.text = data.description

        txtAddressFloor.text =  data.getFormattedFloor()

        return row
    }

}