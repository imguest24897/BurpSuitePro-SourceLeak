package burp;

import net.portswigger.Zm2;

class Zt9e implements Ztw {
  private final Zkr4 ZQ;
  
  Zt9e(Zkr4 paramZkr4) {
    this.ZQ = paramZkr4;
  }
  
  public void ZW(Zstu paramZstu) {
    Zu(paramZstu, true);
  }
  
  public void Zu(Zstu paramZstu, boolean paramBoolean) {
    if (paramZstu == null)
      return; 
    Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_TO_DECODER);
    byte[] arrayOfByte = paramZstu.ZiD();
    if (arrayOfByte.length > 10000) {
      byte[] arrayOfByte1 = new byte[10000];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, 10000);
      arrayOfByte = arrayOfByte1;
    } 
    this.ZQ.ZA().Zs(arrayOfByte);
    if (this.ZQ.ZA().Ze())
      this.ZQ.ZYW().validate(); 
    this.ZQ.ZD(-1, paramBoolean, true, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */