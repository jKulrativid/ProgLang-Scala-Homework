package homework

object Question08 {
	def maxAll(lists:List[List[Int]]) :List[Int] = {
		
		def maxLengthList(lss:List[List[Int]]) : List[Int] = {
			if (lss.length == 0) return List()
			val ls2 = maxLengthList(lss.tail)
			if (lss.head.length > ls2.length) {
				return lss.head
			}
			return ls2
		}
		
		val ans = maxLengthList(lists)
		def updateMaxAllList(lss:List[List[Int]]) : List[Int] = {
			if (lss.length == 0) {
				return ans
			}
			def updateMaxList(ls:List[Int], mx:List[Int]) : List[Int] = {
				if (ls.length == 0) {
					return mx
				}
				if (mx.length == 0) {
					return List()
				}
				if (ls.head > mx.head) {
					return List(ls.head) ++ updateMaxList(ls.tail, mx.tail)
				}
				return List(mx.head) ++ updateMaxList(ls.tail, mx.tail)
			}
			
			return updateMaxList(lss.head, updateMaxAllList(lss.tail))
		}
		return updateMaxAllList(lists)
	}
}