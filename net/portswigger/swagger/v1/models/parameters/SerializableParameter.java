package net.portswigger.swagger.v1.models.parameters;

import java.math.BigDecimal;
import java.util.List;
import net.portswigger.swagger.v1.models.properties.Property;

public interface SerializableParameter extends Parameter {
  String getType();
  
  void setType(String paramString);
  
  Property getItems();
  
  void setItems(Property paramProperty);
  
  String getFormat();
  
  void setFormat(String paramString);
  
  String getCollectionFormat();
  
  void setCollectionFormat(String paramString);
  
  List<String> getEnum();
  
  void setEnum(List<String> paramList);
  
  List<Object> getEnumValue();
  
  void setEnumValue(List<?> paramList);
  
  Integer getMaxLength();
  
  void setMaxLength(Integer paramInteger);
  
  Integer getMinLength();
  
  void setMinLength(Integer paramInteger);
  
  String getPattern();
  
  void setPattern(String paramString);
  
  Boolean isUniqueItems();
  
  void setUniqueItems(Boolean paramBoolean);
  
  Number getMultipleOf();
  
  void setMultipleOf(Number paramNumber);
  
  Boolean isExclusiveMaximum();
  
  void setExclusiveMaximum(Boolean paramBoolean);
  
  Boolean isExclusiveMinimum();
  
  void setExclusiveMinimum(Boolean paramBoolean);
  
  BigDecimal getMaximum();
  
  void setMaximum(BigDecimal paramBigDecimal);
  
  BigDecimal getMinimum();
  
  void setMinimum(BigDecimal paramBigDecimal);
  
  Integer getMaxItems();
  
  void setMaxItems(Integer paramInteger);
  
  Integer getMinItems();
  
  void setMinItems(Integer paramInteger);
  
  Boolean getAllowEmptyValue();
  
  void setAllowEmptyValue(Boolean paramBoolean);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\SerializableParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */