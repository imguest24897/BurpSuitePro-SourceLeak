package org.bouncycastle.asn1.est;

class Utils {
  static AttrOrOID[] clone(AttrOrOID[] paramArrayOfAttrOrOID) {
    AttrOrOID[] arrayOfAttrOrOID = new AttrOrOID[paramArrayOfAttrOrOID.length];
    System.arraycopy(paramArrayOfAttrOrOID, 0, arrayOfAttrOrOID, 0, paramArrayOfAttrOrOID.length);
    return arrayOfAttrOrOID;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\est\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */