open class Animal {
    val name : String
    val sex : String
    val age : Int
    val weight : Int
    val color : String

    constructor(name: String, sex : String, age: Int, weight : Int, color : String) {
        this.name = name
        this.sex = sex
        this.age = age
        this.weight = weight
        this.color = color
    }

    fun breathe() {
        println("${name} 숨 쉬는 중")
    }

    fun eat(food : String) {
        println("${food} 먹는 중")
    }

    fun run(destination : String) { // 목적지?
        println("${destination}")
    }

    fun sleep(hours : Int) {
        println("${hours} 동안 잠자기")
    }
}

class Cat(name: String, sex: String, age: Int, weight: Int, color: String) : Animal(name, sex, age, weight, color) {

    fun meow() {
        println("고양이가 웁니다.")
    }
}

class Dog(name: String, sex: String, age: Int, weight: Int, color: String) : Animal(name, sex, age, weight, color) {

    fun bark() {
        println("강아지가 짖는다.")
    }
}

fun main(){
    
}