package com.example.webservice.controller;

import com.example.webservice.TpWsApplication;
import com.example.webservice.connection.ConnectDB;
import com.example.webservice.model.*;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins= "*", maxAge = 3600)
@RequestMapping("/api/v1/historique")
public class HistoriqueController {

    @GetMapping("/liste/{id_utilisateur}")
    public ArrayList<Historique> getHistorique(@PathVariable Integer id_utilisateur) throws SQLException {
        ArrayList<Historique> historiques = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from v_historique_enchere where id_utilisateur="+id_utilisateur;
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Historique rec = new Historique(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                historiques.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return historiques;
    }

    @GetMapping("/liste")
    public ArrayList<Historique> getHistorique() throws SQLException {
        ArrayList<Historique> historiques = new ArrayList<>();
        ConnectDB postgreSQL = TpWsApplication.getPostgreSQL();
        Connection conn = null;
        PreparedStatement stmt=null;
        try {
            conn = postgreSQL.getConnection();
            String sql = "select * from v_historique_enchere";
            stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()) {
                Historique rec = new Historique(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                historiques.add(rec);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (stmt!=null) stmt.close();
        }
        return historiques;
    }




}
