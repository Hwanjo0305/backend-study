package week4.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/backend_study";
        String username = "postgres";

        Scanner scanner = new Scanner(System.in);
        System.out.print("PostgreSQL 비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        String sql = "SELECT id, name, email, age FROM users ORDER BY id";
        try (
            Connection connection =
                DriverManager.getConnection(url, username, password);

            PreparedStatement statement =
                connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery()
        ) {
            System.out.println("PostgreSQL 연결 성공!");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");

                System.out.printf(
                    "ID: %d, 이름: %s, 이메일: %s, 나이: %d%n",
                    id, name, email, age
                );
            }

        } catch (SQLException e) {
            System.out.println("데이터베이스 작업 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
