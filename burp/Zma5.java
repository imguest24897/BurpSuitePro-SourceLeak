package burp;

class Zma5 implements Zmrh {
  private final Zxwh ZK;
  
  private final Zm42 Zl;
  
  public Zma5(Zxwh paramZxwh, Zm42 paramZm42) {
    this.ZK = paramZxwh;
    this.Zl = paramZm42;
  }
  
  public Zbtk Zi() {
    return new Zbyo(this.ZK, this.Zl.ZW());
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    Zk1e zk1e;
    null = paramArrayOfbyte1;
    String str = this.ZK.ZWP();
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    if (str != null && str.length() > 0) {
      zk1e = this.Zl.Zw(str);
      if (zk1e == null) {
        Zskh zskh = this.Zl.Zd();
        Zmgc.EXTENSION_PAYLOAD_PROCESSOR_NOT_LOADED.ZK(zskh, new Object[] { str });
        return (arrayOfZbqc != null) ? zk1e.Zl(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3) : null;
      } 
    } else {
      return null;
    } 
    return zk1e.Zl(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */