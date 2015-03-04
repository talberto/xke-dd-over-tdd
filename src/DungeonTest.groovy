import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals


class DungeonTest{

    def dungeonGame;

    @Before void setup(){
        dungeonGame = new Dungeon()
    }

    @Test
    void "should convert a letter into a number"(){
        def result = dungeonGame.convertLetter('l')
        assertEquals(11, result)
    }

    @Test
    void "should convert a word into a sum"(){
        def result = dungeonGame.convertNameToSum("Ashram")
        assertEquals(54, result)
    }

    @Test
    void "should convert a number of several digits into a sum of its digits"(){
        def result = dungeonGame.reduceDigits(125l)
        assertEquals(8, result)
    }

    @Test
    void "should convert a massive number of several digits into a sum of its digits recursively"(){
        def result = dungeonGame.reduceDigits(999999999999999999l)
        assertEquals(9, result)
    }



}
