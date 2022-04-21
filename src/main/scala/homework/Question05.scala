package homework

object Question05 {
	def mergesort(list:List[Int]) : List[Int] = {
		def split(ls:List[Int], i:Int) : (List[Int],List[Int]) = {
			if (i == 0) {
				return (List(), ls)
			}
			val head = ls.head
			val (leftList, rightList) = split(ls.tail, i-1)
			return (List(head)++leftList, rightList)
		}

		def merge(l:List[Int], r:List[Int]) :  List[Int] = {
			if (l.length == 0) {
				return r
			}
			if (r.length == 0) {
				return l
			}
			if (l.head < r.head) {
				return List(l.head) ++ merge(l.tail, r)
			}
			return List(r.head) ++ merge(l, r.tail)
		}

		def mergeRecursion(ls:List[Int]) : List[Int] = {
			if (ls.length == 1) {
				return ls
			}
			val half = ls.length / 2
			val (lList, rList) = split(ls, half)
			val sortedlList = mergeRecursion(lList)
			val sortedrList = mergeRecursion(rList)
			return merge(sortedlList, sortedrList)
		}

		if (list.length == 0) {
			return list
		}
		return mergeRecursion(list)
	}
}