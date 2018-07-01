package at.boolshit.mulelogic.data

enum class Color{
    Heart, Leaf, Oak, Jingle
}


enum class CardType{
    King,
    Ober,
    Unter,
    Ten,
    Nine,
    Eight,
    Seven
}


class Card constructor(val ctype : CardType,val color : Color)