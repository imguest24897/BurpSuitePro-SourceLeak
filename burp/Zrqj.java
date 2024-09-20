package burp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zrqj {
  private final List<Zer7> ZK;
  
  private final Ze3n Zr;
  
  private final Zbnt Zc;
  
  private final Zsoh Zt;
  
  private final Ztpx Z_;
  
  private final Zz4_ ZB;
  
  private final String Zi;
  
  private final Predicate<Zzhh> Zo;
  
  private final BiFunction<String, String, byte[]> Ze;
  
  private final Function<String, byte[]> Zs;
  
  private final BiFunction<String, String, byte[]> ZW;
  
  private final byte Zq;
  
  private final Zzhh ZE;
  
  private final Zlit ZT;
  
  private Zs57 Za = new Zs57();
  
  private boolean ZP = false;
  
  private static boolean ZZ;
  
  Zrqj(byte paramByte, Function<Zlit, List<Zer7>> paramFunction, Ze3n paramZe3n, Zbnt paramZbnt, Zsoh paramZsoh, Ztpx paramZtpx, Zz4_ paramZz4_, Predicate<Zzhh> paramPredicate, BiFunction<String, String, byte[]> paramBiFunction1, Function<String, byte[]> paramFunction1, BiFunction<String, String, byte[]> paramBiFunction2) {
    this.Zq = paramByte;
    this.Zr = paramZe3n;
    this.Zc = paramZbnt;
    this.Zt = paramZsoh;
    boolean bool = Zj();
    try {
      this.Z_ = paramZtpx;
      this.ZB = paramZz4_;
      this.Zo = paramPredicate;
      this.Ze = paramBiFunction1;
      this.Zs = paramFunction1;
      this.ZW = paramBiFunction2;
      this.ZT = paramZe3n.ZA().ZF();
    } catch (Zsct zsct) {
      throw a(null);
    } 
    Zuh.Zb((this.ZT != null), Zqf.Zk);
    this.ZK = paramFunction.apply(this.ZT);
    byte[] arrayOfByte = this.ZT.Zd4();
    if (this.ZT.Zdw().endsWith("/")) {
      this.ZP = true;
      arrayOfByte = Arrays.copyOfRange(arrayOfByte, 0, arrayOfByte.length - 1);
    } 
    try {
      this.Zi = Zkb.ZG(arrayOfByte);
      this.ZE = Zzhh.Zd(this.Zi);
      if (bool)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zsct zsct) {
      throw a(null);
    } 
  }
  
  void ZO() {
    try {
      if (!this.ZE.Zt.isEmpty())
        try {
          if (this.Zo.test(this.ZE)) {
            this.ZK.stream().filter(this::lambda$findFiles$0).flatMap(Zrqj::lambda$findFiles$1).forEach(this::ZN);
            return;
          } 
          return;
        } catch (Zsct zsct) {
          throw a(null);
        }  
    } catch (Zsct zsct) {
      throw a(null);
    } 
  }
  
  private boolean ZN(String paramString) {
    Zs57 zs571 = new Zs57();
    Zs57 zs572 = new Zs57();
    byte[] arrayOfByte1 = this.Ze.apply(this.Zi, paramString);
    Zlit zlit = Zj(arrayOfByte1);
    boolean bool = ZZ();
    byte[] arrayOfByte2 = null;
    byte b = 0;
    while (b < 5) {
      zs571 = Zc(this.Z_, zs571, zlit);
      int i = zs571.Zb.Zo(Zlug.STATUS_CODE).ZN();
      try {
        if (i >= 400)
          return false; 
      } catch (Zsct zsct) {
        throw a(null);
      } 
      try {
        if (!Zs57.Zb(zs571, this.Za)) {
          try {
            if (Zs57.Zb(zs571, zs572))
              return false; 
          } catch (Zsct zsct) {
            throw a(null);
          } 
        } else {
          return false;
        } 
      } catch (Zsct zsct) {
        throw a(null);
      } 
      Zlit zlit1 = Zj(this.Zs.apply(this.Zi));
      try {
        this.Za = Zc(this.Z_, this.Za, zlit1);
        if (Zs57.Zb(zs571, this.Za))
          return false; 
      } catch (Zsct zsct) {
        throw a(null);
      } 
      arrayOfByte2 = this.ZW.apply(this.Zi, paramString);
      Zlit zlit2 = Zj(arrayOfByte2);
      zs572 = Zc(this.Z_, zs572, zlit2);
      try {
        if (!Zf(zs572))
          try {
            if (!Zs57.Zb(zs571, zs572)) {
              b++;
              if (!bool)
                break; 
              continue;
            } 
            return false;
          } catch (Zsct zsct) {
            throw a(null);
          }  
      } catch (Zsct zsct) {
        throw a(null);
      } 
      return false;
    } 
    try {
    
    } catch (Zsct zsct) {
      throw a(null);
    } 
    Zuh.Zb((arrayOfByte2 != null), Zqf.Zr);
    Zkvd zkvd = Zkti.Zf(this.Zc, zs571, zs572);
    this.ZB.Zz(Zkti.ZV(this.Zi, this.ZP, this.Zq, arrayOfByte1, arrayOfByte2, paramString, this.Zr.Za(), Zkti.ZR(this.Zr.ZI(), zs571, arrayOfByte1, zkvd.ZF()), Zkti.ZR(this.Zr.ZI(), zs572, arrayOfByte2, zkvd.ZR())));
    return true;
  }
  
  public static long ZM(Zlit paramZlit) {
    byte[] arrayOfByte = Zkb.Zy(paramZlit.Zdw());
    CRC32 cRC32 = new CRC32();
    cRC32.update(arrayOfByte);
    return cRC32.getValue();
  }
  
  private boolean Zf(Zs57 paramZs57) {
    try {
    
    } catch (Zsct zsct) {
      throw a(null);
    } 
    return (paramZs57.Zp == 0L);
  }
  
  private Zs57 Zc(Ztpx paramZtpx, Zs57 paramZs57, Zlit paramZlit) {
    Zsxd zsxd = this.Zt.ZD(Ztao.Zc(paramZtpx, this.Zr.ZM(), this.Zr.ZA().ZD()).Zx(Zxgd.Zu(paramZlit::lambda$updateFingerprint$2)).Zz(false).ZA());
    Zg3d zg3d = zsxd.ZG();
    Zb6q zb6q = zg3d.Ze();
    boolean bool = Zj();
    try {
      if (zg3d.Zb() == Zvom.RESPONSE_RECEIVED)
        try {
          if (zb6q != null)
            try {
              if (zb6q.Za().Zpu() != 0) {
                Zstu zstu = zb6q.Za();
                Zs68 zs68 = Zbwc.Zt(this.ZT, zstu, Zt0k.HTML_ANALYSIS, this.Zc);
                List<Zg8y> list = (new Zm4c<>(this.Zc)).Zn().Zw().ZW(Zski.Zf(this.ZT), zs68);
                Zs6y zs6y1 = (new Zk1s()).Zx(zstu, zs68).Zw(list).ZF();
                Zs6y zs6y2 = paramZs57.Zb;
                if (zs6y2 == null)
                  zs6y2 = zs6y1; 
                long l = paramZs57.Zp;
                Zlug[] arrayOfZlug = Zlug.values();
                int i = arrayOfZlug.length;
                byte b = 0;
                while (b < i) {
                  Zlug zlug = arrayOfZlug[b];
                  Zb1i zb1i1 = zs6y2.Zo(zlug);
                  Zb1i zb1i2 = zs6y1.Zo(zlug);
                  try {
                    if (zb1i1 != null)
                      try {
                        if (zb1i2 != null && zb1i1.ZN() != zb1i2.ZN())
                          l &= zlug.Ze() ^ 0xFFFFFFFFFFFFFFFFL; 
                      } catch (Zsct zsct) {
                        throw a(null);
                      }  
                  } catch (Zsct zsct) {
                    throw a(null);
                  } 
                  b++;
                  if (bool)
                    break; 
                } 
                return new Zs57(l, zs6y2, zsxd.ZG().ZL().ZD(), zstu);
              } 
              throw new Zsct();
            } catch (Zsct zsct) {
              throw a(null);
            }  
        } catch (Zsct zsct) {
          throw a(null);
        }  
    } catch (Zsct zsct) {
      throw a(null);
    } 
    throw new Zsct();
  }
  
  private Zlit Zj(byte[] paramArrayOfbyte) {
    return new Zax(this.Zr.Za(), paramArrayOfbyte);
  }
  
  static String Zi(String paramString) {
    boolean bool = ZZ();
    try {
    
    } catch (Zsct zsct) {
      throw a(null);
    } 
    Zuh.Zb(!paramString.isEmpty(), Zqf.Zk);
    String str = (new Zsy()).Zi().Zq().ZK(paramString.length());
    byte b1 = 10;
    byte b2 = 0;
    while (++b2 < b1 && str.equals(paramString)) {
      str = (new Zsy()).Zi().Zq().ZK(paramString.length());
      if (!bool)
        break; 
    } 
    return str;
  }
  
  private static Zefx lambda$updateFingerprint$2(Zlit paramZlit, Zefx paramZefx) {
    return paramZefx.ZU(Zkb.ZG(paramZlit.Zd4()));
  }
  
  private static Stream lambda$findFiles$1(Zer7 paramZer7) {
    return paramZer7.Zz().stream();
  }
  
  private boolean lambda$findFiles$0(Zer7 paramZer7) {
    try {
      if (ZN(paramZer7.Zi()))
        try {
          if (paramZer7.Zg());
        } catch (Zsct zsct) {
          throw a(null);
        }  
    } catch (Zsct zsct) {
      throw a(null);
    } 
    return false;
  }
  
  public static void ZO(boolean paramBoolean) {
    ZZ = paramBoolean;
  }
  
  public static boolean ZZ() {
    return ZZ;
  }
  
  public static boolean Zj() {
    boolean bool = ZZ();
    try {
      if (!bool)
        return true; 
    } catch (Zsct zsct) {
      throw a(null);
    } 
    return false;
  }
  
  private static Zsct a(Zsct paramZsct) {
    return paramZsct;
  }
  
  static {
    if (Zj())
      ZO(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */