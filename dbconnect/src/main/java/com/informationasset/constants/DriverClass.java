package com.informationasset.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DriverClass {
MySQL("com.mysql.cj.jdbc.Driver"),
PostgreSql("org.postgresql.Driver"),
MSSql("com.microsoft.jdbc.sqlserver.SQLServerDriver"),
Redshift("com.amazon.redshift.jdbc42.Driver"),
Snowflake("com.snowflake.client.jdbc.SnowflakeDriver");
	private String driverClass;
}