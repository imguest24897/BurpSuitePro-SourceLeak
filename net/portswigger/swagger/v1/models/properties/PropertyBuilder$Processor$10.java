package net.portswigger.swagger.v1.models.properties;

import java.util.Map;

enum PropertyBuilder$Processor$10 {
  protected boolean isType(String paramString1, String paramString2) {
    return BaseIntegerProperty.isType(paramString1, paramString2);
  }
  
  protected BaseIntegerProperty create() {
    return new BaseIntegerProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    super.merge(paramProperty, paramMap);
    if (paramProperty instanceof BaseIntegerProperty) {
      BaseIntegerProperty baseIntegerProperty = (BaseIntegerProperty)paramProperty;
      mergeNumeric(baseIntegerProperty, paramMap);
    } 
    return paramProperty;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$10.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */