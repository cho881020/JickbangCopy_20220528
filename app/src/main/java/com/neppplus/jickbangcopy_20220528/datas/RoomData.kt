package com.neppplus.jickbangcopy_20220528.datas

import java.io.Serializable

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
) : Serializable {

    fun getFormattedPrice() : String {

        if (this.price < 10000) {

            return  "%,d".format( this.price )

        }
        else {

            val uk = this.price / 10000

            val rest = this.price % 10000

            return  "%d억%,d".format( uk, rest )
        }
    }

    fun getFormattedFloor() : String {

        if ( this.floor > 0 ) {
            return  "${this.floor}층"
        }
        else if (this.floor == 0) {
            return  "반지하"
        }
        else {
            return  "지하 ${ -this.floor }층"
        }

    }


}