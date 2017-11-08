package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class
  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter wc;

  @Before
  public void setUp() {
    // TODO create the SUT instance
    Map<String, Integer> m = new HashMap<String, Integer>();
    wc = new WordCounter(m);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    wc = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map.
    assertEquals(wc.getCounts(), Collections.emptyMap());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    wc.countWords(Arrays.asList("asdf", "oiu", "qwer").iterator());
    // do this for at least two words in the iterator and two not in the iterator
    assertEquals(wc.getCount("asdf"), 1);
    assertEquals(wc.getCount("oiu"), 1);
    assertEquals(wc.getCount("chris"), 0);
    assertEquals(wc.getCount("tyler"), 0);
  }
}
