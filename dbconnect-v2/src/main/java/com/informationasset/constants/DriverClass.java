package com.informationasset.constants;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DriverClass {
private String MySQL="com.mysql.cj.jdbc.Driver";
private String PostgreSql="org.postgresql.Driver";
private String MsSQL="com.microsoft.jdbc.sqlserver.SQLServerDriver";
private String Redshift="com.amazon.redshift.jdbc42.Driver";
private String Snowflake="com.snowflake.client.jdbc.SnowflakeDriver";
}
