package com.equipe.base26

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsUnitTest {
  @Test
  fun testsAlphaNumeric() {
    assertEquals(1,Utils.getAlphaNumeric("A"))
    assertEquals(19,Utils.getAlphaNumeric("s"))
    assertEquals(20,Utils.getAlphaNumeric("t"))
    assertEquals(27,Utils.getAlphaNumeric("aa"))
    assertEquals(28,Utils.getAlphaNumeric("ab"))
    assertEquals(53,Utils.getAlphaNumeric("ba"))
    assertEquals(56,Utils.getAlphaNumeric("bd"))
    assertEquals(79,Utils.getAlphaNumeric("ca"))
    assertEquals(703,Utils.getAlphaNumeric("aaa"))
    assertEquals(731,Utils.getAlphaNumeric("abc"))
  }
}