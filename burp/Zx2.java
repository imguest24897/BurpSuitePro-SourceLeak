package burp;

class Zx2 {
  static boolean Z_(Zsdr paramZsdr, Zg49<Zsdr> paramZg49) {
    if (!paramZg49.ZH(paramZsdr))
      return false; 
    Zz65 zz65 = Zz65.Zn(paramZg49.Zx(paramZsdr).byteValue());
    return (zz65 == Zz65.TESTED_AUTH || zz65 == Zz65.TESTED_BOTH);
  }
  
  static boolean ZX(Zsdr paramZsdr, Zg49<Zsdr> paramZg49) {
    if (!paramZg49.ZH(paramZsdr))
      return false; 
    Zz65 zz65 = Zz65.Zn(paramZg49.Zx(paramZsdr).byteValue());
    return (zz65 == Zz65.TESTED_UNAUTH || zz65 == Zz65.TESTED_BOTH);
  }
  
  static void ZW(Zsdr paramZsdr, Zg49<Zsdr> paramZg49) {
    // Byte code:
    //   0: invokestatic ZZ : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: invokeinterface ZH : (Ljava/lang/Object;)Z
    //   11: ifne -> 20
    //   14: getstatic burp/Zz65.NOT_TESTED : Lburp/Zz65;
    //   17: goto -> 33
    //   20: aload_1
    //   21: aload_0
    //   22: invokeinterface Zx : (Ljava/lang/Object;)Ljava/lang/Byte;
    //   27: invokevirtual byteValue : ()B
    //   30: invokestatic Zn : (B)Lburp/Zz65;
    //   33: astore_3
    //   34: aload_3
    //   35: getstatic burp/Zz65.NOT_TESTED : Lburp/Zz65;
    //   38: if_acmpne -> 59
    //   41: aload_1
    //   42: aload_0
    //   43: getstatic burp/Zz65.TESTED_AUTH : Lburp/Zz65;
    //   46: invokevirtual ZL : ()B
    //   49: invokeinterface ZS : (Lburp/Zgpi;B)Ljava/lang/Byte;
    //   54: pop
    //   55: aload_2
    //   56: ifnonnull -> 80
    //   59: aload_3
    //   60: getstatic burp/Zz65.TESTED_UNAUTH : Lburp/Zz65;
    //   63: if_acmpne -> 80
    //   66: aload_1
    //   67: aload_0
    //   68: getstatic burp/Zz65.TESTED_BOTH : Lburp/Zz65;
    //   71: invokevirtual ZL : ()B
    //   74: invokeinterface ZS : (Lburp/Zgpi;B)Ljava/lang/Byte;
    //   79: pop
    //   80: invokestatic Zwu : ()[Lburp/Zbqc;
    //   83: ifnonnull -> 92
    //   86: iconst_5
    //   87: newarray int
    //   89: invokestatic ZS : ([I)V
    //   92: return
  }
  
  static void ZL(Zsdr paramZsdr, Zg49<Zsdr> paramZg49) {
    int[] arrayOfInt = Zzb5.ZZ();
    Zz65 zz65 = !paramZg49.ZH(paramZsdr) ? Zz65.NOT_TESTED : Zz65.Zn(paramZg49.Zx(paramZsdr).byteValue());
    if (zz65 == Zz65.NOT_TESTED) {
      paramZg49.ZS(paramZsdr, Zz65.TESTED_UNAUTH.ZL());
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[4]);
      } else {
        return;
      } 
    } 
    if (zz65 == Zz65.TESTED_AUTH)
      paramZg49.ZS(paramZsdr, Zz65.TESTED_BOTH.ZL()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */