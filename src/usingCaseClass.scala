object usingCaseClass extends App{

    val p1 = Point( 0 , 0)

    val p2 = Point( 2 , 6 )

    val p3 = Point( 9 , 11)

    val p4 = p1.copy()

    val p5 = p1.copy( b= 5 )

    val p6 = Point( 1 , 18 )

    val p7 = Point( 9 , 27 )


    println(p1)

    println(p2)

    println(p3)

    println(p1 == p4)

    println(p1 == p5)

    println( p2 + p3 )

    println( p1.move( 18 , 27 ) )

    println( p1 distanceBetween p7 )

    println( p2.invert )




}
