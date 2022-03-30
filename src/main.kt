fun main(){
    addition(450, 350)
    mySquare(25)
    myNames("Swabrina Yusuf Shamun")
    convert("Cudra is a young lady")
    convert2(arrayOf('a','e','o','u'))
    var w = Mobile("A-Class","Mercedes-Benz","Fax-701-328-567")
    println(w.model)
    println(w.brand)
    println(w.MPR)
    var t = Identity("Suhaila","Yusuf",23)
    println(t.firstname)
    println(t.lastname)
    println(t.age)
    var e = Employee("Shamun","hakanshamun12@gmail.com","Hakan")
    println(e.name)
    println(e.email)
    println(e.company)



}

//1: Write a function that Adds Two Numbers
//2:Write a function that finds the square of a number
//3:Write a function that displays names


fun addition(number1: Int, number2: Int){
    var w = number1 + number2
    println(w)

}

fun mySquare(square: Int){
    var ans = square*square
    println(ans)

}

fun myNames(name: String){
    println(name)
}

fun convert(Char1: String){
    var sh = Char1
    println(sh)

}

fun convert2(Char2:Array<Char>){
    var char = Char2
    println(char.contentToString())
}

//OOP QUESTION
//1:Create a class Mobile containing the following state
//a(Model
//b(Brand
//c(MRP

//a( print out the detail of the mobile
//2:Create a class containing firstName,lastName, and age
//a(Println fullName  and age
//3:Create a class employee containing the following state
//a: Name
//b: Email
//c: Company
//i(Print the output
//4:Given below is an example of data type.
//a( find there data types
//Val subjects = 5
//val marks = 47.5
//val name = "Deepak"
//5:Given below is an example of an array
//6:Write a  Program to Add Two Integers
//i: Print an Array using For loop
//Val array = intArrayOf(1, 2, 3, 4, 5)



data class Mobile(var model: String, var brand: String, var MPR: String)

data class Identity(var firstname: String, var lastname: String, var age: Int)

data class Employee(var name: String, var email: String, var company: String)




