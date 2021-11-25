import java.sql.*
import java.util.*


fun main() {
    val credentials = Credentials()

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()


    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.user,
        connectionProps)

    val search = "Desiro"
    val statement = connection.prepareStatement("SELECT * FROM trains WHERE type LIKE '%$search%'")

    statement.setString(1, search)
    val result = statement.executeQuery()
    while(result.next()) {
        println(result)
    }







    //while(result.next()) {
    //    println(result.getString("capacity"))
    //}

}
