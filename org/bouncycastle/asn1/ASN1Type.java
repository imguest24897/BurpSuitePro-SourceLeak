package org.bouncycastle.asn1;

abstract class ASN1Type {
  final Class javaClass;
  
  ASN1Type(Class paramClass) {
    this.javaClass = paramClass;
  }
  
  final Class getJavaClass() {
    return this.javaClass;
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject);
  }
  
  public final int hashCode() {
    return super.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1Type.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */