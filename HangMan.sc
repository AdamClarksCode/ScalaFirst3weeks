import scala.io.Source
import scala.collection.mutable.ArrayBuffer
val filePath = "C:\\Users\\Administrator\\Downloads\\english-words-master\\english-words-master\\words_alpha.txt"
var arrayOfWords = ArrayBuffer[String]()
for (line <- Source.fromFile(filePath).getLines()) {
 var wordsToAssign: Array[String] = line.split(" ")
  if(wordsToAssign(0).trim.toLowerCase != "") {
    arrayOfWords += wordsToAssign(0).trim.toLowerCase
  }
}
def drawGuesses(toDraw: String, charsGuessed: ArrayBuffer[Char]): Unit = {
  var toPrint = ""
  if(charsGuessed.isEmpty){
    for(i <- 0 to toDraw.length-1){
      if(i == toDraw.length-1) toPrint += "_"
      else toPrint += "_/"
    }
  }
  for(i <- 0 to toDraw.length-1){
    for(j <- 0 to charsGuessed.length-1){
      if(toDraw.charAt(i) == charsGuessed(j)) toPrint = toPrint + charsGuessed(j)
      else toPrint += "_"
      if(i == toDraw.length-1) toPrint += "_"
      else toPrint += "_/"
    }
  }
  println(toPrint)
}
val r = scala.util.Random
val wordToGuess = arrayOfWords(r.nextInt(arrayOfWords.length))
val lettersGuessed = ArrayBuffer[Char]()
println("Welcome to hang man!")
drawGuesses(wordToGuess, lettersGuessed)
val guessed = false