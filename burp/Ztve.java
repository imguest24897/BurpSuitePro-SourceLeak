package burp;

import java.util.List;
import java.util.stream.Collectors;

class Ztve implements Zgkx {
  private final Ztz9 Z_;
  
  private final Ztp8 ZD;
  
  private final Zb0h ZI;
  
  private static final String c;
  
  Ztve(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h) {
    this.Z_ = paramZtz9;
    this.ZD = paramZtp8;
    this.ZI = paramZb0h;
  }
  
  public List<Zb6u> ZN() {
    return (List<Zb6u>)this.ZD.get().Zy().stream().map(Zevy::Zc).collect(Collectors.toList());
  }
  
  public boolean ZS() {
    return this.ZD.get().ZD();
  }
  
  public void ZD(int paramInt) {
    this.Z_.ZP(paramInt);
  }
  
  public void ZT(String paramString1, String paramString2) {
    this.ZD.get().Zo(paramString1, Zeup.COOKIE.initialTranscoder.ZI(paramString2));
    this.Z_.ZS();
  }
  
  public void Zl(List<Integer> paramList) {
    this.ZD.get().ZQ(paramList);
    this.Z_.ZS();
  }
  
  public void ZY(int paramInt) {
    this.ZD.get().Zu(paramInt);
    this.Z_.ZS();
  }
  
  public void ZO(int paramInt) {
    this.ZD.get().ZP(paramInt);
    this.Z_.ZS();
  }
  
  public void ZH(int paramInt1, int paramInt2) {
    Zevy zevy = this.ZD.get().Zy().get(paramInt1);
    this.ZI.ZR((paramInt2 == 0) ? zevy.Zp() : zevy.ZP());
  }
  
  public void Za(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    int[] arrayOfInt = Zmgw.Ze();
    while (b < paramList.size()) {
      int i = ((Integer)paramList.get(b)).intValue();
      Zevy zevy = this.ZD.get().Zy().get(i);
      stringBuilder.append(zevy.Zp());
      stringBuilder.append('=');
      stringBuilder.append(zevy.ZP());
      if (b < paramList.size() - 1)
        stringBuilder.append(c); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (stringBuilder.length() > 0)
      this.ZI.ZR(stringBuilder.toString()); 
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc '"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztve.c : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #76
    //   82: goto -> 112
    //   85: bipush #106
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #9
    //   102: goto -> 112
    //   105: bipush #78
    //   107: goto -> 112
    //   110: bipush #89
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztve.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */