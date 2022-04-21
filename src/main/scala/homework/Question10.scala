package homework

object Question10 { 
	def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int = {
		def alt(ls:List[Int], phase:Int) : Int = {
			if (ls.length == 0) {
				return 0
			}
			val nextPhase = (phase+1)%2
			if (phase == 0) {
				return f1(ls.head, alt(ls.tail, nextPhase))
			}
			return f2(ls.head, alt(ls.tail, nextPhase))
		}
		
		return alt(list, 0)
	}
}