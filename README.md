# SpringBoot DB Replication 

**Routing write and read queries to master and slave db respectively.**

This project demonstrates how to implement db-replication using mysql and `connector/j`.

**Pros** :
1. Minimal code chnages required.
2. Connector/j automatically routes the queries to masters and slaves in round-robin fashion.
3. Very easy to scale as adding new slaves and masters is done via the general JDBC URL for MySQL connection. 
4. By setting `readFromMasterWhenNoSlaves=true`, allow connection to a master when no slaves are available.
5. Connector/J also supports live management of replication host (single or multi-master) topographies. This enables users to promote slaves for Java applications without requiring an application restart. 
For full avantages of using this approach visit : https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-master-slave-replication-connection.html

**Cons** :
1. `connector/j` works only for Mysql. For other DB-vendors one need to use `AbstractRoutingDataSource` achieve this.
