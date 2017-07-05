object groupwork extends App{
  val randomNum = scala.util.Random
  var highGuess = 1000;
  var lowGuess = 0;
  var theRandomNum = randomNum.nextInt(1000)
  var correctGuess = false
  while(correctGuess == false){
    println("Is the number " + theRandomNum + "?")
    var userIO = scala.io.StdIn.readLine()
    if (userIO == "yes") {
      println("Congratulations "+ theRandomNum + " is correct!")
      correctGuess = true
    }
    else{
      println("Higher or lower?")
      userIO = scala.io.StdIn.readLine()
      userIO.toLowerCase match{
        case "higher" => {
          var nextGuess = theRandomNum + ((highGuess - theRandomNum)/2)
          lowGuess = theRandomNum
          theRandomNum = nextGuess
        }
        case "lower" => {
          var nextGuess = theRandomNum - ((theRandomNum-lowGuess)/2)
          highGuess = theRandomNum
          theRandomNum = nextGuess
        }
        case _ => println("Your input was not recognised, please try again")
      }
    }
  }

}
