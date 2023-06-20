//Ignore - Not right

object FileReading {

  import scala.io.Source

  def processGatedCommunity(fileName: String): Unit = {
    val residents = scala.collection.mutable.Map[String, Int]()
    val nonUniqueResidents = scala.collection.mutable.Set[String]()
    val neighborGroups = scala.collection.mutable.Map[Int, scala.collection.mutable.Set[String]]()

    // Read the file and populate the residents map
    val lines = Source.fromFile(fileName).getLines()
    for (line <- lines) {
      val Array(name, houseIdStr) = line.split("\t")
      val houseId = houseIdStr.trim.toInt

      if (residents.contains(name)) {
        nonUniqueResidents += name
        neighborGroups(residents(name)) -= name
      } else {
        residents(name) = houseId
        neighborGroups.getOrElseUpdate(houseId, scala.collection.mutable.Set[String]()) += name
      }
    }

    // Group residents who are neighbors
    val maxNeighborsGroup = neighborGroups.maxBy(_._2.size)._2

    println(s"Residents with non-unique IDs: $nonUniqueResidents")
    println("Neighbor groups:")
    neighborGroups.foreach { case (id, group) =>
      println(s"Group ID: $id")
      println(s"Residents: ${group.mkString(", ")}")
    }
    println(s"Group with the maximum number of neighbors (ID: ${maxNeighborsGroup.headOption.getOrElse("")}): ${maxNeighborsGroup.mkString(", ")}")
  }

  def main(args: Array[String]): Unit = {
    processGatedCommunity("/home/venom/scala/untitled/src/housedata.txt")
  }

}
