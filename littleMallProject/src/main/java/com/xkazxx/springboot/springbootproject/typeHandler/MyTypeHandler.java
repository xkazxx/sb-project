package com.xkazxx.springboot.springbootproject.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTypeHandler extends BaseTypeHandler<String[]> {
    //javabean的类型转换成数据库对应的列存储
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i,
                                    String[] strings, JdbcType jdbcType) throws SQLException {
        if(strings == null || strings.length < 1){
            preparedStatement.setString(i,"");
            return;
        }
        //参数i你需要转换的数据所在数据库表的列数
        StringBuffer sb = new StringBuffer();
        for (String string : strings) {
            sb.append(string).append(",");
        }
        String goodsValue = sb.toString().substring(sb.length() - 1);
        preparedStatement.setString(i,goodsValue);
    }

    //将数据库类型转换成javabean类型
    @Override
    public String[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String goodsValue = resultSet.getString(s);
        if (goodsValue == null || goodsValue.length() < 1) return new String[0];
        return goodsValue.split(",");
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String goodsValue = resultSet.getString(i);
        return goodsValue.split(",");
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String goodsValue = callableStatement.getString(i);
        return goodsValue.split(",");
    }
}
