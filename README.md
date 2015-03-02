# xke-dd-over-tdd

Le but est d'accorder à un nouveau joueur un premier objet en fonction de son nom. 

Ruby : Peter, Thomas
Scala : Bastien
Groovy : Alexandre
Go : Julien S.

## Sujet

01234 56789  >--- Value
-----------
ABCDE 01234  \
FGHIJ 56789  \
KLMNO   !     >-- Characters
PQRST   ?    /
UVWXY   -    /
Z       &    /

Value --- 0123456789
          ||||||||||
Type  --- ABCDEFGHIJ

## Résultat de l'algo

Type  Item
----  ----
 A    Medal
 B    Boots of Speed
 C    Headgear Armor Item (Depending on character)
 D    Ring of Protection
 E    Ring of Fire Resistance
 F    Ring of Spell Turning
 G    Gauntlets of Ogre Power
 H    Accessories I (Depending on character)
 I    Accessories II (Depending on character)
 J    Accessories III (Depending on character)

## Exemples de noms -> Item
For example, "Gideon" -> 1+3+3+4+4+3 = 18 -> 1+8 -> 9 = Type J.

Type A - Akuku, Zapuk  
Type B - Kayin, Sofia
Type C - Jacob, Lynn
Type D - Thor, Jennie
Type E - Seth, Emily
Type F - Ralph, Jess
Type G - Dan, Ann
Type H - Duke, Wendy    
Type I - Axel, Zelda
Type J - Aaron, Rosa
