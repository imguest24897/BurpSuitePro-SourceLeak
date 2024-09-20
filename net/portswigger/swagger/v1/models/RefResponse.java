package net.portswigger.swagger.v1.models;

import com.fasterxml.Zyx;
import net.portswigger.swagger.v1.models.refs.GenericRef;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.models.refs.RefType;

public class RefResponse extends Response {
  private GenericRef genericRef;
  
  public RefResponse() {}
  
  public RefResponse(String paramString) {
    set$ref(paramString);
  }
  
  public void set$ref(String paramString) {
    this.genericRef = new GenericRef(RefType.RESPONSE, paramString);
  }
  
  public String get$ref() {
    return this.genericRef.getRef();
  }
  
  @Zyx
  public String getSimpleRef() {
    return this.genericRef.getSimpleRef();
  }
  
  public String getOriginalRef() {
    return (this.genericRef != null) ? this.genericRef.getOriginalRef() : null;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    RefResponse refResponse = (RefResponse)paramObject;
    if ((this.genericRef != null) ? !this.genericRef.equals(refResponse.genericRef) : (refResponse.genericRef != null))
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\RefResponse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */