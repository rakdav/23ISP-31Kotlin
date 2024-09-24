//fun main(){
//    hello()
//    showMessage("Hello World")
//    showMessage("Masha huligasha")
//    displayUser("Иван",19,"Работаю в Samsung")
//    displayUser(name ="Маша", position = "Работаю Машей.", age = 17 )
//    var nums= intArrayOf(4,7,4)
//    mas(nums)
//    printStrings("Маша","Арина","Леха")
//    sum(1,5,7,4,7)
//    sum(4,65,66,6,64,64,64,4,4)
//    printCount(3,"a","b","c")
//    val numInt= intArrayOf(5,3,6,8)
//    changeNumbers(3,*numInt)
//    sum(1,6)
//    sum(2.0,4.0)
//    sum(4,7.0)
//    sum(5.0f,8)
//    val message:()->Unit = ::hello
//    message()
//    val operation:(Int,Int)->Int=::sum
//    println(operation(1,2))
//    printMessage(::hello)
//}
//fun hello(){
//    println("Hello World")
//}
//fun showMessage(message: String){
//    println(message)
//}
//fun displayUser(name: String,age:Int,position:String="Не работаю"){
//    println("Меня зовут $name мне $age.$position")
//}
////передача параметров в функцию строго по значению
////fun swap(a:Int,b:Int)
////{
////    val temp=a
////    a=b
////    b=temp
////}
//fun mas(num:IntArray){
//    num[0]=num[1]*2
//    println(num[0])
//}
////переменное количество параметров vararg
//fun printStrings(vararg strings:String){
//    for (str in strings){
//        println(str)}
//}
//fun sum(vararg numbers:Int){
//    var s=0
//    for (number in numbers){
//        s += number
//    }
//    println("s=$s")
//}
//fun sum(a:Double,b:Double):Double
//{
//    return a+b
//}
//fun sum(a:Int,b:Double):Double{
//    return a+b
//}
//fun sum(a:Float,b:Int):Float{
//    return a*b;
//}
//fun printCount(count:Int,vararg str:String)
//{
//    for(i in 1..count){
//        for(s in str){
//            println(s)
//        }
//    }
//}
//fun changeNumbers(k:Int,vararg num:Int){
//    for(i in num)
//    {
//        println(i*k)
//    }
//}
////функции
//fun sum(a:Int, b:Int):Int
//{
//    return a+b
//}
//fun helloMe():Unit{
//    println("Hello World")
//}
////однострочная функция
//fun square(num:Int)=num*num
//fun square(n:Double):Double=n*n
////локальные функции
//fun IsAdult(age:Int):Boolean {
//    fun ageIsValid(): Boolean = (age > 0) and (age < 150)
//    return ageIsValid() and (age>=18)
//}
////Функция как параметр функции - делегат
//fun printMessage(mes:()->Unit){
//    mes()
//}
fun main(args: Array<String>) {
    print("Введите первое число:")
    val a= readln().toInt()
    print("Введите второе число:")
    val b= readln().toInt()
//    println("$a+$b=${action(a, b,::add)}")
//    println("$a-$b=${action(a, b,::sub)}")
//    println("$a*$b=${action(a, b,::mul)}")
//    println("$a/$b=${action(a, b,::div)}")
//    println("$a%$b=${action(a, b,::mod)}")
//    print("Введите знак операции:")
//    val c= readln().toCharArray()
//    val op=selectAction(c[0])
//    println(op(a,b))
    //анонимная функция
    val sum=fun(x:Int, y:Int):Int=x + y
    val message=fun()= println("Hello")
    println(sum(a,b))
    message()
    doOperation(a,b,fun(x:Int,y:Int):Int=x+y)
    doOperation(a,b,fun(x:Int,y:Int):Int=x-y)
    //Лямбда-выражения
    val hello={ println("Hello") }
    var sumLambda={x:Int,y:Int -> x + y}
    hello()
    sumLambda(a,b)
    doOperation(a,b,sumLambda)
}
//Функция как параметр функции
fun action(x:Int,y:Int,op:(Int,Int)->Int):Int=op(x,y)
fun add(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b
fun mul(a: Int, b: Int): Int = a * b
fun div(a: Int, b: Int): Int = a / b
fun mod(a: Int, b: Int): Int = a % b
fun empty(a: Int, b: Int): Int = 0

//Возвращение функции из функции
fun selectAction(key:Char):(Int,Int)->Int{
    return when(key){
        '+'-> ::add
        '-'-> ::sub
        '*'-> ::mul
        '/'-> ::div
        '%'-> ::mod
        else -> ::empty
    }
}
//Анонимная функция как аргумент функции
fun doOperation(x:Int,y:Int,op:(Int,Int)->Int) =println(op(x,y))

