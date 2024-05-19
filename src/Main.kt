import sun.misc.Signal

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    printNationality("Tanzania")
    printNationality("Uganda")
    //assignSchool(431)
    printNationalityWhen("South Africa")
    selectContainer(8)
    select()
    squad()
    printRangeSquares(3,7)
    numbers()
    letters()
}


//When
fun printNationality(country: String){
    if(country=="Tanzania"){
        println("Tanzanian")
    }
    else if(country=="Uganda"){
        println("Ugandan")
    }
    else if(country=="Kenya"){
        println("Kenyan")
    }
    else if(country=="Malawi"){
        println("Malawian")
    }
    else if(country=="South Sudan"){
        println("South Sudanese")
    }
    else{
        println("Foreigner")
    }
}

//Nested if else
//fun assignSchool(marks: Int){
    //if(marks>390){
      //  if(marks>430){
        //    println("Scholarship")
      //  }
    //    else{
     //       println("No Scholarship")
   //     }
     //   println("National")
   // }
 //   else if(marks>=350 && marks<390){
  //      println("Provincial")
//    }
 //   else{
    //    println("District")
  //  }
//}

fun printNationalityWhen(country: String){
    when(country){
        "Tanzania" -> println("Tanzanian")
        "Uganda" -> println("Ugandan")
        "Malawi" -> println("Malawian")
        "South Sudan" -> println("South Sudanese")
        else -> println("Foreigner")
    }
}

fun selectContainer(litres: Int){
    when(litres){
        1,2,3 -> println("bottle")
        4,5,6,7 -> println("bucket")
        8,9-> println("big bucket")
        else-> println("jerrican")
    }
}


//For Loop
fun select(){
    val languages = arrayOf("Kiswahili", "Luganda", "Kinyarwanda", "Somali")
    for(lang in languages){
        println(lang)
    }
}


//Looping through a string
fun squad(){
    val group = "Lovelace"
    for (letter in group){
        println(letter)
    }

    //Ranges
    for(num in 1..100){
        println(num*num)
    }
}

fun printRangeSquares(start: Int, end: Int){
    for (num in start..end){
        println(num*num)
    }
}

//While Loop- evaluate and then do something- do something repeatedly until stops
fun numbers(){
    var num = 12
    while(num>0){
        println(num)
        num--
    }

    do {
        println(num)
        num--
    }while (num > 0)
}

fun letters(){
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    var result = ""
    while(result.length<10){
        val rand = (0..25).random()
        var newChar = alphabet[rand]
        result = "$result$newChar"
    }
    println(result)
}

//Do while
fun nums() {
    for (num in 1..100) {
        val square = num * num
        if (square < 1000) {
            println(square)
        }
    }

    for(num in 1..100){
        val square = num * num
        println(square)

        if(square<1000){
            println(square)
        }
        else{
            break
        }
    }
}



