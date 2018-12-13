public class Database
{
    DBConnection conn;
    Database() 
    {
        conn = new DBConnection();
    }

    void addUser(User user) 
    {


    }

    void removeUser(User user) 
    {


    }

    void deleteUser(User user) 
    {


    }

    User listUser(User user) 
    {
        return null;
    }

    void addTimetable(Timetable table) 
    {


    }

    void removeTable(Timetable table) 
    {


    }

    void deleteTable(Timetable table) 
    {


    }

    Timetable[] listTable(User user) 
    {
        return null;
    }

    Timetable[] listTable(Timetable table) 
    {
        return null;
    }
}

class DBConnection
{

    Boolean FirstInstance = true;

    DBConnection(String user, String pass) {
        
    }
}