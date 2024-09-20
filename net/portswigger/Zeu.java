package net.portswigger;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Zeu {
  static Zms ZK(Zav paramZav, Stream<Object> paramStream, boolean paramBoolean, String paramString) {
    try {
      Zlc zlc;
      Zl3 zl3;
      Zis zis;
      Zaq zaq;
      Ziq ziq = paramZav.Zg();
      switch (Zio.Zh[ziq.ordinal()]) {
        case 1:
          zlc = (new Zlc()).Zw(paramBoolean).ZO(paramZav.ZX()).Zu(paramZav.ZJ()).Zs(paramString).ZY(paramZav.ZT());
          Objects.requireNonNull(zlc);
          Zg(zlc::Zq, paramStream, ziq);
        case 2:
          zl3 = (new Zl3()).Zw(paramBoolean).ZO(paramZav.ZX()).Zu(paramZav.ZJ()).Zs(paramString).ZY(paramZav.ZT());
          Objects.requireNonNull(zl3);
          Zg(zl3::Zq, paramStream, ziq);
        case 3:
          zis = (new Zis()).ZX(paramBoolean).Zi(paramString);
          Objects.requireNonNull(zis);
          Zg(zis::Zi, paramStream, ziq);
        case 4:
          zaq = (new Zaq()).ZQ(paramBoolean).ZG(paramZav.Zu()).ZP(paramZav.ZZ()).Zp(paramString);
          Objects.requireNonNull(zaq);
          Optional.<Zrms>ofNullable(paramZav.ZD()).filter(Zeu::lambda$getFieldFragmentForPrimitiveType$0).ifPresent(zaq::ZM);
          Objects.requireNonNull(String.class);
          Objects.requireNonNull(zaq);
          paramZav.ZV().stream().filter(Zeu::lambda$getFieldFragmentForPrimitiveType$1).map(String.class::cast).forEach(zaq::ZO);
          Objects.requireNonNull(zaq);
          Zg(zaq::Zz, paramStream, ziq);
      } 
      return Zrmd.ZR();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Zki(Ztt.FAILED_TO_GET_FRAGMENT_FOR_TYPE.ZU(new Object[] { paramZav.Zg() }, ), exception);
    } 
  }
  
  static Zms Zv(Zav paramZav, Stream<Object> paramStream, String paramString1, boolean paramBoolean, Boolean paramBoolean1, String paramString2) {
    // Byte code:
    //   0: new net/portswigger/Zur
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: aload_0
    //   10: invokevirtual ZK : ()Ljava/util/Optional;
    //   13: aload #7
    //   15: aload_2
    //   16: iload_3
    //   17: aload #4
    //   19: <illegal opcode> accept : (Lnet/portswigger/Zur;Ljava/lang/String;ZLjava/lang/Boolean;)Ljava/util/function/Consumer;
    //   24: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   27: invokestatic Zl : ()[Ljava/lang/String;
    //   30: aload #7
    //   32: aload_2
    //   33: invokevirtual Zt : (Ljava/lang/String;)Lnet/portswigger/Zur;
    //   36: pop
    //   37: aload #7
    //   39: aload #4
    //   41: invokevirtual ZS : (Ljava/lang/Boolean;)Lnet/portswigger/Zur;
    //   44: pop
    //   45: aload #7
    //   47: iload_3
    //   48: invokevirtual ZQ : (Z)Lnet/portswigger/Zur;
    //   51: pop
    //   52: aload #7
    //   54: aload #5
    //   56: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zur;
    //   59: pop
    //   60: astore #6
    //   62: aload #7
    //   64: dup
    //   65: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: pop
    //   69: <illegal opcode> accept : (Lnet/portswigger/Zur;)Ljava/util/function/Consumer;
    //   74: aload_1
    //   75: getstatic net/portswigger/Ziq.OBJECT : Lnet/portswigger/Ziq;
    //   78: invokestatic Zg : (Ljava/util/function/Consumer;Ljava/util/stream/Stream;Lnet/portswigger/Ziq;)V
    //   81: aload_0
    //   82: invokevirtual ZO : ()Ljava/lang/Integer;
    //   85: ifnull -> 108
    //   88: aload #7
    //   90: aload_0
    //   91: invokevirtual ZO : ()Ljava/lang/Integer;
    //   94: invokevirtual intValue : ()I
    //   97: invokevirtual ZX : (I)Lnet/portswigger/Zur;
    //   100: pop
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: invokevirtual Zz : ()Ljava/lang/Integer;
    //   112: ifnull -> 135
    //   115: aload #7
    //   117: aload_0
    //   118: invokevirtual Zz : ()Ljava/lang/Integer;
    //   121: invokevirtual intValue : ()I
    //   124: invokevirtual Zs : (I)Lnet/portswigger/Zur;
    //   127: pop
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload #7
    //   137: invokevirtual ZS : ()Lnet/portswigger/Zoj;
    //   140: invokestatic Zwu : ()[Lburp/Zbqc;
    //   143: ifnonnull -> 160
    //   146: iconst_1
    //   147: anewarray java/lang/String
    //   150: invokestatic Zl : ([Ljava/lang/String;)V
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   62	101	104	net/portswigger/Zki
    //   108	128	131	net/portswigger/Zki
    //   135	153	156	net/portswigger/Zki
  }
  
  private static Zms ZZ(List<Zav> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: new net/portswigger/Zoa
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: iload_1
    //   10: aload_2
    //   11: <illegal opcode> accept : (ZLnet/portswigger/Zoa;)Ljava/util/function/Consumer;
    //   16: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   21: aload_2
    //   22: invokevirtual ZS : ()Lnet/portswigger/Zsj;
    //   25: areturn
  }
  
  static Zms ZG(Zav paramZav, Stream<Object> paramStream, String paramString1, boolean paramBoolean, Boolean paramBoolean1, String paramString2) {
    try {
      List<Zav> list1 = paramZav.Zc();
      if (!list1.isEmpty())
        return ZZ(list1, paramBoolean); 
      List<Zav> list2 = paramZav.ZY();
      if (!list2.isEmpty())
        return ZZ(list2, paramBoolean); 
      Ziq ziq = paramZav.Zg();
      try {
        switch (Zio.Zh[ziq.ordinal()]) {
          case 5:
          
          case 6:
          
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      return ZK(paramZav, paramStream, paramBoolean, paramString2);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Zki(Ztt.FAILED_TO_GET_FRAGMENT_FOR_TYPE.ZU(new Object[] { paramZav.Zg() }, ), exception);
    } 
  }
  
  static <T> void Zg(Consumer<T> paramConsumer, Stream<Object> paramStream, Ziq paramZiq) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: aload_0
    //   3: <illegal opcode> accept : (Lnet/portswigger/Ziq;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   8: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   13: return
  }
  
  static boolean ZU(Ziq paramZiq, Object paramObject) {
    try {
      if (paramZiq == Ziq.OBJECT)
        return true; 
    } catch (Zki zki) {
      throw a(null);
    } 
    try {
      if (paramZiq == Ziq.STRING)
        try {
          if (paramObject instanceof String)
            return true; 
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    try {
      if (paramZiq == Ziq.BOOLEAN)
        try {
          if (paramObject instanceof Boolean)
            return true; 
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    try {
      if (paramZiq == Ziq.INTEGER)
        try {
          if (paramObject instanceof Integer)
            return true; 
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    try {
      if (paramZiq == Ziq.NUMBER)
        try {
          if (paramObject instanceof Number)
            return true; 
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    return false;
  }
  
  static Optional<? extends Zms> ZA(Zi5 paramZi5) {
    try {
      return Optional.of(ZG(paramZi5.Zj(), paramZi5.Zg(), paramZi5.ZZ(), paramZi5.ZC(), paramZi5.Zv(), paramZi5.Zx()));
    } catch (Zki zki) {
      Zah.Zl(zki, Zk_.RETHROWN);
      throw zki;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Zki(Ztt.FAILED_TO_GET_FRAGMENT_FOR_PARAMETER.ZU(new Object[] { paramZi5.ZX() }, ), exception);
    } 
  }
  
  private static void lambda$addExamplesToBuilder$4(Ziq paramZiq, Consumer<Object> paramConsumer, Object paramObject) {
    try {
      if (ZU(paramZiq, paramObject))
        paramConsumer.accept(paramObject); 
    } catch (Zki zki) {
      throw a(null);
    } 
  }
  
  private static void lambda$getFieldFragmentForOneOf$3(boolean paramBoolean, Zoa paramZoa, Zav paramZav) {
    Zms zms = ZG(paramZav, paramZav.Zj(), null, paramBoolean, null, paramZav.Zh());
    paramZoa.ZX(zms);
  }
  
  private static void lambda$getFieldFragmentForArray$2(Zur paramZur, String paramString, boolean paramBoolean, Boolean paramBoolean1, Zav paramZav) {
    paramZur.Zx(ZG(paramZav, paramZav.Zj(), paramString, paramBoolean, paramBoolean1, paramZav.Zh()));
  }
  
  private static boolean lambda$getFieldFragmentForPrimitiveType$1(Object paramObject) {
    return ZU(Ziq.STRING, paramObject);
  }
  
  private static boolean lambda$getFieldFragmentForPrimitiveType$0(Zrms paramZrms) {
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    return (paramZrms != Zrms.UNKNOWN);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */