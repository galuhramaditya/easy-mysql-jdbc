# Easy MySQL JDBC

Library to make MySQL JDBC easier

## Required

- **MySQL JDBC Driver**

------------


### How to add
1. Add library by **jar/folder** or **copy** `galuh` folder **to** your **package**
2. Set the configuration in one place or `main method` ****once enough!***

------------

### Default MySQL Config
- host				: localhost
- port				: 3306
- database		:
- username		: root
- password		:

------------

## Features

### Primary
#### data
    String id = DB.data.getString("id")
> SQL data Container


#### query(String query)
	DB.query("SELECT * FROM TEST")
> get data from SQL


#### execute(String query)
    DB.execute("INSERT INTO test (id, name) VALUES(NULL, 'Galuh')");
>  execute query to manipulating MySQL datas


### Configuration
#### setHost(String host)
    DB.data.setHost("localhost")


#### setPort(int port)
    DB.data.setPort(3306)


#### setDatabase(String database)
    DB.data.setDatabase("test")


#### setUsername(String username)
    DB.data.setUsername("root")


#### setPassword(String password)
    DB.data.setPassword("")


------------

## Examples
#### Get datas

    DB.query("SELECT * FROM test");
    
    while (DB.data.next()) {
    	System.out.println(DB.data.getString("id"));
    }

#### Delete data
    
	DB.execute("DELETE FROM test WHERE id = 1");
    

------------

# Contact
- email : galuh.ramaditya@gmail.com
