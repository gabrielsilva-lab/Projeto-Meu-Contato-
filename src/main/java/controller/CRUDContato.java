
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CRUDContato {
        
        //CREATE
        public static void cadastarUsuarios(String nome, int telefone, String email) { 
            String sql = "INSERT INTO from usuarios(nome,telefone,email) VALUES(?,?,?)";
            
            try{
            Connection conexao = ContatoDAO.conectar();
            PreparedStatement cmd = conexao.prepareStatement(sql);
            
            cmd.setString(1, "Silva");
            cmd.setInt(2, 998775488);
            cmd.setString(3, "silva@gmail.com");
            
            cmd.setString(2, "Lara");
            cmd.setInt(2, 997145989);
            cmd.setString(3, "lara@gmail.com");
            
            cmd.setString(3, "Joao");
            cmd.setInt(2, 988245719);
            cmd.setString(3, "joao@gmail.com");
            
            cmd.setString(4, "Heitor");
            cmd.setInt(2, 987941539);
            cmd.setString(3, "heitor@gmail.com");
            }
            catch(SQLException e){
                System.out.println("Erro ao cadastrar usuarios"+e.getMessage());
            }
        }    
        
        //READ
        public static void listarUsuarios() {
            String sql = "SELECT * FROM usuarios";
            
            try {
                Connection conexao = ContatoDAO.conectar();
                PreparedStatement cmd = conexao.prepareStatement(sql);
                ResultSet rs = cmd.executeQuery();
            
            }
            catch(SQLException e) {
                System.out.println("Usuario nao cadastrado"+e.getMessage());
            }
        }
        
        
        //UPDATE
        public static boolean atualizarUsuarios(){
            String sql = "UPDATE usuarios SET email = ? WHERE id = ?";
            
            try{
                Connection conexao = ContatoDAO.conectar();
                PreparedStatement cmd = conexao.prepareStatement(sql);
                
                cmd.setInt(1, 1);
                cmd.setString(1, "email");
                return cmd.executeUpdate()>0;
            }
            catch(SQLException e){
                System.out.println("Erro ao atualizar usuarios"+e.getMessage());
            }
            return false;
        }
        
        //DELETE
        public static boolean deletarUsuarios(int id){
            String sql = "DELETE FROM usuarios WHERE id = ?";
            
            try{
                Connection conexao = ContatoDAO.conectar();
                PreparedStatement cmd = conexao.prepareStatement(sql);
                
                cmd.setInt(3, id);
                
                return cmd.executeUpdate()>0;
            }
            catch(SQLException e) {
                System.out.println("Erro ao deletar usuarios"+e.getMessage());
            }
            
            return false;
        }
    }
