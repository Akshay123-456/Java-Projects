package com.informationasset;

public interface TestInterface {
void show();
String message();
private String getMessage()
{
return message();	
}
  private int getCode(int statusCode)
  {
    return statusCode;
  }
}
