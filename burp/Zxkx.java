package burp;

import net.portswigger.Zli;

abstract class Zxkx implements Zlf8 {
  private byte[] ZK;
  
  public synchronized byte[] ZO(boolean paramBoolean) {
    synchronized (this) {
      byte[] arrayOfByte = ZP();
      if (arrayOfByte == null)
        return null; 
      if (paramBoolean && this.ZK != null && 0 == Zli.Zf(arrayOfByte, this.ZK, false))
        return ZO(paramBoolean); 
      this.ZK = arrayOfByte;
      return arrayOfByte;
    } 
  }
  
  protected abstract byte[] ZP();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */