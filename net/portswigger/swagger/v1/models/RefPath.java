package net.portswigger.swagger.v1.models;

import com.fasterxml.Zyx;
import net.portswigger.swagger.v1.models.refs.GenericRef;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.models.refs.RefType;

public class RefPath extends Path {
  private GenericRef genericRef;
  
  public RefPath() {}
  
  public RefPath(String paramString) {
    set$ref(paramString);
  }
  
  public RefPath(String paramString, RefFormat paramRefFormat) {
    this.genericRef = new GenericRef(RefType.PATH, paramString, paramRefFormat);
  }
  
  public void set$ref(String paramString) {
    this.genericRef = new GenericRef(RefType.PATH, paramString);
  }
  
  public String get$ref() {
    return this.genericRef.getRef();
  }
  
  public String getOriginalRef() {
    return (this.genericRef != null) ? this.genericRef.getOriginalRef() : null;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    RefPath refPath = (RefPath)paramObject;
    if ((this.genericRef != null) ? !this.genericRef.equals(refPath.genericRef) : (refPath.genericRef != null))
      return false; 
  }
  
  public int hashCode() {
    return (this.genericRef != null) ? this.genericRef.hashCode() : 0;
  }
  
  @Zyx
  public RefFormat getRefFormat() {
    return this.genericRef.getFormat();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\RefPath.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */