package com.informationasset.constants;

import lombok.Getter;

@Getter
public class Datasource_Name {
private String MySQL="jdbc:mysql://";
private String PostgreSQL="jdbc:postgresql://";
private String MsSQL="jdbc:sqlserver://";
private String Redshift="jdbc:redshift://";
private String Snowflake="jdbc:snowflake://";
}
