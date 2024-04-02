package kr.ac.hansung.cse.dao;
/*
import kr.ac.hansung.cse.model.Course;
//import kr.ac.hansung.cse.model.Offer;
import kr.ac.hansung.cse.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CourseDao {

    private JdbcTemplate jdbcTemplate;  // psa(portable service abstraction, sql(x) api

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getRowCount() {
        String sqlStatement= "select count(*) from courses";
        return jdbcTemplate.queryForObject(sqlStatement, Integer.class);

    }
    //query and return a single object
    public Course getCourse(String name) {

        String sqlStatement= "select * from courses where name=?";
        return jdbcTemplate.queryForObject(sqlStatement, new Object[] {name},
                new RowMapper<Course>() {

                    @Override
                    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

                        Course course= new Course();
                        course.setC_year(rs.getInt("c_year"));
                        course.setC_semester(rs.getInt("c_semester"));
                        course.setC_code(rs.getString("c_code"));
                        course.setC_name(rs.getString("c_name"));
                        course.setC_subject(rs.getString("c_subject"));
                        course.setC_professor(rs.getString("c_professor"));

                        return course;
                    }
                });
    }

    //query and return multiple objects
    // cRud method
    public List<Course> getCourses() {

        String sqlStatement= "select * from courses";
        return jdbcTemplate.query(sqlStatement, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

                Course course= new Course();
                course.setC_year(rs.getInt("c_year"));
                course.setC_semester(rs.getInt("c_semester"));
                course.setC_code(rs.getString("c_code"));
                course.setC_name(rs.getString("c_name"));
                course.setC_subject(rs.getString("c_subject"));
                course.setC_professor(rs.getString("c_professor"));

                return course;
            }
        });
    }


    // Crud method
    public boolean insert(Course course) {

        int c_year=course.getC_year();
        int c_semester=course.getC_semester();
        String c_code= course.getC_code();
        String c_name= course.getC_name();
        String c_subject= course.getC_subject();
        String c_professor= course.getC_professor();

        String sqlStatement= "insert into courses (c_year, c_semester, c_code, c_name, c_subject, c_professor) values (?,?,?,?,?,?)";

        return (jdbcTemplate.update(sqlStatement, new Object[] {c_year, c_semester, c_code, c_name, c_subject, c_professor}) == 1);
    }

    // crUd method
    public boolean update(Course course) {


        int c_year=course.getC_year();
        int c_semester=course.getC_semester();
        String c_code= course.getC_code();
        String c_name= course.getC_name();
        String c_subject= course.getC_subject();
        String c_professor= course.getC_professor();
        String sqlStatement= "update courses set c_year=?, c_semester=?, c_name=?,c_subject=?,c_professor=?, where c_code=?";

        return (jdbcTemplate.update(sqlStatement, new Object[] {c_year, c_semester, c_code, c_name, c_subject, c_professor}) == 1);
    }

    //cruD method
    public boolean delete(String c_code) {
        String sqlStatement= "delete from courses where c_code=?";
        return (jdbcTemplate.update(sqlStatement, new Object[] {c_code}) == 1);
    }

}
*/