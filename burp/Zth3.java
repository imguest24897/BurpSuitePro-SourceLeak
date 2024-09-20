package burp;

import java.text.NumberFormat;

public class Zth3 {
  private static int ZB;
  
  static void ZP(NumberFormat paramNumberFormat, Zl_n paramZl_n, Zr_4 paramZr_4) {
    int i = ZU();
    if (paramNumberFormat == null) {
      paramZl_n.ZXg();
      if (i != 0) {
        Zxck zxck1 = Zb6j.Ze(paramNumberFormat.getCurrency(), paramZr_4);
        paramZl_n.ZY(zxck1);
        paramZl_n.ZHY(paramNumberFormat.getMaximumFractionDigits());
        paramZl_n.ZHS(paramNumberFormat.getMaximumIntegerDigits());
        paramZl_n.ZHf(paramNumberFormat.getMinimumFractionDigits());
        paramZl_n.ZHK(paramNumberFormat.getMinimumIntegerDigits());
        paramZl_n.Zi(paramNumberFormat.getRoundingMode());
        paramZl_n.Zw(paramNumberFormat.isGroupingUsed());
        paramZl_n.ZP(paramNumberFormat.isParseIntegerOnly());
        return;
      } 
      return;
    } 
    Zxck zxck = Zb6j.Ze(paramNumberFormat.getCurrency(), paramZr_4);
    paramZl_n.ZY(zxck);
    paramZl_n.ZHY(paramNumberFormat.getMaximumFractionDigits());
    paramZl_n.ZHS(paramNumberFormat.getMaximumIntegerDigits());
    paramZl_n.ZHf(paramNumberFormat.getMinimumFractionDigits());
    paramZl_n.ZHK(paramNumberFormat.getMinimumIntegerDigits());
    paramZl_n.Zi(paramNumberFormat.getRoundingMode());
    paramZl_n.Zw(paramNumberFormat.isGroupingUsed());
    paramZl_n.ZP(paramNumberFormat.isParseIntegerOnly());
  }
  
  static NumberFormat Zo(Zl_n paramZl_n) {
    if (paramZl_n.ZXd())
      return null; 
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setCurrency(paramZl_n.ZXQ().ZrH());
    numberFormat.setGroupingUsed(paramZl_n.ZX1());
    numberFormat.setParseIntegerOnly(paramZl_n.ZXu());
    numberFormat.setMaximumFractionDigits(paramZl_n.ZX3());
    numberFormat.setMaximumIntegerDigits(paramZl_n.ZXH());
    numberFormat.setMinimumFractionDigits(paramZl_n.ZXT());
    numberFormat.setMinimumIntegerDigits(paramZl_n.ZXA());
    numberFormat.setRoundingMode(paramZl_n.ZXK());
    return numberFormat;
  }
  
  static void ZY(Zl_n paramZl_n) {
    paramZl_n.ZY(null);
    paramZl_n.ZHY(-2147483648);
    paramZl_n.ZHS(-2147483648);
    int i = ZK();
    paramZl_n.ZHf(-2147483648);
    paramZl_n.ZHK(-2147483648);
    paramZl_n.Zw(false);
    paramZl_n.ZP(false);
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  static boolean ZT(Zl_n paramZl_n) {
    return (paramZl_n.ZXQ() == null && !paramZl_n.ZX1() && !paramZl_n.ZXu() && paramZl_n.ZX3() == Integer.MIN_VALUE && paramZl_n.ZXH() == Integer.MIN_VALUE && paramZl_n.ZXT() == Integer.MIN_VALUE && paramZl_n.ZXA() == Integer.MIN_VALUE);
  }
  
  public static void Zd(int paramInt) {
    ZB = paramInt;
  }
  
  public static int ZK() {
    return ZB;
  }
  
  public static int ZU() {
    int i = ZK();
    return (i == 0) ? 8 : 0;
  }
  
  static {
    if (ZK() == 0)
      Zd(117); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */