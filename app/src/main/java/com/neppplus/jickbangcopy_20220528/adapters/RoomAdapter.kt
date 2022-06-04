package com.neppplus.jickbangcopy_20220528.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20220528.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
}