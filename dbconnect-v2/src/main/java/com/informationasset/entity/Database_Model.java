package com.informationasset.entity;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
public class Database_Model {
private String databaseName;
private String schemaName;
private String tableName;
private String hostName;
private int portNo;
private String userName;
private String password;
}