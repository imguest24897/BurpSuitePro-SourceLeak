package org.openapi4j;

import burp.Zbqc;
import java.util.Objects;

public class Zo extends Ze<Zo> {
  private String in;
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public Zo setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getIn() {
    return this.in;
  }
  
  public Zo setIn(String paramString) {
    this.in = paramString;
    return this;
  }
  
  public Zo copy() {
    Zo zo = new Zo();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zo.setRef(getRef());
      zo.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        copy(zo);
        zo.setName(getName());
        zo.setIn(getIn());
        return zo;
      } 
      return zo;
    } 
    copy(zo);
    zo.setName(getName());
    zo.setIn(getIn());
    return zo;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zo zo = (Zo)paramObject;
    return isRef() ? Objects.equals(getRef(), zo.getRef()) : (!Objects.equals(this.name, zo.name) ? false : Objects.equals(this.in, zo.in));
  }
  
  public int hashCode() {
    if (isRef())
      return getRef().hashCode(); 
    null = (this.name != null) ? this.name.hashCode() : 0;
    return 31 * null + ((this.in != null) ? this.in.hashCode() : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */