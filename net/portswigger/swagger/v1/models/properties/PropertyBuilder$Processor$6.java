package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;

enum PropertyBuilder$Processor$6 {
  protected boolean isType(String paramString1, String paramString2) {
    return IntegerProperty.isType(paramString1, paramString2);
  }
  
  protected IntegerProperty create() {
    return new IntegerProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    IntegerProperty integerProperty;
    super.merge(paramProperty, paramMap);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (paramProperty instanceof IntegerProperty) {
      integerProperty = (IntegerProperty)paramProperty;
      mergeNumeric(integerProperty, paramMap);
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        if (str != null) {
          integerProperty.setDefault(str);
          if (arrayOfInt != null) {
            integerProperty.setDefault((Integer)null);
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
    integerProperty.setDefault((Integer)null);
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    if (isType(paramProperty)) {
      IntegerProperty integerProperty = (IntegerProperty)paramProperty;
      ModelImpl modelImpl = createModel(integerProperty);
      Integer integer = integerProperty.getDefault();
      if (integer != null)
        modelImpl.setDefaultValue(integer.toString()); 
      return (Model)modelImpl;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */