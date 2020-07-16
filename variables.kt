// Working with val and var

// 'val' is used for variables whose values never change (constants) while the values assigned to 'var' can change

fun main() {

//  You cannot change this value later 
    val count = 10 
    println("Count: " + count)
    
//  We will 'switch' this value after the first declaration
    var switch = 1
    
//  Print the value of switch 
    println("Switch: " + switch) 
    
//  Let's change the value of switch 
	switch = 20
    println("New value of swich: " + switch)
    
}
