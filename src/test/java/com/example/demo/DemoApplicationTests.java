package com.example.demo;

import com.example.demo.dal.entity.User;
import com.example.demo.dal.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserRepository userRepository;

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testMysql(){
        String sql = "select * from user";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                //user.setGmtCreate(LocalDateTime.ofInstant(resultSet.getDate("gmt_create").toInstant(), ZoneId.systemDefault()));
                //user.setGmtModified(LocalDateTime.ofInstant(resultSet.getDate("gmt_modified").toInstant(), ZoneId.systemDefault()));
                user.setName(resultSet.getString("name"));
                user.setUserId(resultSet.getString("user_id"));
                user.setStatus(resultSet.getInt("status"));
                return user;
            }
        });
        users.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
