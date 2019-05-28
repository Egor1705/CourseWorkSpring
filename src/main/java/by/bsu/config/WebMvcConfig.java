package by.bsu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import by.bsu.dao.AirportDao;
import by.bsu.dao.AirportDaoImpl;
import by.bsu.dao.PlaneDao;
import by.bsu.dao.PlaneDaoImpl;
import by.bsu.dao.TicketDao;
import by.bsu.dao.TicketDaoImpl;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "by.bsu.controller", "by.bsu.dao" })
public class WebMvcConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");

		return vr;
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/Airport?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("Bottomass1375");

		return ds;
	}
	@Bean
	public TicketDao getTicketDao() {
		return new TicketDaoImpl(getDataSource());
	}
	@Bean
	public AirportDao getAirportDao() {
		return new AirportDaoImpl(getDataSource());
	}
	@Bean
	public PlaneDao getPlaneDao() {
		return new PlaneDaoImpl(getDataSource());
	}
	
}
