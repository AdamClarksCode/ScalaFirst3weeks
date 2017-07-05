import scala.io.Source
import scala.collection.mutable.ArrayBuffer
//val filePath = "C:\\Users\\Administrator\\Documents\\wordList.txt"
//var arrayOfWords = ArrayBuffer[String]()
//for (line <- Source.fromFile(filePath).getLines()) {
//  var wordsToAssign: Array[String] = line.split(" ")
//  if(wordsToAssign(0).trim.toLowerCase != "") {
//    arrayOfWords += wordsToAssign(0).trim.toLowerCase
//  }
//}
//
//def sortString(stringToSort: String): String = {
//  stringToSort.sorted
//}
//
//var posOfMostAnagrams = 0
//var noOfMostAnagrams = 0
//for(i <- 0 to arrayOfWords.length-1){
//  var tempNoOfAnagrams = 0
//  for(j <- 0 to arrayOfWords.length-1){
//    if(i != j){
//      var containsCount = 0
//      for(k <- 0 to arrayOfWords(j).length - 1) {
//        if(k < arrayOfWords(i).length) {
//          if (sortString(arrayOfWords(j)) contains (sortString(arrayOfWords(i)).charAt(k))) containsCount = containsCount + 1
//        }
//      }
//      if(arrayOfWords(j).length == containsCount) tempNoOfAnagrams = tempNoOfAnagrams + 1
//    }
//  }
//  if(tempNoOfAnagrams > noOfMostAnagrams){
//    noOfMostAnagrams = tempNoOfAnagrams
//    posOfMostAnagrams = i
//  }
//}
//println("The word " + arrayOfWords(posOfMostAnagrams) + " has the most anagrams with a total of: " + noOfMostAnagrams)

var limit = 3000000
var primeCount = 0
var arrayOfBools: ArrayBuffer[Boolean] = ArrayBuffer.empty[Boolean]
for(i <- 2 to limit+2) arrayOfBools += true
for(i <- 2 to math.sqrt(limit+2).toInt){
  if(arrayOfBools(i) == true){
    var tempNum = 0
    tempNum = i
    var tempLimit = 0
    tempLimit = limit/i
    for(j <- tempNum to tempLimit){
      arrayOfBools(tempNum*j) = false
    }
  }
}
for(l <- 2 to arrayOfBools.length-1){
  if(arrayOfBools(l)==true)primeCount += 1
}
println(primeCount)
//216816