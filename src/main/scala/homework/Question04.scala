package homework

object Question04 {
	def palindrome(list:List[Any]) : Boolean = {
		def reverse(ls:List[Any]) : List[Any] = {
			if (ls.isEmpty) return List()
			return reverse(ls.tail) ::: List(ls.head)
		}
		def isPalindrome(i:Int,  ls:List[Any], rls:List[Any]) : Boolean = {
			if (i == 0) return true
			if (ls.head != rls.head) return false
			return isPalindrome(i-1, ls.tail, rls.tail)
		}

		val half = list.length / 2
		val revList = reverse(list)
		return isPalindrome(half, list, revList)
	}
}