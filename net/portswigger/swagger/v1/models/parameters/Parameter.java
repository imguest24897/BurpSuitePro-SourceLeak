package net.portswigger.swagger.v1.models.parameters;

import com.fasterxml.Zyx;
import java.util.Map;

public interface Parameter {
  String getIn();
  
  void setIn(String paramString);
  
  @Zyx
  String getAccess();
  
  @Zyx
  void setAccess(String paramString);
  
  String getName();
  
  void setName(String paramString);
  
  String getDescription();
  
  void setDescription(String paramString);
  
  boolean getRequired();
  
  void setRequired(boolean paramBoolean);
  
  String getPattern();
  
  void setPattern(String paramString);
  
  Map<String, Object> getVendorExtensions();
  
  Boolean isReadOnly();
  
  void setReadOnly(Boolean paramBoolean);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\Parameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */