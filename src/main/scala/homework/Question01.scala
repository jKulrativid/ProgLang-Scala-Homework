package homework

object Question01 {
	def insertATPosition(x:Any, pos:Int, l:List[Any]) : List[Any] = {
		def insertATPos(i:Int, ls:List[Any]) : List[Any] = {
			if (i == 0) return x :: ls
			return ls.head :: insertATPos(i-1, ls.tail)
		}

		if (pos < 0 || pos >= l.length) return l
		return insertATPos(pos, l)
	}
}