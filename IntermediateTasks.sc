def Blackjack(num1: Int, num2: Int): Int = {
  var num3 = 0
  if(num1 == 0 || num2 == 0) num3
  else if(num1 > 21 && num2 > 21) num3
  else if(num1 <= 21 && num1 > num2) num1
  else num2
}
var num4 = Blackjack(22, 21)
println(num4)

def UniqueSum(num1: Int, num2: Int, num3: Int): Int = {
  var num4 = 0
  if(num1 != num2 && num2 != num3 && num3 != num1){
    num4 = num1+num2+num3
    num4
  } else if (num1 == num2 && num1 != num3) num3
  else if (num2 == num3 && num2 != num1) num1
  else if (num3 == num1 && num3 != num2) num2
  else num4
}
println(UniqueSum(1, 2, 3))

def TooHot(temperature: Int, isSummer: Boolean): Boolean = {
  if(isSummer == true && temperature >= 60 && temperature <= 100) true
  else if(isSummer == true) false
  else if(temperature >= 60 && temperature <= 90) true
  else false
}
println(TooHot(101, true))

