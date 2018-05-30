package com.equipe.helloworld

object Utils {

  fun getAlphaNumeric(s: String): Long {
    var sum = 0
    s.map {
      sum = (sum.times(26)) + (it.toUpperCase() - 'A' + 1)
    }

    return sum.toLong()
  }
}