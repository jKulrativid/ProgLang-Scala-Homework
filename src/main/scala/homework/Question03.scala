package homework

object Question03 {
	def subList(l1:List[Any], l2:List[Any]) : Boolean = {
		def find(x:Any, ls:List[Any]) : Boolean = {
			if (ls.length == 0) return false
			if (ls.head == x) return true
			return find(x, ls.tail)
		}

		if (l1.length == 0) return true
		if (find(l1.head, l2) == false) return false
		return subList(l1.tail, l2)
	}
}