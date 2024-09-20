package burp;

public class Zl19 {
  public static boolean Zb(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcm;
  }
  
  public static boolean ZG(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgc7;
  }
  
  public static boolean ZF(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgc1;
  }
  
  public static boolean Ze(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcp;
  }
  
  public static boolean Zo(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgch;
  }
  
  public static boolean Zk(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcv;
  }
  
  public static boolean ZO(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcd;
  }
  
  public static boolean ZC(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcc;
  }
  
  public static boolean ZR(Zesp paramZesp) {
    return paramZesp instanceof Zgc0;
  }
  
  public static boolean ZZ(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgc9;
  }
  
  public static boolean Zc(Zesp paramZesp) {
    return paramZesp instanceof Zgcw;
  }
  
  public static boolean ZM(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcu;
  }
  
  public static boolean ZO(Zesp paramZesp) {
    return paramZesp instanceof Ztyn;
  }
  
  public static boolean ZM(Zesp paramZesp) {
    return paramZesp instanceof Zb3t;
  }
  
  public static boolean ZB(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgce;
  }
  
  public static boolean ZI(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcb;
  }
  
  public static boolean ZD(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcs;
  }
  
  public static boolean Zi(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgc3;
  }
  
  public static boolean ZR(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgca;
  }
  
  public static boolean Zf(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgcn;
  }
  
  public static boolean Zw(Zb3t paramZb3t) {
    return paramZb3t instanceof Zgc_;
  }
  
  public static boolean Zp(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_IF);
  }
  
  public static boolean ZP(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_SWITCH);
  }
  
  public static boolean ZU(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_CASE);
  }
  
  public static boolean ZQ(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_DEFAULT);
  }
  
  public static boolean Zq(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_BREAK);
  }
  
  public static boolean Zs(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_CONTINUE);
  }
  
  public static boolean ZV(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_WHILE);
  }
  
  public static boolean ZL(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_DO);
  }
  
  public static boolean ZE(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_TRY);
  }
  
  public static boolean Zl(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_FINALLY);
  }
  
  public static boolean ZA(Zb3t paramZb3t) {
    return ZS(paramZb3t, Zgho.KEYWORD_CATCH);
  }
  
  private static boolean ZS(Zb3t paramZb3t, Zgho paramZgho) {
    return (ZB(paramZb3t) && ZN(paramZb3t, paramZgho));
  }
  
  public static boolean Zv(Zb3t paramZb3t) {
    return (ZV(paramZb3t) || Zo(paramZb3t) || ZL(paramZb3t));
  }
  
  public static boolean Zt(Zb3t paramZb3t) {
    return (Zv(paramZb3t) || ZP(paramZb3t));
  }
  
  public static boolean ZW(Zb3t paramZb3t) {
    return (Zv(paramZb3t) || ZP(paramZb3t) || Zp(paramZb3t));
  }
  
  public static boolean Zr(Zesp paramZesp) {
    if (!ZM(paramZesp))
      return false; 
    Zb3t zb3t = (Zb3t)paramZesp;
    return (ZR(zb3t) && zb3t.ZC().size() == 1 && ZM(zb3t.ZC().get(0)));
  }
  
  public static boolean ZZ(Zesp paramZesp) {
    if (!ZM(paramZesp))
      return false; 
    Zb3t zb3t = (Zb3t)paramZesp;
    return (ZR(zb3t) && zb3t.ZC().size() == 1 && ZZ(zb3t.ZC().get(0)));
  }
  
  private static boolean ZN(Zb3t paramZb3t, Zgho paramZgho) {
    return (paramZb3t.Zk() && ZC(paramZb3t.ZC().get(0)) && (((Zgcc)paramZb3t.ZC().get(0)).ZK()).ZE == paramZgho);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl19.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */