package net.portswigger.swagger.v1.models.properties;

import java.util.Map;

enum PropertyBuilder$Processor$1 {
  protected boolean isType(String paramString1, String paramString2) {
    return BooleanProperty.isType(paramString1, paramString2);
  }
  
  protected BooleanProperty create() {
    return new BooleanProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    BooleanProperty booleanProperty;
    super.merge(paramProperty, paramMap);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (paramProperty instanceof BooleanProperty) {
      booleanProperty = (BooleanProperty)paramProperty;
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        if (str != null) {
          booleanProperty.setDefault(str);
          if (arrayOfInt != null) {
            booleanProperty.setDefault((Boolean)null);
            return paramProperty;
          } 
          return paramProperty;
        } 
      } else {
        return paramProperty;
      } 
    } else {
      return paramProperty;
    } 
    booleanProperty.setDefault((Boolean)null);
    return paramProperty;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */