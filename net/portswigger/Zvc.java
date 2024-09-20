package net.portswigger;

import java.io.IOException;

public class Zvc {
  public final String Zd;
  
  private final byte[] Zu;
  
  private final boolean ZE;
  
  private final boolean Zj;
  
  final Zo8 ZN;
  
  private Zvc(Zo8 paramZo8, byte[] paramArrayOfbyte, boolean paramBoolean1, String paramString, boolean paramBoolean2) {
    this.Zu = paramArrayOfbyte;
    this.ZE = paramBoolean1;
    this.Zd = paramString;
    this.Zj = paramBoolean2;
  }
  
  public Zti ZW(int paramInt) throws IOException {
    Zti zti = this.ZN.ZG.ZQ(this.ZN.ZK, this.Zu, this.ZE, paramInt, this.Zj, false);
    try {
      if (this.ZN.Zt != null)
        this.ZN.Zt.accept(zti); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zti;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvc.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */