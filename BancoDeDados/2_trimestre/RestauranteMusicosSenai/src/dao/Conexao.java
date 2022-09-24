/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import application.Artista;
import application.Restaurante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_apio-souza
 */
public class Conexao {
    private static Connection connection;
   
    public static Connection getConnection(){
        if(connection == null){
            try{
                //Class.forName("com.mysql.jdbc.Driver"); //para mysql
                Class.forName("org.postgresql.Driver");//para postgresql
                String host = "localhost";
                String port = "5432";
                String database = "senaiRestaurantesMusicos";
                String user = "postgres";
                String pass = "postgres";//digitar a senha do seu banco
                //String url = "jdbc:mysql://"+host+":"+port+"/"+database; //para mysql
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;//para postgresql
                connection = DriverManager.getConnection(url, user, pass);                
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    
    public static void salvarArtista (Artista artista){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO musicos (cpf,nome, numero, email, categoria, estado, cidade, bairro, numero_casa, cep, senha) values(?, ?, ? , ? , ? , ? , ?, ? , ? , ? , ?)");
            ps.setString(1, artista.getCpf());
            ps.setString(2, artista.getNome());
            ps.setString(3, artista.getNumero());        
            ps.setString(4, artista.getEmail());
            ps.setString(5, artista.getCategoria());
            ps.setString(6, artista.getEstado());
            ps.setString(7, artista.getCidade());
            ps.setString(8, artista.getBairro());
            ps.setString(9, artista.getNumero_casa());
            ps.setString(10, artista.getCep()); 
            ps.setString(11, artista.getSenha());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deletaArtista(String cpf){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM artista WHERE cpf = ?");
            ps.setString(1, cpf);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaArtista (Artista artista){
        deletaArtista(artista.getCpf());
        salvarArtista(artista);
    }
    
    //Restaurante
    public static void salvarRestaurante (Restaurante restaurante){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO restaurante (cnpj,nome, numero, email,estado, cidade, bairro, numero_restaurante, cep, senha) values(?, ?, ? , ?, ?, ?, ? , ? , ?, ?)");
            ps.setString(1, restaurante.getCnpj());
            ps.setString(2, restaurante.getNome());
            ps.setString(3, restaurante.getNumero());        
            ps.setString(4, restaurante.getEmail());
            ps.setString(5, restaurante.getEstado());
            ps.setString(6, restaurante.getCidade());
            ps.setString(7, restaurante.getBairro());
            ps.setString(8, restaurante.getNumero_restaurante());
            ps.setString(9, restaurante.getCep()); 
            ps.setString(10, restaurante.getSenha());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void deletaRestaurante(String cnpj){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete FROM restaurante WHERE cnpj = ?");
            ps.setString(1, cnpj);
            ps.executeUpdate();


            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void atualizaRestaurante (Restaurante restaurante){
        deletaRestaurante(restaurante.getCnpj());
        salvarRestaurante(restaurante);
    }
    
    public static List<Restaurante> listRestaurante() throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement("Select * FROM restaurante");
        ResultSet rs = ps.executeQuery();
        List<Restaurante> res = new ArrayList<>();
        while (rs.next()) {            
            Restaurante restaurante = new Restaurante();
            restaurante.setCnpj(rs.getString("cnpj"));
            restaurante.setCep(rs.getString("cep"));
            restaurante.setBairro(rs.getString("bairro"));
            restaurante.setCidade(rs.getString("cidade"));
            restaurante.setEmail(rs.getString("email"));
            restaurante.setEstado(rs.getString("estado"));
            restaurante.setNome(rs.getString("nome"));
            restaurante.setNumero(rs.getString("numero"));
            restaurante.setNumero_restaurante(rs.getString("numero_restaurante"));
            restaurante.setSenha(rs.getString("senha"));
            res.add(restaurante);
        }
        return res;
    }
    
    public static List<Artista> listArtista() throws SQLException{
        Connection con = Conexao.getConnection();
        PreparedStatement ps = con.prepareStatement("Select * FROM musicos");
        ResultSet rs = ps.executeQuery();
        List<Artista> res = new ArrayList<>();
        while (rs.next()) {            
            Artista artista = new Artista();
            artista.setCpf(rs.getString("cpf"));
            artista.setCep(rs.getString("cep"));
            artista.setBairro(rs.getString("bairro"));
            artista.setCidade(rs.getString("cidade"));
            artista.setEmail(rs.getString("email"));
            artista.setEstado(rs.getString("estado"));
            artista.setNome(rs.getString("nome"));
            artista.setNumero(rs.getString("numero"));
            artista.setNumero_casa(rs.getString("numero_casa"));
            artista.setSenha(rs.getString("senha"));
            artista.setCategoria(rs.getString("categoria"));
            res.add(artista);
        }
        return res;
    }

}
