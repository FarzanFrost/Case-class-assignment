case class Point( a:Int , b:Int ){

    def x:Int = a
    def y:Int = b

    def +( that:Point) : Point = Point( this.x + that.x , this.y + that.y )

    def move( dx : Int , dy : Int ) :Point = Point( this.x + dx , this.y + dy )

    def distanceBetween( that : Point ) : Double = math.sqrt( math.pow( ( this.x - that.x ) , 2) + math.pow( ( this.y - that.y) , 2))

    def invert : Point = Point( this.y , this.x )

}
