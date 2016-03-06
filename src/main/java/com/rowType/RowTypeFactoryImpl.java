package com.rowType;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

import static com.rowType.RowType.EMPTY;
import static com.rowType.RowType.NUMBER;
import static com.rowType.RowType.PALINDROME;
import static com.rowType.RowType.WORD;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class RowTypeFactoryImpl implements RowTypeFactory {

  @Override
  public RowType getRowType(String row) {
    if (StringUtils.isEmpty(row.trim())) {
      return EMPTY;
    } else if (isNumeric(row)) {
      return NUMBER;
    } else if (isPalindrome(row)) {
      return PALINDROME;
    } else {
      return WORD;
    }
  }

  private boolean isPalindrome(String row) {
    char[] chars = row.toCharArray();
    char[] reverse = row.toCharArray();
    ArrayUtils.reverse(reverse);

    return Arrays.equals(chars, reverse);
  }
}