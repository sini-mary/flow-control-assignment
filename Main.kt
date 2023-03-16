
fun main() {
  checkOdd()
  // (names("Snaida","Joana","pascalina"))
  robot(44)
  eachNumber()
 var n=names(arrayOf("Joana","Denise","Rico","Staicy","Anita"))
   println(n)


}


fun checkOdd(){
  var num =1..100
  for (n in num){
    if (n%2!=0){
      println(n)
    }
  }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun names(name:Array<String>):Int{
  var x =0
  for(n in name){
    if (n.length>5){
      x++
    }

  }
  return x
}



//}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. ;
fun robot(age:Int){
  when(age){
    in 0..5-> println("milk")
    in 6..14-> println("fanta orange")
    else-> println("coca cola")

  }

}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun eachNumber() {
  for (number in 1..100)

  if (number%15==0) {
    println("fizzBuzz")
  }
  else if (number%3 == 0) {
   println("Fizz")
  }
  else if (number % 5 == 0) {
  println("Buzz")
  }
  else{
    println(number)
  }
}













