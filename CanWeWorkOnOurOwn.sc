//task1
var givenString = "The"
def doubleChar(stringToDouble: String): String = {
  var returnString = ""
  for (i <- 0 to stringToDouble.length-1)returnString = returnString + stringToDouble.charAt(i) + stringToDouble.charAt(i)
  returnString
}
var stringToPrint = doubleChar(givenString)
println(stringToPrint)

//task2
var sandwich = "breadjambread"
def getSandwich(stringToSandwhich: String): String = {
  if(stringToSandwhich.indexOf("bread") != -1) {
    var firstBread = stringToSandwhich.indexOf("bread")
    var subOne = stringToSandwhich.substring(firstBread + 5)
    var secondBread = subOne.indexOf("bread")
    if (secondBread != -1) {
      var subTwo = subOne.substring(0, secondBread)
      subTwo
    }
    else{
      var toReturn = ""
      toReturn
    }
  }
  else {
    var toReturn = ""
    toReturn
  }
}
stringToPrint = getSandwich(sandwich)
println(stringToPrint)

//task3
var num1 = 4
var num2 = 8
var num3 = 12
def isEvenlySpaced(passed1: Int, passed2: Int, passed3: Int): Boolean ={
  var large = 0
  var medium = 0
  var small = 0
  if (passed1 > passed2 && passed1 > passed3) {
    large = passed1
    if (passed2>passed3){
      medium = passed2
      small = passed3
    }
    else{
      medium = passed3
      small = passed2
    }
  }
  else {
    if (passed2 > passed1 && passed2 > passed3) {
      large = passed2
      if (passed1>passed3){
        medium = passed1
        small = passed3
      }
      else{
        medium = passed3
        small = passed1
      }
    }
  }
 if(passed3 > passed2 && passed3 > passed1) {
    large = passed3
    if (passed2>passed1){
      medium = passed2
      small = passed1
    }
    else{
      medium = passed1
      small = passed2
    }
  }
  var smallMediumDiff = medium - small
  var mediumLargeDiff = large - medium
  if(smallMediumDiff == mediumLargeDiff) true
  else false
}
println(isEvenlySpaced(num1, num2, num3))

//task4
var input = 10
def fibonacci(num: Int): Int = {
  if(num == 0 || num == 1)num
  else {
    var prevNum = fibonacci(num-2)
    var currentNum = fibonacci(num-1)
    val toReturn = prevNum + currentNum
    toReturn
  }
}
println(fibonacci(input))

//task5
var noOfBunnies = 16
def bunnyEars(num: Int): Int = {
  if (num == 0) 0
  else {
    if (num == 1) 2
    else {
      if (num == 2) 4
      else {
        var prevNum = bunnyEars(num - 1)
        val toReturn = prevNum + 2
        toReturn
      }
    }
  }
}
println(bunnyEars(noOfBunnies))

//task6
var someString = "Chololate"
def nTwice(passedString: String, num: Int): String = {
  var stringLeft = passedString.substring(0, num)
  var stringRight = passedString.substring(passedString.length-num, passedString.length)
  var returnString = stringLeft+stringRight
  returnString
}
println(nTwice(someString, 3))

//task 7
def endsLy(input: String): Boolean = {
  if(input.substring(input.length-2, input.length) == "ly") true
  else false
}
endsLy("oddly")

//task 8
var stringToClean = "Hello"
def stringClean(stringToClean: String): String = {
  var cleanedString = ""
  for(i <- 0 to stringToClean.length-2){
    if(stringToClean.charAt(i) != stringToClean.charAt(i+1)) cleanedString = cleanedString + stringToClean.charAt(i)
    if(i == stringToClean.length-2) cleanedString = cleanedString + stringToClean.charAt(i+1)
  }
  cleanedString
}
println(stringClean(stringToClean))

//task 9
def drawADiamonad(width: Int): Unit ={
  for(i <- 0 to (width*2)){
    var stringToPrint = ""
    var whiteSpace = width-i
    if (whiteSpace < 0) whiteSpace = whiteSpace * -1
    if(whiteSpace >= 0) for (j <- 0 to whiteSpace) stringToPrint = stringToPrint + " "
    var spaceToFill = width - whiteSpace
    if(spaceToFill > -1 && spaceToFill <= width) {
      for (k <- 0 to spaceToFill) {
        if(k == 0)stringToPrint = stringToPrint + "@"
        else stringToPrint = stringToPrint + "@@"
      }
    }
    println(stringToPrint)
  }
}
drawADiamonad(15)

//task 10
def drawHollowDiamonad(width: Int): Unit ={
  for(i <- 0 to (width*2)){
    var stringToPrint = ""
    var whiteSpace = width-i
    if (whiteSpace < 0) whiteSpace = whiteSpace * -1
    if(whiteSpace >= 0) for (j <- 0 to whiteSpace) stringToPrint = stringToPrint + " "
    var spaceToFill = width - whiteSpace
    if(spaceToFill > -1 && spaceToFill <= width) {
      for (k <- 0 to spaceToFill) {
        if(k == 0 || k == spaceToFill)stringToPrint = stringToPrint + "@ "
        else stringToPrint = stringToPrint + "  "
      }
    }
    println(stringToPrint)
  }
}
drawHollowDiamonad(16)