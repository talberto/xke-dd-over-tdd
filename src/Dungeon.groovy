/**
 * Created by adergham on 03/03/2015.
 */
class Dungeon{

    static def letters = "abcdefghijklmnopqrstuvwxyz"

    def convertLetter(letter){
        return letters.indexOf(letter.toLowerCase())
    }

    def convertNameToSum(name){
        def sum = 0
        name.each({sum+= convertLetter(it)})
        return sum
    }

    def reduceDigits(greatNumber){
        def recursiveReduce
        recursiveReduce = {
            if (it.toString().length()==1){
                it
            } else {
                def sum  = 0
                it.toString().each({sum+= it as long})
                recursiveReduce(sum)
            }
        }
        return recursiveReduce(greatNumber)
    }

    def grantGift(name){

    }
}
