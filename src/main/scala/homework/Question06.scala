package homework

object Question06 {
	def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
		def filterByF(ls:List[Int]) : List[Int] = {
			if (ls.length == 0) {
				return List()
			}
			if (f(ls.head)) {
				return List(ls.head) ++ filterByF(ls.tail)
			}
			return filterByF(ls.tail)
		}
		
		return filterByF(list)
	}
}