package com.neppplus.jickbangcopy_20220528.datas

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
) {

    fun getFormattedPrice() : String {

        if (this.price < 10000) {

            return  "%,d".format( this.price )

        }
        else {
            return  "%,d".format( this.price )
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