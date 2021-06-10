def crPair(seq: Seq[Long]): Seq[((Long, Long), Int)] = {
  var mem = new ArrayBuffer[((Long, Long), Int)](seq.size * seq.size >> 1)
  var i = 0
  var j = 0
  while (i < seq.size){
   while(j < seq.size){
    val x = seq(i)
    val y = seq(j)
    if (x>y) mem.append(((x, y),1))
    j += 1
   }
   i += 1
  }
  mem
}


pairs.map {
 case(userId, comId) => (userId, Seq(comId))
}.reduceByKey((a,b) => a ++ b)
 .flatMap(m => crPair(m.2))
 .reduceByKey((a, b) => a + b)
 .filter(x => x._2 > minCommonUsers)
 .map {
  case ((comId1,comId2), commonUsers
////////
 )}


}
