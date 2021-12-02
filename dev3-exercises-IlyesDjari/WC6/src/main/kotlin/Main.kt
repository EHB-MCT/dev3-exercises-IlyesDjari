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
                credentials.user,connectionProps)
    println("To which city do you want to go? 1 (Halle) OR 2 (Elsene)")
    val search = readLine()
    val statement = connection.prepareStatement("SELECT * FROM rides LEFT JOIN trains ON rides.train_id = trains.id WHERE destination_city_id = ? ORDER BY departure_time ASC LIMIT 3")
    statement.setString(1, search)
    println("These are the next 3 options I have for you:")
    val result = statement.executeQuery()
    while(result.next()) {
        println("This train is leaving at")
        println(result.getString("departure_time"))
        println("and he will depart from platform")
        println(result.getString("platform"))
    }
}
