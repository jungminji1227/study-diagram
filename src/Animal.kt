open class Animal {
    var name : String
    var sex : String
    var age : Int
    var weight : Int
    var color : String

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
    var isNasty : Boolean = false

    fun meow() {
        println("고양이가 웁니다.")
    }
}

class Dog(name: String, sex: String, age: Int, weight: Int, color: String) : Animal(name, sex, age, weight, color) {
    var beatFriend : String = "Human"

    fun bark() {
        println("강아지가 짖는다.")
    }
}