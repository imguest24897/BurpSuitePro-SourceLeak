package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zli;

class Zlqs extends ArrayList<Zez3> {
  private final Zmr ZC;
  
  private final Zbnt Zr;
  
  private static final String a;
  
  Zlqs(Zmr paramZmr, Zbnt paramZbnt) {
    this.ZC = paramZmr;
    this.Zr = paramZbnt;
  }
  
  Zez3 Za(Zez3 paramZez3) {
    Zstu zstu = paramZez3.Zos();
    Zz1p zz1p = null;
    for (Zez3 zez3 : this) {
      Zstu zstu1 = zez3.Zos();
      if (zstu1 == null || zez3.ZoO() == null)
        continue; 
      Zz1p zz1p1 = null;
      if (!Ze(zez3.Zod(), paramZez3.Zod()) || (this.ZC.Zp && Zn(zez3) != Zn(paramZez3)))
        continue; 
      if (!this.ZC.Zq) {
        if (0 != Zli.Zf(zez3.ZlL().Zd4(), paramZez3.ZlL().Zd4(), true))
          continue; 
      } else if (!this.ZC.Zm && !this.ZC.Zg) {
        if (0 != Zli.Zf(zez3.ZlL().ZdH(), paramZez3.ZlL().ZdH(), true))
          continue; 
      } else {
        if (0 != Zli.Zf(zez3.ZlL().Zd4(), paramZez3.ZlL().Zd4(), true))
          continue; 
        if (zz1p1 == null)
          zz1p1 = Zghc.ZY(null, zstu1, (byte)2, this.Zr); 
        if (zz1p == null)
          zz1p = Zghc.ZY(null, zstu, (byte)2, this.Zr); 
        if (!ZH(true, zz1p1.ZV, zz1p.ZV, this.ZC.Zm, this.ZC.Zg, this.ZC.ZG))
          continue; 
      } 
      if (this.ZC.ZM)
        if (this.ZC.ZC || this.ZC.Zr) {
          if (zz1p1 == null)
            zz1p1 = Zghc.ZY(null, zstu1, (byte)2, this.Zr); 
          if (zz1p == null)
            zz1p = Zghc.ZY(null, zstu, (byte)2, this.Zr); 
          if (!ZH(false, zz1p1.ZV, zz1p.ZV, this.ZC.ZC, this.ZC.Zr, this.ZC.ZZ))
            continue; 
        } else {
          int i = (zz1p1 == null) ? Zgyj.Zg(zstu1) : zz1p1.ZO();
          int j = (zz1p == null) ? Zgyj.Zg(zstu) : zz1p.ZO();
          if (!Zlt_.ZC(zstu1, i, zstu1.Zpu(), zstu, j, zstu.Zpu()))
            continue; 
        }  
      if (this.ZC.ZW) {
        if (zz1p1 == null)
          zz1p1 = Zghc.ZY(null, zstu1, (byte)2, this.Zr); 
        if (zz1p == null)
          zz1p = Zghc.ZY(null, zstu, (byte)2, this.Zr); 
        if (!ZJ(zz1p1.ZG(), zz1p.ZG(), this.ZC.ZB, this.ZC.ZN))
          continue; 
      } 
      return zez3;
    } 
    return null;
  }
  
  private boolean Ze(Zmzk paramZmzk1, Zmzk paramZmzk2) {
    return (paramZmzk1 == null || paramZmzk2 == null) ? ((paramZmzk1 == null && paramZmzk2 == null)) : paramZmzk1.equals(paramZmzk2);
  }
  
  private boolean Zn(Zez3 paramZez3) {
    Zrf_ zrf_ = (new Zb4h(paramZez3)).ZU();
    return a.equalsIgnoreCase(zrf_.Z_O());
  }
  
  private boolean ZH(boolean paramBoolean1, List<Zt8g> paramList1, List<Zt8g> paramList2, boolean paramBoolean2, boolean paramBoolean3, List<String> paramList) {
    return (ZP(paramBoolean1, paramList1, paramList2, paramBoolean2, paramBoolean3, paramList) && ZP(paramBoolean1, paramList2, paramList1, paramBoolean2, paramBoolean3, paramList));
  }
  
  private boolean ZP(boolean paramBoolean1, List<Zt8g> paramList1, List<Zt8g> paramList2, boolean paramBoolean2, boolean paramBoolean3, List<String> paramList) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    label36: for (Zt8g zt8g : paramList1) {
      if (paramBoolean1 ? !zt8g.Zbf() : !zt8g.ZbD())
        continue; 
      if (paramBoolean3) {
        Iterator<String> iterator = paramList.iterator();
        while (iterator.hasNext()) {
          if (((String)iterator.next()).equalsIgnoreCase(zt8g.Zns()))
            continue label36; 
        } 
      } 
      for (Zt8g zt8g1 : paramList2) {
        if (paramBoolean1 ? !zt8g1.Zbf() : !zt8g1.ZbD())
          continue; 
        if (paramBoolean2) {
          if (zt8g.Zns().equalsIgnoreCase(zt8g1.Zns()))
            continue label36; 
        } else if (zt8g.Zns().equalsIgnoreCase(zt8g1.Zns()) && zt8g.Zbn().equalsIgnoreCase(zt8g1.Zbn())) {
          continue label36;
        } 
        if (arrayOfZbqc != null)
          break; 
      } 
      return false;
    } 
    return true;
  }
  
  private boolean ZJ(List<String> paramList1, List<String> paramList2, boolean paramBoolean, List<String> paramList3) {
    return (ZG(paramList1, paramList2, paramBoolean, paramList3) && ZG(paramList2, paramList1, paramBoolean, paramList3));
  }
  
  private boolean ZG(List<String> paramList1, List<String> paramList2, boolean paramBoolean, List<String> paramList3) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    Iterator<String> iterator = paramList1.iterator();
    if (iterator.hasNext())
      iterator.next(); 
    label29: while (iterator.hasNext()) {
      String str = iterator.next();
      if (paramBoolean)
        for (String str1 : paramList3) {
          if (str.length() > str1.length() && str.substring(0, str1.length()).equalsIgnoreCase(str1) && str.charAt(str1.length()) == ':')
            continue label29; 
          if (arrayOfZbqc != null)
            break; 
        }  
      Iterator<String> iterator1 = paramList2.iterator();
      if (iterator1.hasNext())
        iterator1.next(); 
      while (iterator1.hasNext()) {
        String str1 = iterator1.next();
        if (str.equalsIgnoreCase(str1))
          continue label29; 
        if (arrayOfZbqc != null)
          break; 
      } 
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc 'Ea-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlqs.a : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #98
    //   87: goto -> 112
    //   90: bipush #90
    //   92: goto -> 112
    //   95: bipush #17
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #115
    //   107: goto -> 112
    //   110: bipush #56
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */