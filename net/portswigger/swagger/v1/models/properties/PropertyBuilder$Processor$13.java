package net.portswigger.swagger.v1.models.properties;

import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefModel;

enum PropertyBuilder$Processor$13 {
  protected boolean isType(String paramString1, String paramString2) {
    return RefProperty.isType(paramString1, paramString2);
  }
  
  protected RefProperty create() {
    return new RefProperty();
  }
  
  public Model toModel(Property paramProperty) {
    if (paramProperty instanceof RefProperty) {
      RefProperty refProperty = (RefProperty)paramProperty;
      RefModel refModel = new RefModel(refProperty.getOriginalRef(), refProperty.getRefFormat());
      refModel.setDescription(refProperty.getDescription());
      return (Model)refModel;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$13.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */