package net.portswigger;

class Zt6 implements Zq {
  private final byte[] ZW;
  
  Zt6(byte[] paramArrayOfbyte) {
    this.ZW = paramArrayOfbyte;
  }
  
  public boolean Zc() {
    return (this.ZW == null);
  }
  
  public int Zp() {
    return this.ZW.length;
  }
  
  public int Zg(int paramInt) {
    return this.ZW[paramInt] & 0xFF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */