package homework

object Question02 {
	def insertInOrder(x:Int, list:List[Int]) : List[Int] = {
		def insertXInOrder(i:Int, ls:List[Int]) : List[Int] = {
			if (i == 0) return List(x)
			if (x < ls.head) return x :: ls
			return List(ls.head) ++ insertXInOrder(i-1, ls.tail)
		}
		return insertXInOrder(list.length, list)
	}
}