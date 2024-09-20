package burp;

public class Zrqb {
  static byte[][][] Zd(Zxph paramZxph) {
    int i = paramZxph.Zxp();
    byte[][][] arrayOfByte = new byte[i][][];
    Zbqc[] arrayOfZbqc = Zsi_.ZE();
    byte b = 0;
    while (b < i) {
      Zm8f zm8f = paramZxph.Zo(Short.valueOf((short)b));
      (new byte[3][])[0] = zm8f.ZoI();
      (new byte[3][])[1] = zm8f.Zo5();
      (new byte[3][])[2] = zm8f.Zom();
      arrayOfByte[b] = (zm8f == null) ? null : new byte[3][];
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */