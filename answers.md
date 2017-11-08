#Try using TreeMap instead of HashMap. Does it make any difference?
Using a TreeMap, the program still produces the correct and same outcome. The run time may vary, but overall the program still
works and runs.


#What happens if you invoke countWords multiple times for different String iterators?
The string iterators would still be added to the same map, it would also still print all the frequencies from the words
from each list that may be added.


What crucial role does the Iterator abstraction play in making WordCounter testable?
It allows us to put elements, strings in this case, into the map. It also makes the map testable by making the map not empty.