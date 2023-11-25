fun main() {
    val studentA = Student("安学民",18, "male")

    val petParse = if (studentA.isAdult) "nice to meet you!" else "yo~"

    studentA.sayHello(petParse)

    println("i like ${studentA.hobby()}")
}

open class Person(val name: String, var age: Int){

    /**
     * 和大家做自我介绍吧，带上你的口头禅！
     */
    fun sayHello(petParse :String){
        println("hello, my name is ${name}, $petParse")
    }

    /**
     * 兴趣爱好是啥?
     */
    open fun hobby() :String = "no"
}

class Student(name: String, age: Int, val gender: String) : Person(name, age) {
    val isAdult :Boolean
        get() = age >= 18

    override fun hobby() :String = "football"
}