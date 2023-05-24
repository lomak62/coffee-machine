package machine

fun machineState(water: Int, milk: Int, beans: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")
}

fun buyCoffee(op: String, ingredient: Char): Int {
    val espressoWater = 250
    val espressoMilk = 0
    val espressoBeans = 16
    val espressoMoney = 4
    val latteWater = 350
    val latteMilk = 75
    val latteBeans = 20
    val latteMoney = 7
    val cappuccinoWater = 200
    val cappuccinoMilk = 100
    val cappuccinoBeans = 12
    val cappuccinoMoney = 6

    return when (op) {
        "1" -> {
            when (ingredient) {
                'w' -> espressoWater
                'm' -> espressoMilk
                'b' -> espressoBeans
                else -> espressoMoney
            }
        }
        "2" -> {
            when (ingredient) {
                'w' -> latteWater
                'm' -> latteMilk
                'b' -> latteBeans
                else -> latteMoney
            }
        }
        else -> {
            when (ingredient) {
                'w' -> cappuccinoWater
                'm' -> cappuccinoMilk
                'b' -> cappuccinoBeans
                else -> cappuccinoMoney
            }
        }
    }
}

fun checkResources(op: String, water: Int, milk: Int, beans: Int, cups: Int): Boolean {
    var notEnough = ""

    when {
        water - buyCoffee(op, 'w') <= 0 -> notEnough = "water"
        milk - buyCoffee(op, 'm') <= 0 -> notEnough = "milk"
        beans - buyCoffee(op, 'b') <= 0 -> notEnough = "beans"
        cups - 1 <= 0 -> notEnough = "cups"
    }

    return if (notEnough.isNotEmpty()) {
        println("Sorry, not enough $notEnough!")
        false
    } else {
        println("I have enough resources, making you a coffee!")
        true
    }
}

fun fillMachine(op: Char): Int {
    when (op) {
        'w' -> println("Write how many ml of water you want to add:")
        'm' -> println("Write how many ml of milk you want to add:")
        'b' -> println("Write how many grams of coffee beans you want to add:")
        'c' -> println("Write how many disposable cups you want to add:")
    }
    print("> ")
    return(readln().toInt())
}

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        print("> ")

        when (readln()) {
            "exit" -> break
            "remaining" -> machineState(water, milk, beans, cups, money)
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                print("> ")
                val op = readln()
                if (op != "back" && op in "1".."3") {
                    if (checkResources(op, water, milk, beans, cups)) {
                        water -= buyCoffee(op, 'w')
                        milk -= buyCoffee(op, 'm')
                        beans -= buyCoffee(op, 'b')
                        money += buyCoffee(op, '$')
                        cups -= 1
                    }
                }
            }

            "fill" -> {
                water += fillMachine('w')
                milk += fillMachine('m')
                beans += fillMachine('b')
                cups += fillMachine('c')
            }

            "take" -> {
                println("I gave you $$money")
                money = 0
            }
        }
        println()
    }
}