package org.openapi4j;

public class Zpc extends Zc<Zpc> {
  private String name;
  
  private String description;
  
  private Zb externalDocs;
  
  public String getName() {
    return this.name;
  }
  
  public Zpc setName(String paramString) {
    this.name = paramString;
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public Zpc setDescription(String paramString) {
    this.description = paramString;
    return this;
  }
  
  public Zb getExternalDocs() {
    return this.externalDocs;
  }
  
  public Zpc setExternalDocs(Zb paramZb) {
    this.externalDocs = paramZb;
    return this;
  }
  
  public Zpc copy() {
    Zpc zpc = new Zpc();
    zpc.setName(getName());
    zpc.setDescription(getDescription());
    zpc.setExternalDocs((Zb)copyField(getExternalDocs()));
    zpc.setExtensions(copySimpleMap(getExtensions()));
    return zpc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */