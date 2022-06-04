package com.neppplus.jickbangcopy_20220528

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20220528.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20220528.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
//        실제 보여질 데이터 추가
        
        mRoomList.add(  RoomData( 8500, "서울시 동대문구", 5, "1번째 방입니다." )  )
        mRoomList.add(  RoomData( 27000, "서울시 동대문구", 0, "2번째 방입니다." )  )
        mRoomList.add(  RoomData( 38700, "서울시 서대문구", -2, "3번째 방입니다." )  )
        mRoomList.add(  RoomData( 9600, "서울시 서대문구", 17, "4번째 방입니다." )  )
        mRoomList.add(  RoomData( 125300, "서울시 강남구", 11, "5번째 방입니다." )  )
        mRoomList.add(  RoomData( 7900, "서울시 강남구", -1, "6번째 방입니다." )  )
        mRoomList.add(  RoomData( 63800, "서울시 강남구", 0, "7번째 방입니다." )  )
        mRoomList.add(  RoomData( 4900, "서울시 서초구", 8, "8번째 방입니다." )  )
        mRoomList.add(  RoomData( 8000, "서울시 서초구", 10, "9번째 방입니다." )  )
        mRoomList.add(  RoomData( 28500, "서울시 서초구", 5, "10번째 방입니다." )  )

//        어댑터 변수에 대입
        
        mAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )

        roomListView.adapter = mAdapter


        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]


            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra( "roomInfo", clickedRoom )
            startActivity(myIntent)


        }


    }
}