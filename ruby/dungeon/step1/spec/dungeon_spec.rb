# This is how we import a class in Ruby world, it's the equivalent of import in Java
require 'dungeon'

# This is how we define a Hash (Map in the Java world). The syntax of a Hash literal is dead simple: keys are mapped to values through an
# arrow (This might be familiar to Scala developers), and everything is wrapped by {}
# This is also an example a constant declaration. In Ruby, by convention every identifier that uses only uppercase letters is considered
# to be a constant and thus, if we try to modify it later the interpreter will raise an exception
NAMES_TO_ITEMS = {
  "Akuku" => "Medal",
  "Kayin" => "Boots of Speed",
  "Jacob" => "Headgear Armor Item",
  "Thor"  => "Ring of Protection",
  "Seth"  => "Ring of Fire Resistance",
  "Ralph" => "Ring of Spell Turning",
  "Dan"   => "Gauntlets of Ogre Power",
  "Duke"  => "Anklet",
  "Axel"  => "Brooch",
  "Aaron" => "Orb"
}

# This is a very simple TestSuite describing the SUT (System Under Test). In this case the Dungeon class is our SUT, and it's where you should
# put your code to make this tests pass!
describe Dungeon do
  # Check that the correct item is returned for each name
  NAMES_TO_ITEMS.each do |name, item|
    it "should return #{item} for #{name}" do # String interpolation in Ruby
      dungeon = Dungeon.new # Class instantiation in Ruby
      expect(dungeon.compute_item_for_name(name)).to eq(item)
    end
  end
end
