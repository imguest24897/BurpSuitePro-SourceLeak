package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zvy;
import com.fasterxml.Zy1;
import java.net.URL;

public abstract class Zl<M extends Zpk<M>> extends Zt<M> {
  @Zy1("$ref")
  private String ref;
  
  @Zy1("abs$ref")
  @Zvy({Zax.class})
  private String canonicalRef;
  
  public String getRef() {
    return this.ref;
  }
  
  public boolean isRef() {
    return (this.ref != null);
  }
  
  protected void setRef(String paramString) {
    this.ref = paramString;
  }
  
  protected void setCanonicalRef(String paramString) {
    this.canonicalRef = paramString;
  }
  
  public String getCanonicalRef() {
    return this.canonicalRef;
  }
  
  public Zh getReference(Zx paramZx) {
    return paramZx.Zh().Zg((this.canonicalRef != null) ? this.canonicalRef : this.ref);
  }
  
  public Zh setReference(Zx paramZx, URL paramURL, String paramString) {
    Zh zh = paramZx.Zh().Zs(paramURL, paramString);
    setRef(zh.Zp());
    Zbqc[] arrayOfZbqc = Zt.ZD();
    setCanonicalRef(zh.ZE());
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */