package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgky {
  private static String[] ZA;
  
  public static Zx0o Za(Zmzk paramZmzk, String paramString, byte paramByte, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramByte != 0)
      hashMap.put(Long.valueOf(Ztz3.DB_TYPE.permanentIndex), Byte.toString(paramByte)); 
    Zei8<?> zei8 = paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), paramList1, paramList2);
    ArrayList<Zlfv<? extends Zgkc>> arrayList = new ArrayList(Collections.singletonList(new Zt27((Zei8)zei8, paramLong1, paramLong2)));
    return new Zx0o(paramZlvf.<Zvs>Za(Zzu2.SQL_INJECTION, Zzu2.SQL_INJECTION_2ND_ORDER), 0, (Map)hashMap, arrayList, (byte)2, (byte)4, paramZmzk, zei8.Zp(paramString), paramZxs7);
  }
  
  public static Zx_5 ZK(Zmzk paramZmzk, String paramString, byte paramByte1, Zxs7 paramZxs7, byte paramByte2, int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zvow paramZvow, List<Zsjh<?>> paramList) {
    String[] arrayOfString = Zm();
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramByte1 != 0)
      hashMap.put(Long.valueOf(Ztz3.DB_TYPE.permanentIndex), Byte.toString(paramByte1)); 
    hashMap.put(Long.valueOf(Ztz3.OUT_BAND_ENTITY_NAME.permanentIndex), Zkb.ZG(paramArrayOfbyte2));
    hashMap.put(Long.valueOf(Ztz3.OUT_BAND_VARIANT.permanentIndex), Byte.toString(paramByte2));
    if (Zbqc.Zwu() == null)
      Zl(new String[4]); 
    return new Zx_5(Zzu2.SQL_INJECTION, (byte)-1, 0, (Map)hashMap, new ArrayList<>(Collections.singletonList(new Zt69(new Zz25(paramArrayOfbyte1, paramInt), paramZvow, paramList))), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 Zx(Zmzk paramZmzk, String paramString, byte paramByte, Zxs7 paramZxs7, byte[] paramArrayOfbyte, Zm1m paramZm1m) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramByte != 0)
      hashMap.put(Long.valueOf(Ztz3.DB_TYPE.permanentIndex), Byte.toString(paramByte)); 
    hashMap.put(Long.valueOf(Ztz3.OUT_BAND_ENTITY_NAME.permanentIndex), Zkb.ZG(paramArrayOfbyte));
    return new Zx_5(Zzu2.SQL_INJECTION_2ND_ORDER, (byte)-1, 0, (Map)hashMap, new ArrayList<>(Collections.singletonList(paramZm1m)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 Zr(Zmzk paramZmzk, String paramString, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2, Zxs7 paramZxs7, byte[] paramArrayOfbyte, Zlvf paramZlvf, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramByte2 != 0)
      hashMap.put(Long.valueOf(Ztz3.DB_TYPE.permanentIndex), Byte.toString(paramByte2)); 
    return new Zx_5(paramZlvf.<Zvs>Za(Zzu2.SQL_INJECTION, Zzu2.SQL_INJECTION_2ND_ORDER), (byte)-1, paramInt2, (Map)hashMap, new ArrayList<>((Collection)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, paramInt1), paramList1, paramList2))), paramByte1, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static Zx_5 Zl(Zmzk paramZmzk, String paramString, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zlvf paramZlvf1, Zlvf paramZlvf2, List<Zl1r> paramList1, List<Zl1r> paramList2, List<Zl1r> paramList3, List<Zl1r> paramList4) {
    String[] arrayOfString = Zm();
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramByte1 != 0)
      hashMap.put(Long.valueOf(Ztz3.DB_TYPE.permanentIndex), Byte.toString(paramByte1)); 
    Zei8<?> zei8 = paramZlvf1.Zq(new Zz25(paramArrayOfbyte1, paramInt1), paramList1, paramList2);
    ArrayList<Zlfv<? extends Zgkc>> arrayList = new ArrayList(Collections.singletonList(Zl2v.Zp((Zei8)zei8, (Zei8)paramZlvf2.Zq(new Zz25(paramArrayOfbyte2, 0), paramList3, paramList4))));
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(paramZlvf1.<Zvs>Za(Zzu2.SQL_INJECTION, Zzu2.SQL_INJECTION_2ND_ORDER), (byte)-1, paramInt2, (Map)hashMap, arrayList, paramByte2, (byte)4, paramZmzk, zei8.Zp(paramString), paramZxs7);
  }
  
  public static int ZQ(Zlp9 paramZlp9) {
    switch (Zsg1.ZB[paramZlp9.ordinal()]) {
      case 1:
      case 2:
      
      case 3:
      case 4:
      
      case 5:
      case 6:
      case 7:
      
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      
    } 
    Zuh.Zv(false, Zqf.Zr, paramZlp9.Zz());
    return 2048;
  }
  
  public static byte ZB(Zlp9 paramZlp9) {
    switch (Zsg1.ZB[paramZlp9.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      
      case 5:
      case 6:
      case 7:
      
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      
    } 
    Zuh.Zv(false, Zqf.Zr, paramZlp9.Zz());
    return 0;
  }
  
  public static int Zy(byte paramByte, Ztlj paramZtlj) {
    return Zh(paramByte) | Zp(paramZtlj);
  }
  
  private static int Zp(Ztlj paramZtlj) {
    switch (paramZtlj.Zq(Ztz3.OUT_BAND_VARIANT)) {
      case 0:
      
      case 1:
      
      case 2:
      
      case 3:
      
    } 
    return 0;
  }
  
  private static int Zh(byte paramByte) {
    switch (paramByte) {
      case 0:
      
      case 2:
      
      case 3:
      
      case 5:
      
      case 6:
      
    } 
    return 0;
  }
  
  public static void Zl(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zm() {
    return ZA;
  }
  
  static {
    if (Zm() == null)
      Zl(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgky.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */