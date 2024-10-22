package org.bouncycastle.asn1.x509;

import java.util.Vector;

public class GeneralNamesBuilder {
  private Vector names = new Vector();
  
  public GeneralNamesBuilder addNames(GeneralNames paramGeneralNames) {
    GeneralName[] arrayOfGeneralName = paramGeneralNames.getNames();
    for (byte b = 0; b != arrayOfGeneralName.length; b++)
      this.names.addElement(arrayOfGeneralName[b]); 
    return this;
  }
  
  public GeneralNamesBuilder addName(GeneralName paramGeneralName) {
    this.names.addElement(paramGeneralName);
    return this;
  }
  
  public GeneralNames build() {
    GeneralName[] arrayOfGeneralName = new GeneralName[this.names.size()];
    for (byte b = 0; b != arrayOfGeneralName.length; b++)
      arrayOfGeneralName[b] = this.names.elementAt(b); 
    return new GeneralNames(arrayOfGeneralName);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\GeneralNamesBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */