import data.AliceData

val words = AliceData.bookText.toLowerCase.split(AliceData.bookRegex)
val stopWords = AliceData.stopWordText.toLowerCase.split(AliceData.stopWordRegex).toSet

words
  .filterNot(stopWords)
  .map(x => (x, 1))
  .groupBy(identity)
  .mapValues(_.length)
  .toList
  .sortBy(t => - t._2)

