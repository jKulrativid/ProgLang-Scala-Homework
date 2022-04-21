package homework

object Question07 {
	def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
		def myMapByF(ls:List[Int]) : List[Int] = {
			if (ls.length == 0) {
				return List()
			}
			return List(f(ls.head)) ++ myMapByF(ls.tail)
		}

		return myMapByF(list)
	}
}