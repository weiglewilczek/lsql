package com.w11k.lsql.converter;

import com.google.common.base.Optional;
import com.w11k.lsql.LSql;
import com.w11k.lsql.Row;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Converter {

    public void setValueInStatement(LSql lSql, PreparedStatement ps, int index,
                                    Object val, int sqlTypeForNullValue) throws SQLException {
        if (val != null) {

            if (convertWithJacksonOnWrongType()
                    && getSupportedJavaClass().isPresent()
                    && !val.getClass().equals(getSupportedJavaClass().get())) {
                // If type is not correct, try to convert
                val = convertValueToTargetType(val);
            }

            setValue(lSql, ps, index, val);
        } else {
            ps.setNull(index, sqlTypeForNullValue);
        }
    }

    public Object convertValueToTargetType(Object val) {
        return Row.fromKeyVals("v", val).getAs(getSupportedJavaClass().get(), "v");
    }

    public Object getValueFromResultSet(LSql lSql, ResultSet rs, int index) throws SQLException {
        Object value = getValue(lSql, rs, index);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public boolean isValueValid(Object value) {
        if (value == null) {
            return isNullValid();
        }
        return getSupportedJavaClass().get().isAssignableFrom(value.getClass());
    }

    public int[] getSupportedSqlTypes() {
        throw new RuntimeException("This converter does not specify the supported SQL types.");
    }

    public Optional<? extends Class<?>> getSupportedJavaClass() {
        return Optional.absent();
    }

    public int getSqlTypeForNullValues() {
        return getSupportedSqlTypes()[0];
    }

    public boolean convertWithJacksonOnWrongType() {
        return true;
    }

    protected abstract void setValue(LSql lSql, PreparedStatement ps, int index,
                                     Object val) throws SQLException;

    protected abstract Object getValue(LSql lSql, ResultSet rs, int index) throws SQLException;

    private boolean isNullValid() {
        return true;
    }

}
