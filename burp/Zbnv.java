package burp;

import java.awt.Component;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbnv implements IMessageEditor, Zmgv {
  private final IMessageEditorController Zr;
  
  private final Zbnt ZZ;
  
  private final Ztx8 Zk;
  
  private final Zbdf Zw;
  
  private final Zbdx ZT;
  
  private static final String a;
  
  public static IMessageEditor ZX(Zbnt paramZbnt, IMessageEditorController paramIMessageEditorController, boolean paramBoolean, Ztyg paramZtyg, Zgq7 paramZgq7, Ztx8 paramZtx8) {
    return new Ztfg(new Zbnv(paramZbnt, paramIMessageEditorController, paramZtx8, paramBoolean, paramZtyg, paramZgq7));
  }
  
  private Zbnv(Zbnt paramZbnt, IMessageEditorController paramIMessageEditorController, Ztx8 paramZtx8, boolean paramBoolean, Ztyg paramZtyg, Zgq7 paramZgq7) {
    this.ZZ = paramZbnt;
    this.Zr = paramIMessageEditorController;
    this.Zk = paramZtx8;
    this.Zw = paramZtyg.Zz(this, Zeew.EXTENDER, paramBoolean, Zbdf.ZR, Zb9b.Zx);
    this.ZT = paramZgq7.ZP(Zxff.EXTENSION).Zc(this.Zw).Zz().Zl();
  }
  
  public Component getComponent() {
    return this.ZT;
  }
  
  public void setMessage(byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(a); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      this.Zw.ZN(paramArrayOfbyte, paramBoolean ? Zgu3.HTTP_REQUEST : Zgu3.HTTP_RESPONSE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  public byte[] getMessage() {
    return Zt6s.Zb(this.Zw.Zi());
  }
  
  public boolean isMessageModified() {
    this.Zw.Zi();
    return this.Zw.Ze();
  }
  
  public byte[] getSelectedData() {
    return this.Zw.Zd();
  }
  
  public int[] getSelectionBounds() {
    return this.Zw.ZG();
  }
  
  public Zmzk Zod() {
    try {
      Objects.requireNonNull(this.Zr);
      IHttpService iHttpService = ZJ(this.Zr::getHttpService);
      return Zb28.Zs(iHttpService, this.ZZ);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zk.Zf(throwable);
    } 
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public Zstu Zos() {
    Objects.requireNonNull(this.Zr);
    byte[] arrayOfByte = ZJ(this.Zr::getRequest);
    return Zyf.Zy(arrayOfByte);
  }
  
  public Zstu ZoO() {
    Objects.requireNonNull(this.Zr);
    byte[] arrayOfByte = ZJ(this.Zr::getResponse);
    return Zyf.Zy(arrayOfByte);
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return 0L;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private <T> T ZJ(Supplier<T> paramSupplier) {
    try {
      return paramSupplier.get();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      return null;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc '(^]^AaEXOCIpEYK\\rSh\\t'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbnv.a : Ljava/lang/String;
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
    //   80: bipush #113
    //   82: goto -> 112
    //   85: bipush #47
    //   87: goto -> 112
    //   90: bipush #58
    //   92: goto -> 112
    //   95: bipush #57
    //   97: goto -> 112
    //   100: bipush #96
    //   102: goto -> 112
    //   105: bipush #50
    //   107: goto -> 112
    //   110: bipush #16
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */