package at.boolshit.mulelogic.data

import java.util.*

class CardStack{
    val cardStack : List<Card>

    init {
        val temp : ArrayList<Card> = ArrayList()
        for(color in Color.values()){
            for (type in CardType.values()){
                    temp.add( Card(type,color))
            }
        }
        temp.shuffle()
        cardStack = temp;
    }
}

class Player(val Stitches: List<List<Card>>, val Hand: Set<Card>, val Id: UUID, val NickName: String, points: Int)


class MuliGame(private val players: List<Player>,val dealer: Player,val trumpColor: Color)