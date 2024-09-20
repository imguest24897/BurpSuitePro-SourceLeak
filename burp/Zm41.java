package burp;

public interface Zm41 extends Zk5_, Zmov, Zgdq {
  public static final byte[] ZI = new byte[0];
  
  Zl83 ZM();
  
  Ztng Zk();
  
  void Zz(Zxwh paramZxwh);
  
  void ZQ(Zxwh paramZxwh, int paramInt);
  
  Zxwh ZP(int paramInt);
  
  void Zs(int[] paramArrayOfint);
  
  void Zv(int paramInt);
  
  void ZU(int paramInt);
  
  int ZN();
  
  void ZN(byte[] paramArrayOfbyte);
  
  byte[] Zc();
  
  byte[][] Zm(Zm42 paramZm42, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  byte[][] ZL(Zm42 paramZm42, byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1);
  
  byte[] Zd(byte[] paramArrayOfbyte);
  
  default boolean Zw() {
    String[] arrayOfString = Zbb7.ZS();
    byte b = 0;
    while (b < ZN()) {
      Zxwh zxwh = ZP(b);
      if (zxwh.ZWy() && zxwh.ZWG() == Ze0f.REPLACE_PLACEHOLDER_COLLABORATOR_PAYLOAD)
        return true; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm41.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */