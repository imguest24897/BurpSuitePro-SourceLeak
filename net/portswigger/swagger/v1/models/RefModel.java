package net.portswigger.swagger.v1.models;

import com.fasterxml.Zyx;
import java.util.Map;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.refs.GenericRef;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.models.refs.RefType;

public class RefModel implements Model {
  private GenericRef genericRef;
  
  private String description;
  
  private ExternalDocs externalDocs;
  
  private Map<String, Property> properties;
  
  private Object example;
  
  private String title;
  
  public RefModel() {}
  
  public RefModel(String paramString) {
    set$ref(paramString);
  }
  
  public RefModel(String paramString, RefFormat paramRefFormat) {
    this.genericRef = new GenericRef(RefType.DEFINITION, paramString, paramRefFormat);
  }
  
  public RefModel asDefault(String paramString) {
    set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix());
    return this;
  }
  
  @Zyx
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String paramString) {
    this.title = paramString;
  }
  
  @Zyx
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  @Zyx
  public Map<String, Property> getProperties() {
    return this.properties;
  }
  
  public void setProperties(Map<String, Property> paramMap) {
    this.properties = paramMap;
  }
  
  @Zyx
  public String getSimpleRef() {
    return this.genericRef.getSimpleRef();
  }
  
  public String getOriginalRef() {
    return (this.genericRef != null) ? this.genericRef.getOriginalRef() : null;
  }
  
  public String get$ref() {
    return this.genericRef.getRef();
  }
  
  public void set$ref(String paramString) {
    this.genericRef = new GenericRef(RefType.DEFINITION, paramString);
  }
  
  @Zyx
  public RefFormat getRefFormat() {
    return this.genericRef.getFormat();
  }
  
  @Zyx
  public Object getExample() {
    return this.example;
  }
  
  public void setExample(Object paramObject) {
    this.example = paramObject;
  }
  
  @Zyx
  public ExternalDocs getExternalDocs() {
    return this.externalDocs;
  }
  
  public void setExternalDocs(ExternalDocs paramExternalDocs) {
    this.externalDocs = paramExternalDocs;
  }
  
  public Object clone() {
    RefModel refModel = new RefModel();
    refModel.genericRef = this.genericRef;
    refModel.description = this.description;
    refModel.properties = this.properties;
    refModel.example = this.example;
    return refModel;
  }
  
  @Zyx
  public Map<String, Object> getVendorExtensions() {
    return null;
  }
  
  @Zyx
  public Boolean getBooleanValue() {
    return null;
  }
  
  public void setBooleanValue(Boolean paramBoolean) {}
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    null = 31 * null + ((this.example == null) ? 0 : this.example.hashCode());
    null = 31 * null + ((this.externalDocs == null) ? 0 : this.externalDocs.hashCode());
    null = 31 * null + ((this.properties == null) ? 0 : this.properties.hashCode());
    return 31 * null + ((this.genericRef == null) ? 0 : this.genericRef.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    RefModel refModel = (RefModel)paramObject;
    if (this.description == null) {
      if (refModel.description != null)
        return false; 
    } else if (!this.description.equals(refModel.description)) {
      return false;
    } 
    if (this.example == null) {
      if (refModel.example != null)
        return false; 
    } else if (!this.example.equals(refModel.example)) {
      return false;
    } 
    if (this.externalDocs == null) {
      if (refModel.externalDocs != null)
        return false; 
    } else if (!this.externalDocs.equals(refModel.externalDocs)) {
      return false;
    } 
    if (this.properties == null) {
      if (refModel.properties != null)
        return false; 
    } else if (!this.properties.equals(refModel.properties)) {
      return false;
    } 
    if (this.genericRef == null) {
      if (refModel.genericRef != null)
        return false; 
    } else if (!this.genericRef.equals(refModel.genericRef)) {
      return false;
    } 
    return true;
  }
  
  @Zyx
  public String getReference() {
    return this.genericRef.getRef();
  }
  
  public void setReference(String paramString) {
    this.genericRef = new GenericRef(RefType.DEFINITION, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\RefModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */