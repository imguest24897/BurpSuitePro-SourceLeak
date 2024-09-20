package com.install4j.runtime.installer.helper.registry;

public interface RegistryInterface {
  void setValue(String paramString1, String paramString2);
  
  String getValue(String paramString);
  
  String getOtherBitnessValue(String paramString);
  
  void deleteValue(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\registry\RegistryInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */