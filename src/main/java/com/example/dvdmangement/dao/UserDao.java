package com.example.dvdmangement.dao;

import com.example.dvdmangement.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
public class UserDao {

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/mydb?serverTimezone=Asia/Seoul",
                "root",
                "0211"
        );
    }

    // username으로 유저 찾기
    public UserDTO findByUsername(String id) {
        String sql = "SELECT User_ID, 이름, 나이, 아이디, 비밀번호 FROM user WHERE 아이디 = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUserid(rs.getInt("User_ID"));    // PK
                    user.setName(rs.getString("이름"));      // 이름
                    user.setAge(rs.getInt("나이"));          // 나이
                    user.setId(rs.getString("아이디"));      // 아이디
                    user.setPassword(rs.getString("비밀번호")); // 비번
                    return user;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // 없으면 null
    }
    // 회원 저장 (회원가입)
    public void save(UserDTO user) {
        String sql = "INSERT INTO user(이름, 나이, 아이디, 비밀번호) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getName());     // 이름
            pstmt.setInt(2, user.getAge());        // 나이
            pstmt.setString(3, user.getId());      // 아이디
            pstmt.setString(4, user.getPassword()); // 비밀번호

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
