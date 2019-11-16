## Easy MySQL JDBC

######Library to make MySQL JDBC easier

### Required

- **MySQL JDBC Driver**

------------


#### How to add
1. Add library by **jar** or **copy** `galuh` package
2. Set the configuration in one place or `main method` ****once enough!***

------------

#### Default MySQL Config
- host				: localhost
- port				: 3306
- database		:
- username		: root
- password		:

------------

### Features

#### Primary
##### data
###### SQL data Container
    String id = DB.data.getString("id")

<br>
##### query(String query)
###### get data from SQL
	DB.query("SELECT * FROM TEST")

<br>
##### execute(String query)
###### execute query to manipulating MySQL datas
    DB.execute("INSERT INTO test (id, name) VALUES(NULL, 'Galuh')");

<br>
<br>
#### Configuration
##### setHost(String host)
    DB.data.setHost("localhost")

<br>
##### setPort(int port)
    DB.data.setPort(3306)

<br>
##### setDatabase(String database)
    DB.data.setDatabase("test")

<br>
##### setUsername(String username)
    DB.data.setUsername("root")

<br>
##### setPassword(String password)
    DB.data.setPassword("")


------------

### Examples
##### Get datas

    DB.query("SELECT * FROM test");
    
    while (DB.data.next()) {
    	System.out.println(DB.data.getString("id"));
    }

<br>
##### Insert data
    
	DB.execute("DELETE FROM test WHERE id = 1");
    

------------

## Contact
- email : galuh.ramaditya@gmail.com
