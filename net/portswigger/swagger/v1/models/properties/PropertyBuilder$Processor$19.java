package net.portswigger.swagger.v1.models.properties;

import net.portswigger.swagger.v1.models.Model;

enum PropertyBuilder$Processor$19 {
  protected boolean isType(String paramString1, String paramString2) {
    return MapProperty.isType(paramString1, paramString2);
  }
  
  protected MapProperty create() {
    return new MapProperty();
  }
  
  public Model toModel(Property paramProperty) {
    if (paramProperty instanceof MapProperty) {
      MapProperty mapProperty = (MapProperty)paramProperty;
      return (Model)createModel(paramProperty).additionalProperties(mapProperty.getAdditionalProperties());
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$19.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */