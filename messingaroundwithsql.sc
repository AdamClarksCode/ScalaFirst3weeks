import java.sql._
object DB_example extends App {

  def main(args: Array[String]) {
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/mydb"
    val username = "root"
    val password = "password"
    var connection:Connection = _
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT host, user FROM user")
      while ( resultSet.next() ) {
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")
        println("host, user = " + host + ", " + user)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }
//libraryDependencies +="mysql"%"mysql-connector-java"%"5.1.12"​
}