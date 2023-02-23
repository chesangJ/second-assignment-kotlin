import javax.swing.text.AbstractDocument.Content

fun main(){
    details("Purity","Abel","Nairobi","Kitale")
    capital()
    digits()
        println(Content("Joy","Alan","Nairobi"))
}
fun details(name1:String,name2:String,name3:String,name4:String){
    var words=arrayOf(name1,name2,name3,name4)
            println(words.contentToString())
}
fun capital(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cities-> println(cities.capitalize()) }
}
fun digits(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sorteddigits=numbers.sortedArray()
println(numbers.get(1)+numbers.get(4))
    println(numbers.indexOf(158))
    println(sorteddigits.contentToString())
}
fun Content(name1: String,name2: String,name3: String):Array<String>{
    return (arrayOf(name1,name2,name3))
}

