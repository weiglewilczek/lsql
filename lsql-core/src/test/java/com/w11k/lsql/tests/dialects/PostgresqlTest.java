package com.w11k.lsql.tests.dialects;

import com.w11k.lsql.dialects.BaseDialect;
import com.w11k.lsql.dialects.PostgresDialect;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class PostgresqlTest extends AbstractDialectTests {

    @Override
    public DataSource createDataSource() throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(org.postgresql.Driver.class.getName());
        ds.setUrl("jdbc:postgresql://localhost/lsqltests?user=lsqltestsuser&password=lsqltestspass");
        ds.setDefaultAutoCommit(false);
        return ds;
    }

    @Override
    public BaseDialect createDialect() {
        return new PostgresDialect();
    }

    @Override
    protected void setupTestTable() {
        lSql.executeRawSql("CREATE TABLE table1 (id SERIAL PRIMARY KEY, age INTEGER)");
    }

    @Override
    protected void setupCompanyEmployeeContactTables() {
        lSql.executeRawSql("CREATE TABLE company (id SERIAL PRIMARY KEY, name TEXT);");
        lSql.executeRawSql("CREATE TABLE customer (id SERIAL PRIMARY KEY, name TEXT, company_id INT REFERENCES company (id));");
        lSql.executeRawSql("CREATE TABLE employee (id SERIAL PRIMARY KEY, name TEXT, company_id INT REFERENCES company (id));");
        lSql.executeRawSql("CREATE TABLE contact (id SERIAL PRIMARY KEY, name TEXT, employee_id INT REFERENCES employee (id));");
    }

    @Override
    protected String getBlobColumnType() {
        return "bytea";
    }
}
