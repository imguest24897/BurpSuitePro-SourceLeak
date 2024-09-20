package org.bouncycastle.tls;

public class SupplementalDataEntry {
  protected int dataType;
  
  protected byte[] data;
  
  public SupplementalDataEntry(int paramInt, byte[] paramArrayOfbyte) {
    this.dataType = paramInt;
    this.data = paramArrayOfbyte;
  }
  
  public int getDataType() {
    return this.dataType;
  }
  
  public byte[] getData() {
    return this.data;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SupplementalDataEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */