package net.portswigger.swagger.v1.models.auth;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.Map;

public interface SecuritySchemeDefinition {
  String getType();
  
  void setType(String paramString);
  
  @Zyi
  Map<String, Object> getVendorExtensions();
  
  @Zv8
  void setVendorExtension(String paramString, Object paramObject);
  
  String getDescription();
  
  void setDescription(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\auth\SecuritySchemeDefinition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */