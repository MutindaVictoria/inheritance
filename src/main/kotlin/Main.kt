fun main(){
    val a = Car("Jeep", "mitsubishi", "Jungle green", 5)
    a.carry(9)
    a.carry(5)
    a.identity()
    println(a.parkingfees(4))

    var bus=Bus("long","Scania","grey",42)
    println(bus.maxTripFare(fare = 1200.00))
    println(bus.parkingfees(hours = 4))
}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
 open class Car( var make:String,var model: String,var color:String, var capacity: Int){
    fun carry(people: Int){
        var x = people - capacity
        if(people <= capacity){
            println("carrying $people passengers")
        }else{
            println("overcapacity by $x people")
        }

    }
    fun identity(){
    println("I am a $color $make $model")
    }
    open fun parkingfees(hours:Int):Int{
        return hours *20
    }
}

class Bus(make:String,  model:String, color:String,capacity:Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double):Double{
        return capacity * fare
    }
    override fun parkingfees(hours: Int): Int {
        return capacity * hours
    }
}

