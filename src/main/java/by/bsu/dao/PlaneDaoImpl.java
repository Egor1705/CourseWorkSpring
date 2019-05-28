package by.bsu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import by.bsu.model.Plane;

public class PlaneDaoImpl implements PlaneDao {
	
	
	private JdbcTemplate jdbcTemp;
	
	public PlaneDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}
	

	@Override
	public List<Plane> listAllPlanes() {
		List<Plane> list = jdbcTemp.query("SELECT * FROM Planes", new RowMapper<Plane>() {

			public Plane mapRow(ResultSet rs, int rowNum) throws SQLException {
				Plane plane = new Plane();
				plane.setId_plane(rs.getInt("id_plane"));
				plane.setPlane_name(rs.getString("plane_name"));
				plane.setId_ticket_plane(rs.getInt("id_ticket_plane"));
				plane.setId_class_plane(rs.getInt("id_class_plane"));
				return plane;
			}		
		});	
		return list;
	}

}
