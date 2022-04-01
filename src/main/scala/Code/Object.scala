package Code

import scalaj.http.Http

object Object {


  def main(args: Array[String]): Unit = {

    val ETH = Http("https://api-pub.bitfinex.com/v2/ticker/tETHUSD").asString
    val cislo = ETH.body.substring(1, ETH.body.length() - 1).mkString.split(",")
    println("Aktuální cena Etherea: " + cislo(0) + " dolarů")


    val BT = Http("https://api-pub.bitfinex.com/v2/ticker/tBTCUSD").asString
    val text = BT.body.substring(1, BT.body.length() - 1).mkString.split(",")
    println("Aktuální cena Bitcoinu: " + text(0) + " dolarů")

  }


}
