package mum.repository;

import mum.domain.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryAdviceRepository implements AdviceRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private static final class AdviceMapper implements RowMapper<Advice> {
        public Advice mapRow(ResultSet rs, int rowNum) throws SQLException {
            Advice advice = new Advice();
            advice.setRoast(rs.getString("ROAST"));
            advice.setAdvice(rs.getString("ADVICE"));
            return advice;
        }
    }

    @Override
    public List<String> getAdvice(String roast) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("roast", roast);
        List<Advice> adviceList = jdbcTemplate.query("SELECT * FROM advices WHERE roast = :roast", params, new AdviceMapper());
        List<String> advices = new ArrayList<String>();
        for (int i = 0; i < adviceList.size(); i++) {
            advices.add(adviceList.get(i).getAdvice());
        }
        return advices;
    }
}
