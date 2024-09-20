package burp;

import java.util.Collections;
import java.util.List;

public class Zx88 {
  static Zttl ZO(List<Zg8y> paramList, Zr_4 paramZr_4, Zeu9 paramZeu9, Zkl6 paramZkl6) {
    // Byte code:
    //   0: invokestatic ZW : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: ldc burp/Zlvj
    //   23: dup
    //   24: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: pop
    //   28: <illegal opcode> apply : (Ljava/lang/Class;)Ljava/util/function/Function;
    //   33: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   38: aload_1
    //   39: aload_2
    //   40: aload_3
    //   41: <illegal opcode> apply : (Lburp/Zr_4;Lburp/Zeu9;Lburp/Zkl6;)Ljava/util/function/Function;
    //   46: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   51: invokeinterface toList : ()Ljava/util/List;
    //   56: astore #5
    //   58: aload_1
    //   59: new burp/Zev_
    //   62: dup
    //   63: invokestatic emptyList : ()Ljava/util/List;
    //   66: aload #5
    //   68: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
    //   71: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   76: checkcast burp/Zttl
    //   79: invokestatic Zwu : ()[Lburp/Zbqc;
    //   82: ifnonnull -> 90
    //   85: ldc 'iL7EJc'
    //   87: invokestatic Zs : (Ljava/lang/String;)V
    //   90: areturn
  }
  
  private static Zgyy ZJ(Zr_4 paramZr_4, Zlvj paramZlvj, Zeu9 paramZeu9, Zkl6 paramZkl6) {
    if (paramZlvj.ZM() == Zz3o.API)
      return paramZr_4.<Zgyy>ZH(new Zskb(paramZeu9, paramZlvj)); 
    if (paramZlvj.ZM() == Zz3o.SITEMAP) {
      Zlit zlit = paramZlvj.Zx().ZyR();
      Zey9 zey9 = paramZkl6.ZH();
      Zmzk zmzk = zlit.Zdz();
      Zstu zstu = paramZkl6.Zs().ZO().Zf(zlit).Zr();
      return paramZr_4.<Zgyy>ZH(new Zefw(paramZeu9, paramZlvj.ZM(), zey9.Zu(zmzk, zstu), Collections.emptyList()));
    } 
    if (paramZlvj instanceof Zre3) {
      Zre3 zre3 = (Zre3)paramZlvj;
      return paramZr_4.<Zgyy>ZH(new Zslk(zre3, paramZeu9));
    } 
    return paramZr_4.<Zgyy>ZH(new Zmsa(paramZeu9, paramZlvj.Zx()));
  }
  
  static void Zq(Zsiv paramZsiv, List<Zgyy> paramList, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    String str = Zzh4.ZW();
    for (Zgyy zgyy : paramList) {
      paramZsiv.Zx(Zs_g.Zw(zgyy), paramZr69, paramZz1m);
      if (str == null)
        break; 
    } 
  }
  
  static boolean ZY(Object paramObject, Zzr9 paramZzr9) {
    String str = Zzh4.ZW();
    if (paramZzr9.ZF(paramObject))
      return true; 
    if (paramObject instanceof Zzr9) {
      Zzr9 zzr9 = (Zzr9)paramObject;
      if (str != null)
        return paramZzr9.ZHk().equals(zzr9.ZHk()); 
    } 
    return false;
  }
  
  static int Zf(Zzr9 paramZzr9) {
    return paramZzr9.ZHk().hashCode();
  }
  
  private static Zgyy lambda$createExits$1(Zr_4 paramZr_4, Zeu9 paramZeu9, Zkl6 paramZkl6, Zlvj paramZlvj) {
    return ZJ(paramZr_4, paramZlvj, paramZeu9, paramZkl6);
  }
  
  private static boolean lambda$createExits$0(Zg8y paramZg8y) {
    return paramZg8y.ZM().Ze();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx88.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */