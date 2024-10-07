import java.time.DayOfWeek

fun main(args: Array<String>) {
//    val userAcc = Person.Account("qwerty", "123456");
//    val userAcc=Person("Tom","+79114575345")
//    userAcc.showDetails()
//
//    val acc=BankAccount(100000)
//    acc.Transaction().pay(25000)
//    val tom:Person=Person("Tom",36)
//    println(tom.toString())
//    val jerry=tom.copy(name = "Jerry")
//    println(jerry.toString())
//    val day:Day= Day.MONDAY
//    println(day)
//    println(Day.TUESDAY)
//    val day1:Day= Day.TUESDAY
//    println(day1.value)
//    println(day1.name)
//    println(day1.ordinal)
//    for(day in Day.values()) println(day)
//    println(Day.valueOf("FRIDAY"))
//    println(operate(6,7,Operation.ADD))
    //анонимный класс
//    val person=object {
//        val name="Tom"
//        val age=20
//        fun sayHello(){
//            println("Hello, $name")
//        }
//    }
//    println("Name:${person.name} Age: ${person.age}")
//    person.sayHello()
    Car.printCount()
    Car("BMW")
    Car("Toyota")
    Car.printCount()
}
//nested class-вложенный класс
//class Person{
//    class Account(val username: String, val password: String){
//
//        fun showDetails(){
//            println("UserName: $username  Password: $password")
//        }
//    }
//}
//class Person(username: String,password: String){
//    private val account:Account=Account(username,password)
//    private class Account(val username:String,val password:String)
//    fun showDetails(){
//            println("${account.username}:${account.password}")
//    }
//}
//inner - внутренний класс
class BankAccount(private var sum:Int){
    fun showDetails(){
        println("sum=$sum")
    }
    inner class Transaction{
        fun pay(s:Int){
            sum-=s
            showDetails()
        }
    }
}
//data-класс необходим только для хранения некоторых данных
data class Person(val name:String,val age:Int){
    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}
//enum class
//enum class Day{
//    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
//}

enum class Day(val value: Int){
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),
    THURSDAY(10),FRIDAY(15),SATURDAY(100),
    SUNDAY(3000)
}
enum class Operation{
    ADD,SUBTRACT,MULTIPLY,DIVIDE
}
fun operate(n1:Int,n2:Int,operation:Operation):Int{
    when(operation){
        Operation.ADD->return n1+n2
        Operation.SUBTRACT->return n1-n2
        Operation.MULTIPLY->return n1*n2
        Operation.DIVIDE->return n1/n2
    }
}
//Анонимные классы и объекты
object person {
    val name="Tom"
    val age=20
    fun sayHello(){
        println("Hello, $name")
    }
}
//Companion-объекты
class Car(val model:String){
    init {
        counter++
    }
    companion object{
        var counter=0
        fun printCount()= println("Counter: $counter")
    }
}