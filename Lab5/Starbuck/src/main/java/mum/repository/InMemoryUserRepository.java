package mum.repository;

import mum.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private static final class UserMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setName(rs.getString("NAME"));
            user.setPassword(rs.getString("PASSWORD"));
            return user;
        }
    }

    @Override
    public String getPassword(String name) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);
        String expectedPassword = jdbcTemplate.query("SELECT * FROM users WHERE name = :name", params, new UserMapper()).get(0).getPassword();
        return expectedPassword;
    }

}
