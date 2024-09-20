package burp;

public class Zzk implements Zbu2 {
  private final Zeun ZL = new Zeun();
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    String[] arrayOfString = Zeun.ZG();
    int i = paramZs68.Zd();
    while (i < paramZs68.Zs) {
      if (Zy(paramArrayOfbyte[i])) {
        this.ZL.ZM.update(paramArrayOfbyte, paramZs68.Zd(), i - paramZs68.Zd());
        return;
      } 
      i++;
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    this.ZL.ZM.update(paramArrayOfbyte, paramZs68.Zd(), paramZs68.Zs - paramZs68.Zd());
  }
  
  private boolean Zy(byte paramByte) {
    return (paramByte <= 32);
  }
  
  public void ZB(Zt82 paramZt82) {
    this.ZL.Zv(paramZt82, ZV());
  }
  
  public Zlug ZV() {
    return Zlug.INITIAL_CONTENT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */