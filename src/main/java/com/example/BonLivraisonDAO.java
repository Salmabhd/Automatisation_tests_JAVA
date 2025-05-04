package com.example;

import java.sql.*;

public class BonLivraisonDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // mets le mot de passe si besoin

    public void afficherTousLesBons() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT * FROM bonlivraison";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", ID Client: " + rs.getInt("id_client") +
                        ", Client: " + rs.getString("client"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
