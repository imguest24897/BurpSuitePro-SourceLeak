package com.install4j.api.beaninfo;

public interface PropertyConverter {
  public static final String DEFAULT_CONTEXT = "defaultConverterContext";
  
  Class getPropertyClass();
  
  String getContext();
  
  String toString(Object paramObject);
  
  boolean supportsFromString();
  
  Object fromString(String paramString);
  
  Class getPropertyCustomizerClass();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\PropertyConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */