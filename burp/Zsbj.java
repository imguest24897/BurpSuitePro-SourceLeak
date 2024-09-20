package burp;

import java.util.List;

public class Zsbj {
  public static int Za(byte[] paramArrayOfbyte) {
    return Zgyj.Zi(Zyf.Zy(paramArrayOfbyte));
  }
  
  public static int Zc(byte[] paramArrayOfbyte) {
    return Zgyj.Zg(Zyf.Zy(paramArrayOfbyte));
  }
  
  public static int ZB(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    return Zgyj.Zj(Zyf.Zy(paramArrayOfbyte), paramInt, paramBoolean);
  }
  
  public static byte[] Zi(byte[] paramArrayOfbyte, String paramString) {
    Zstu zstu = Zgyj.ZQ(Zyf.Zy(paramArrayOfbyte), paramString);
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public static List<String> ZD(byte[] paramArrayOfbyte) {
    return Zgyj.ZI(Zyf.Zy(paramArrayOfbyte));
  }
  
  public static List<String> Zh(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Zgyj.ZQ(Zyf.Zy(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  public static List<String> ZQ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, List<Integer> paramList) {
    return Zgyj.ZZ(Zyf.Zy(paramArrayOfbyte), paramInt1, paramInt2, paramList);
  }
  
  public static String ZT(byte[] paramArrayOfbyte, String paramString, boolean paramBoolean) {
    return Zgyj.ZZ(ZD(paramArrayOfbyte), paramString, paramBoolean);
  }
  
  public static List<String> Zi(byte[] paramArrayOfbyte, String paramString, boolean paramBoolean) {
    return Zgyj.ZN(ZD(paramArrayOfbyte), paramString, paramBoolean);
  }
  
  public static byte[] Zd(byte[] paramArrayOfbyte, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3) {
    Zstu zstu = Zgyj.Zh(Zyf.Zy(paramArrayOfbyte), paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3);
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public static byte[] ZQ(byte[] paramArrayOfbyte) {
    Zstu zstu = Zgyj.Ze(Zyf.Zy(paramArrayOfbyte));
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public static byte[] Zi(byte[] paramArrayOfbyte) {
    Zstu zstu = Zgyj.ZC(Zyf.Zy(paramArrayOfbyte));
    return (zstu == null) ? null : zstu.ZiD();
  }
  
  public static byte[] Z_(byte[] paramArrayOfbyte, String paramString) {
    Zyf zyf = Zyf.Zy(paramArrayOfbyte);
    Zstu zstu = Zgyj.Zp(zyf, paramString);
    return (zstu == null) ? null : zstu.ZiD();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */