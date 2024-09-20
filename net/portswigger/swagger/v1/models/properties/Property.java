package net.portswigger.swagger.v1.models.properties;

import com.fasterxml.Zvi;
import com.fasterxml.Zyl;
import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v1.models.Xml;

public interface Property {
  Property title(String paramString);
  
  Property description(String paramString);
  
  String getType();
  
  String getFormat();
  
  String getTitle();
  
  void setTitle(String paramString);
  
  String getDescription();
  
  void setDescription(String paramString);
  
  Boolean getAllowEmptyValue();
  
  void setAllowEmptyValue(Boolean paramBoolean);
  
  @Zyx
  String getName();
  
  void setName(String paramString);
  
  @Zyx
  boolean getRequired();
  
  void setRequired(boolean paramBoolean);
  
  @Zyl
  Object getExample();
  
  @Zvi
  void setExample(Object paramObject);
  
  @Deprecated
  @Zyx
  void setExample(String paramString);
  
  Boolean getReadOnly();
  
  void setReadOnly(Boolean paramBoolean);
  
  Integer getPosition();
  
  void setPosition(Integer paramInteger);
  
  Xml getXml();
  
  void setXml(Xml paramXml);
  
  void setDefault(String paramString);
  
  @Zyx
  String getAccess();
  
  @Zyx
  void setAccess(String paramString);
  
  Map<String, Object> getVendorExtensions();
  
  Property rename(String paramString);
  
  @Zyx
  Boolean getBooleanValue();
  
  void setBooleanValue(Boolean paramBoolean);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\Property.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */