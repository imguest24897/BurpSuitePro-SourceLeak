package burp;

public class Zeen implements Zmgx {
  private final Zmgx[] Zz;
  
  private final Zgfe ZT;
  
  Zeen(Zgfe paramZgfe, Zmgx... paramVarArgs) {
    this.ZT = paramZgfe;
    this.Zz = paramVarArgs;
  }
  
  public void ZM(byte paramByte) {
    boolean bool = Zs6l.Zu();
    Zsjk zsjk = (paramByte == 0) ? Zsjk.REPLACE : Zsjk.APPEND;
    if (this.ZT.ZQ(zsjk)) {
      Zmgx[] arrayOfZmgx = this.Zz;
      int i = arrayOfZmgx.length;
      byte b = 0;
      while (b < i) {
        Zmgx zmgx = arrayOfZmgx[b];
        zmgx.ZM(paramByte);
        b++;
        if (!bool)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */