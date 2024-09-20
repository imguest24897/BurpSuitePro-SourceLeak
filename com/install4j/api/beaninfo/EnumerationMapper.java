package com.install4j.api.beaninfo;

public interface EnumerationMapper {
  public static final String DEFAULT_CONTEXT = "defaultEnumContext";
  
  Class getEnumerationClass();
  
  EnumerationMapEntry[] getEnumerationMapEntries();
  
  String getContext();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\EnumerationMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */