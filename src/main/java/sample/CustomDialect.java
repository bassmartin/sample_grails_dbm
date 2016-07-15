package sample;

import org.hibernate.dialect.H2Dialect;

import java.sql.Types;

public class CustomDialect extends H2Dialect {

    public CustomDialect() {
        super();
        registerColumnType(Types.TIMESTAMP, "timestamptz");
        registerHibernateType(Types.TIMESTAMP, "timestamptz");
    }
}
