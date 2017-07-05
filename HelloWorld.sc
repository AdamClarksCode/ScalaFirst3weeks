println("Hello World")

var welcome = "Hello World!"
println(welcome)

def HelloWorld(input: String)= println(input)
HelloWorld("When battleships?")

def ReturnString(toReturn: String): String = return toReturn
var toPrint = ReturnString("Meep meep")
println(toPrint)

def GetType(value: Any)=println(value)
GetType(1)
GetType("Alok pushes back.")
GetType(3.141)
var isThisTrue = false
GetType(isThisTrue)

def SplitString(toSplit: String, splitPoint: Int): String = {
  var startSplit = toSplit.length - splitPoint
  var toReturn = toSplit.substring(startSplit)
  toReturn
}
var output = SplitString("hello", 4)
println(output)

def ReplaceString(mergeStringLeft: String, mergeStringRight: String, toReplace: Char, replaceWith: Char): String = {
  var mergedString = mergeStringLeft + mergeStringRight
  var stringToReturn = mergedString.replace(toReplace, replaceWith)
  stringToReturn
}
toPrint = ReplaceString("Hello", "Wolrd!", 'l', 'r')
println(toPrint)

def SumOf(number1: Int, number2: Int): Int = {
  var number3 = number1 + number2
  number3
}
var number4 = SumOf(3, 4)
println(number4)

def WildCard(num1: Int, num2: Int, doAddition: Boolean): Int = {
  var num3 = 0
  if(doAddition == true) num3 = num2 + num1
  else num3 = num2 * num1
  num3
}
var num4 = WildCard(8, 2, false)
println(num4)


def WildCard2(num1: Int, num2: Int, doAddition: Boolean): Int = {
  var num3 = 0
  if (num1 == 0) num3 = num2
  else if (num2 == 0) num3 = num1
  else if(doAddition == true) num3 = num2 + num1
  else num3 = num2 * num1
  num3
}
num4 = WildCard2(0, 0, false)
println(num4)

def Iteration(toLoop: String, loopLength: Int): Unit = {
  for(i<-0 to loopLength){
    println(toLoop)
  }
}
Iteration("Alok pushes back!", 10)

def Iteration2(toLoop: String, loopLength: Int): Unit = {
  for(i<-0 to loopLength){
    for(j<-0 to loopLength) {
      print(toLoop)
    }
    println()
  }
}
Iteration2("Meep", 4)

def FizzBuzz(fizz: String, buzz: String, limit: Int): Unit = {
  for(i<-1 to limit){
    if(i % 15 == 0) println(fizz+buzz)
    else if (i % 5 == 0) println(buzz)
    else if (i % 3 == 0) println(fizz)
    else println(i)
  }
}
FizzBuzz("Fizz", "Buzz", 100)

def Recursion(toLoop: String, loopLength: Int): Unit = {
  if(loopLength!=0) {
    println(toLoop)
    Recursion(toLoop, loopLength-1)
  }
}
Recursion("Alok pushes back!", 10)

def FizzBuzzRecursive(fizz: String, buzz: String, limit: Int, toPrint: String): Unit = {
 if (limit != 0){
   var stringToPass = ""
    if(limit % 15 == 0) {
      stringToPass = fizz
      stringToPass = stringToPass.concat(buzz)
      stringToPass = stringToPass.concat(toPrint)
    }
    else if (limit % 5 == 0) {
      stringToPass = buzz
      stringToPass = stringToPass.concat(toPrint)
    }
    else if (limit % 3 == 0) {
      stringToPass = fizz
      stringToPass = stringToPass.concat(toPrint)
    } else {
      stringToPass = limit.toString
      stringToPass = stringToPass.concat(toPrint)
    }
    FizzBuzzRecursive(fizz, buzz, limit - 1, " "+stringToPass)
  } else println(toPrint)
}
FizzBuzzRecursive("Fizz", "Buzz", 30, "")

def Recursion2(toLoop: String, loopLength: Int, count: Int): Unit = {
  if(loopLength!=count) {
    println(toLoop * loopLength)
    Recursion2(toLoop, loopLength, count + 1)
  }
}
Recursion2("Meep", 4, 0)

def PatternMatching(num1: Int, num2: Int, doAddition: Boolean): Int = {
  var num3 = 0
  doAddition match {
    case true => num3 = num2 + num1
    case false => num3 = num2 * num1
  }
  num3
}
num4 = PatternMatching(8, 2, true)
println(num4)


def PatternMatching2(num1: Int, num2: Int, doAddition: Boolean): Int = {
  var num3 = 0
  num1 match{
    case 0 => num3 = num2
    case _ => num2 match {
      case 0 => num3 = num1
      case _  => doAddition match {
        case true => num3 = num2 + num1
        case false => num3 = num2 * num1
      }
    }
  }
  num3
}
num4 = PatternMatching2(3, 3, true)
println(num4)

import java.util.TimeZone.getAvailableIDs
val time: Array[String] = java.util.TimeZone.getAvailableIDs
val newTime = time.map(s=>s.split("/")).filter(_.length>1).map(_.apply(1)).grouped(10).map(_.apply(0)).toArray

