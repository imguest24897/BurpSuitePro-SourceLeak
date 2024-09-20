package org.bouncycastle.asn1;

import java.io.OutputStream;

public abstract class ASN1Generator {
  protected OutputStream _out;
  
  public ASN1Generator(OutputStream paramOutputStream) {
    this._out = paramOutputStream;
  }
  
  public abstract OutputStream getRawOutputStream();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1Generator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */