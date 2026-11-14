package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/procon_coelho_neto";
    private static final String USUARIO = "postgres";
    private static final String SENHA = System.getenv("DB_PASSWORD");
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
