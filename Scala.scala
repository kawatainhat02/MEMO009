def hasLowerCaseA(s: String): Boolean = {
  for (i <- 0 until s.length) {
    if (s(i) == 'a') return true
  }
  return false
}

def hasLowerCaseA(s: String): Boolean = {
  for (c <- s) {
    if (c == 'a') return true
  }
  return false
}

def hasLowerCaseA(s: String) = s.exists(_ == 'a')

