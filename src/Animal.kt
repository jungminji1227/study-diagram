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
        println("야옹")
    }
}

class Dog(name: String, sex: String, age: Int, weight: Int, color: String) : Animal(name, sex, age, weight, color) {

    fun bark() {
        println("왈왈")
    }
}

fun main(){
    val dog = Dog("coco", "F", 3, 5, "black")
    val cat = Cat("haha", "F", 5, 10, "white")

    print(dog.name + "가 짖어요 ")
    dog.bark()

    print(cat.name + "가 울어요 ")
    cat.meow()
}