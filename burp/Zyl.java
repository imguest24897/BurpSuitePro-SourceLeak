package burp;

public class Zyl extends Zni implements Ze4r {
  private final char[] ZB;
  
  private static String Zv;
  
  Zyl(int paramInt) {
    this(new char[paramInt]);
  }
  
  private Zyl(char[] paramArrayOfchar) {
    this.ZB = paramArrayOfchar;
  }
  
  public static Zyl Zf(char[] paramArrayOfchar) {
    try {
      if (paramArrayOfchar == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zyl(paramArrayOfchar);
  }
  
  public void Zb(char[] paramArrayOfchar, int paramInt) {
    Ze(0, paramArrayOfchar, paramInt, this.ZB.length);
  }
  
  public void Ze(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) {
    System.arraycopy(this.ZB, paramInt1, paramArrayOfchar, paramInt2, paramInt3);
  }
  
  public Ze4r Z_(char[] paramArrayOfchar) {
    String str = ZKR();
    try {
      if (paramArrayOfchar.length != this.ZB.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      System.arraycopy(paramArrayOfchar, 0, this.ZB, 0, this.ZB.length);
      if (Zbqc.Zwu() == null)
        Ze("javtGb"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this;
  }
  
  public Ze4r ZL(char[] paramArrayOfchar, int paramInt) {
    return ZH(0, paramArrayOfchar, paramInt, this.ZB.length);
  }
  
  public Ze4r ZH(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) {
    System.arraycopy(paramArrayOfchar, paramInt2, this.ZB, paramInt1, paramInt3);
    return this;
  }
  
  public char ZY(int paramInt) {
    return this.ZB[paramInt];
  }
  
  public void ZB(int paramInt, char paramChar) {
    this.ZB[paramInt] = paramChar;
  }
  
  public int Zpu() {
    return this.ZB.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZP(this);
  }
  
  public String toString() {
    return new String(this.ZB);
  }
  
  public Zllg<Ze4r> ZK0() {
    return Ze4r.ZK;
  }
  
  public static void Ze(String paramString) {
    Zv = paramString;
  }
  
  public static String ZKR() {
    return Zv;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (ZKR() != null)
      Ze("IOatSb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */