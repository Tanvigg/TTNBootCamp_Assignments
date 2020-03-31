package AssesmentFour

//Create a list of Employee which will have name and age as properties. print the name of all employees age >30.
fun main() {
    var employeeMap : HashMap<String,Int> = HashMap()
    employeeMap.put("Subo",22)
    employeeMap.put("Tanvi",21)
    employeeMap.put("Anupam",30)
    employeeMap.put("Lakshya",45)


    println("Employees with Age > 30 : ")
    for(keys in employeeMap.keys){
        if(employeeMap[keys]!!>=30)
            println(keys)
    }
}