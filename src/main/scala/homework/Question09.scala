package homework

object Question09 {
	def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] = {
		def turingStepF(i:Int, ls:List[Char]) : List[Char] = {
			if (ls.length == 0) {
				return List()
			}
			if (i == n) {
				return ls
			}
			return List(f(ls.head)) ++ turingStepF(i+1, ls.tail)
		}

		return turingStepF(0,tape)
	}
}