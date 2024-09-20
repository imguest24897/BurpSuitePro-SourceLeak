package net.portswigger.swagger.v1.models;

import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v1.models.properties.Property;

public interface Model {
  String getTitle();
  
  void setTitle(String paramString);
  
  String getDescription();
  
  void setDescription(String paramString);
  
  Map<String, Property> getProperties();
  
  void setProperties(Map<String, Property> paramMap);
  
  Object getExample();
  
  void setExample(Object paramObject);
  
  ExternalDocs getExternalDocs();
  
  String getReference();
  
  void setReference(String paramString);
  
  Object clone();
  
  Map<String, Object> getVendorExtensions();
  
  @Zyx
  Boolean getBooleanValue();
  
  void setBooleanValue(Boolean paramBoolean);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Model.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */