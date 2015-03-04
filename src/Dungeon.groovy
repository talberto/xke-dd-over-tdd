/**
 * Created by adergham on 03/03/2015.
 */
class Dungeon{

    static def letters = "abcdefghijklmnopqrstuvwxyz"
    static def special = "!?-&"

    def convertChar(letter){
        if(Character.isLetter(letter as char)){
            return letters.indexOf(letter.toLowerCase())%5
        } else if(Character.isDigit(letter as char)){
            return 5+(Character.getNumericValue(letter as char) % 5)
        } else if(special.indexOf(letter)>=0){
            return 7
        }
    }

    def convertNameToSum(name){
        def sum = name.collect({convertChar(it)}).sum()
        return reduceDigits(sum)
    }

    def reduceDigits(greatNumber){
        def recursiveReduce
        recursiveReduce = {
            def numberAsString = it.toString()
            if (numberAsString.length()==1){
                it
            } else {
                def sum  = numberAsString.collect({it as long}).sum()
                recursiveReduce(sum)
            }
        }
        return recursiveReduce(greatNumber)
    }

    def grantGift(name){

    }
}
