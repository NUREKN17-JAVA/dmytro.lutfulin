package ua.nure.kn.lutfulin.usermanagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
