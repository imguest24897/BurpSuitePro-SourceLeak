package burp;

public class Zdr {
  private static Zbqc[] ZV;
  
  public static boolean Zq(Zmyi paramZmyi1, Zmyi paramZmyi2) {
    int i = paramZmyi1.Zpu();
    Zbqc[] arrayOfZbqc = ZH();
    if (i != paramZmyi2.Zpu())
      return false; 
    byte b = 0;
    while (b < i) {
      if (paramZmyi1.ZN(b) != paramZmyi2.ZN(b))
        return false; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return true;
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    ZV = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZH() {
    return ZV;
  }
  
  static {
    if (ZH() == null)
      ZN(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */