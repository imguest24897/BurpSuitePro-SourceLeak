package com.fasterxml.Zo3;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;
import java.io.IOException;

public abstract class Zo extends Za {
  protected final Zz Zw;
  
  protected final com.fasterxml.Zor.Zo ZT;
  
  private static String[] Zp;
  
  protected Zo(Zz paramZz, com.fasterxml.Zor.Zo paramZo) {
    this.Zw = paramZz;
    this.ZT = paramZo;
  }
  
  public abstract Zyc ZU();
  
  public String Zw() {
    return null;
  }
  
  public Zn ZA(Zf paramZf, Zn paramZn) throws IOException {
    try {
      ZI(paramZn);
      if (paramZn.ZM == null)
        return null; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return paramZf.ZI(paramZn);
  }
  
  public Zn ZP(Zf paramZf, Zn paramZn) throws IOException {
    try {
      if (paramZn == null)
        return null; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    return paramZf.ZJ(paramZn);
  }
  
  protected void ZI(Zn paramZn) {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: getfield ZM : Ljava/lang/Object;
    //   7: astore_3
    //   8: astore_2
    //   9: aload_3
    //   10: ifnonnull -> 55
    //   13: aload_1
    //   14: getfield ZB : Ljava/lang/Object;
    //   17: astore #4
    //   19: aload_1
    //   20: getfield Zh : Ljava/lang/Class;
    //   23: astore #5
    //   25: aload #5
    //   27: ifnonnull -> 41
    //   30: aload_0
    //   31: aload #4
    //   33: invokevirtual Zn : (Ljava/lang/Object;)Ljava/lang/String;
    //   36: astore_3
    //   37: aload_2
    //   38: ifnull -> 50
    //   41: aload_0
    //   42: aload #4
    //   44: aload #5
    //   46: invokevirtual ZJ : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;
    //   49: astore_3
    //   50: aload_1
    //   51: aload_3
    //   52: putfield ZM : Ljava/lang/Object;
    //   55: return
  }
  
  protected String Zn(Object paramObject) {
    String str = this.Zw.Zb(paramObject);
    if (str == null)
      Zc(paramObject); 
    return str;
  }
  
  protected String ZJ(Object paramObject, Class<?> paramClass) {
    String str = this.Zw.Zn(paramObject, paramClass);
    if (str == null)
      Zc(paramObject); 
    return str;
  }
  
  protected void Zc(Object paramObject) {}
  
  public static void ZH(String[] paramArrayOfString) {
    Zp = paramArrayOfString;
  }
  
  public static String[] Zs() {
    return Zp;
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (Zs() != null)
      ZH(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */