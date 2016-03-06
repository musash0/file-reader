package com.rowType;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRowTypeFactory {

  private RowTypeFactory rowTypeFactory = new RowTypeFactoryImpl();

  @Test
  public void testPalindrome() {
    assertEquals(RowType.PALINDROME, rowTypeFactory.getRowType("dad"));
  }

  @Test
  public void testPalindromeCyrillic() {
    assertEquals(RowType.PALINDROME, rowTypeFactory.getRowType("асдфдса"));
  }

  @Test
  public void testNumber() {
    assertEquals(RowType.NUMBER, rowTypeFactory.getRowType("123"));
  }

  @Test
  public void testWord() {
    assertEquals(RowType.WORD, rowTypeFactory.getRowType("something"));
  }

  @Test
  public void testEmpty() {
    assertEquals(RowType.EMPTY, rowTypeFactory.getRowType(""));
  }

  @Test
  public void testEmptySpace() {
    assertEquals(RowType.EMPTY, rowTypeFactory.getRowType(" "));
  }
}
