package burp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zhq;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.Zlh;
import net.portswigger.Zrmq;
import net.portswigger.Zto;
import net.portswigger.Zv3;

public class Zs08 {
  private static final Set<String> Zu;
  
  private final Ztt ZL = new Ztt();
  
  private final Zi7 Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs08(String paramString) {
    try {
      this.Zf = (paramString == null) ? Zv3.ZU() : (Zi7)Zv3.Zp(paramString);
    } catch (Zlh zlh) {
      Zah.Zl((Throwable)zlh, Zk_.USER_ERROR);
      throw new Zs0z(a(12960, 5578) + a(12960, 5578));
    } 
  }
  
  public Zguf ZB() {
    ZT(this.Zf, this.ZL);
    ZD(this.Zf, this.ZL);
    Objects.requireNonNull(this.ZL);
    Zr(this.Zf, a(12989, 5154), this.ZL::Zu);
    Objects.requireNonNull(this.ZL);
    Zr(this.Zf, a(12982, 8110), this.ZL::ZX);
    Objects.requireNonNull(this.ZL);
    ZX(this.Zf, a(12966, -12491), this.ZL::Zj);
    ZY(this.Zf, this.ZL);
    ZM(this.Zf, this.ZL);
    Zm(this.Zf, this.ZL);
    Zz(this.Zf, this.ZL);
    Zb(this.Zf, this.ZL, a(13035, 1843));
    int i = Zrak.Zp();
    try {
      Zb(this.Zf, this.ZL, a(13018, 30008));
      Objects.requireNonNull(this.ZL);
      Zw(this.Zf, this.ZL::Zz);
      Objects.requireNonNull(this.ZL);
      Zr(this.Zf, a(13025, 16525), this.ZL::Zp);
      Objects.requireNonNull(this.ZL);
      ZX(this.Zf, a(13046, -7859), this.ZL::ZK);
      ZF(this.Zf, this.ZL);
      Zr(this.Zf, this.ZL, a(12997, -22468));
      Zr(this.Zf, this.ZL, a(13027, -22241));
      ZX(this.Zf, this.ZL);
      Zu(this.Zf, this.ZL);
      Objects.requireNonNull(this.ZL);
      Zr(this.Zf, a(13026, 16799), this.ZL::ZB);
      ZC(this.Zf, this.ZL);
      ZI(this.Zf, this.ZL);
      ZN(this.Zf, this.ZL);
      ZP(this.Zf, this.ZL);
      if (i == 0)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return this.ZL.ZS();
  }
  
  private static void ZT(Zi7 paramZi7, Ztt paramZtt) {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: aload_0
    //   4: sipush #13043
    //   7: sipush #-2662
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   18: astore_3
    //   19: istore_2
    //   20: aload_3
    //   21: invokeinterface Zr : ()Z
    //   26: ifeq -> 219
    //   29: aload_3
    //   30: invokeinterface ZW : ()Ljava/lang/String;
    //   35: astore #4
    //   37: sipush #13007
    //   40: sipush #-10645
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: aload #4
    //   48: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   51: ifeq -> 71
    //   54: aload_1
    //   55: iconst_5
    //   56: invokevirtual ZL : (I)Lburp/Ztt;
    //   59: pop
    //   60: iload_2
    //   61: ifeq -> 219
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: sipush #13051
    //   74: sipush #-4393
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: aload #4
    //   82: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   85: ifeq -> 113
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: aload_1
    //   96: bipush #7
    //   98: invokevirtual ZL : (I)Lburp/Ztt;
    //   101: pop
    //   102: iload_2
    //   103: ifeq -> 219
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: sipush #12972
    //   116: sipush #26437
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload #4
    //   124: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   127: ifeq -> 155
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_1
    //   138: bipush #15
    //   140: invokevirtual ZL : (I)Lburp/Ztt;
    //   143: pop
    //   144: iload_2
    //   145: ifeq -> 219
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: sipush #13010
    //   158: sipush #14801
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: aload #4
    //   166: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   169: ifeq -> 198
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aload_1
    //   180: sipush #200
    //   183: invokevirtual ZL : (I)Lburp/Ztt;
    //   186: pop
    //   187: iload_2
    //   188: ifeq -> 219
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: new burp/Zs0z
    //   201: dup
    //   202: sipush #12968
    //   205: sipush #-3148
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokespecial <init> : (Ljava/lang/String;)V
    //   214: athrow
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: return
    // Exception table:
    //   from	to	target	type
    //   37	64	67	net/portswigger/Zlh
    //   54	88	91	net/portswigger/Zlh
    //   71	106	109	net/portswigger/Zlh
    //   95	130	133	net/portswigger/Zlh
    //   113	148	151	net/portswigger/Zlh
    //   137	172	175	net/portswigger/Zlh
    //   155	191	194	net/portswigger/Zlh
    //   179	215	215	net/portswigger/Zlh
  }
  
  private static void ZD(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12985, 26967)).ifPresent(paramZtt::Zw);
  }
  
  private static void ZY(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12954, 6579)).ifPresent(paramZtt::Zg);
    List<Integer> list = Zkha.ZV(paramZi7, a(12984, 25444));
    try {
      if (list != null)
        paramZtt.ZB(list); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  private static void ZM(Zi7 paramZi7, Ztt paramZtt) {
    Zrmq zrmq = Zkha.Z_(paramZi7, a(13006, -5592));
    int i = Zrak.ZW();
    try {
      if (zrmq != null) {
        try {
          if (!zrmq.Zw())
            throw new Zs0z(a(12994, -25573)); 
        } catch (Exception exception) {
          throw a(null);
        } 
        for (Zrmq zrmq1 : zrmq.ZO()) {
          InetAddress inetAddress;
          try {
            if (!zrmq1.Za())
              throw new Zs0z(a(12979, 16808)); 
          } catch (Exception exception) {
            throw a(null);
          } 
          try {
            inetAddress = InetAddress.getByName(Zkha.Zn((Zi7)zrmq1, a(12970, 5207)).orElse(null));
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.USER_ERROR);
            throw new Zs0z(a(13028, 25117));
          } 
          ArrayList<InetAddress> arrayList = new ArrayList();
          List<Zrmq> list = Zkha.Zc((Zi7)zrmq1, a(13047, -18411));
          for (Zrmq zrmq2 : list) {
            try {
              arrayList.add(InetAddress.getByName(zrmq2.ZW()));
            } catch (UnknownHostException unknownHostException) {
              Zah.Zl(unknownHostException, Zk_.USER_ERROR);
              throw new Zs0z(a(13039, 2015) + a(13039, 2015));
            } 
            if (i != 0)
              break; 
          } 
          String str1 = Zkha.Zn((Zi7)zrmq1, a(12987, 16821)).<Throwable>orElseThrow(Zs08::lambda$parseInterfaces$0);
          String str2 = Zkha.Zn((Zi7)zrmq1, a(13036, 14706)).orElse(null);
          Ztrp ztrp = new Ztrp(str1, inetAddress, arrayList, str2);
          paramZtt.Zj(ztrp);
          if (i != 0)
            break; 
        } 
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  private static void Zm(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12952, -25314)).ifPresent(paramZtt::ZS);
    List<Integer> list1 = Zkha.ZV(paramZi7, a(12990, 2));
    try {
      if (list1 != null)
        paramZtt.Zh(list1); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(13016, -15101)).ifPresent(paramZtt::Zt);
    List<Integer> list2 = Zkha.ZV(paramZi7, a(13014, 26196));
    try {
      if (list2 != null)
        paramZtt.Zl(list2); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  private static void Zz(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12980, -28339)).ifPresent(paramZtt::ZC);
    List<Integer> list1 = Zkha.ZV(paramZi7, a(13024, -23831));
    try {
      if (list1 != null)
        paramZtt.ZH(list1); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(13001, -20949)).ifPresent(paramZtt::Zp);
    List<Integer> list2 = Zkha.ZV(paramZi7, a(12963, -27307));
    try {
      if (list2 != null)
        paramZtt.Zm(list2); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  private static void ZF(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12974, 18473)).ifPresent(paramZtt::ZI);
    Objects.requireNonNull(paramZtt);
    Zkha.Zw(paramZi7, a(12991, -2316)).ifPresent(paramZtt::ZQ);
  }
  
  private static void ZX(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, a(12992, 9718)).ifPresent(paramZtt::Z_);
  }
  
  private static void Zu(Zi7 paramZi7, Ztt paramZtt) {
    List<Zrmq> list = Zkha.Zc(paramZi7, a(13009, 27138));
    Iterator<Zrmq> iterator = list.iterator();
    int i = Zrak.Zp();
    while (iterator.hasNext()) {
      Zrmq zrmq = iterator.next();
      paramZtt.ZX(Zxfq.Zt(zrmq.ZW()));
      if (i == 0)
        break; 
    } 
  }
  
  private static void ZC(Zi7 paramZi7, Ztt paramZtt) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zc(paramZi7, a(12969, -4100)).stream().map(Zrmq::ZN).map(Zhq::ZW).forEach(paramZtt::Zq);
  }
  
  private static void ZI(Zi7 paramZi7, Ztt paramZtt) {
    Zrmq zrmq = Zkha.Z_(paramZi7, a(12998, 29964));
    int i = Zrak.Zp();
    try {
      if (zrmq != null) {
        try {
          if (!zrmq.Zw())
            throw new Zs0z(a(13020, 19637)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        for (Zrmq zrmq1 : zrmq.ZO()) {
          try {
            if (!zrmq1.Za())
              throw new Zs0z(a(13002, 4253)); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          Optional<String> optional1 = Zkha.Zn((Zi7)zrmq1, a(13038, 15959));
          Optional<String> optional2 = Zkha.Zn((Zi7)zrmq1, a(13049, -8010));
          Optional<String> optional3 = Zkha.Zn((Zi7)zrmq1, a(12965, -23252));
          try {
            if (!Zkha.Zy(optional1))
              try {
                if (!Zkha.Zy(optional2))
                  try {
                    if (!Zkha.Zy(optional3)) {
                      try {
                        String str = new String(Base64.getDecoder().decode(optional3.get()), StandardCharsets.UTF_8);
                        Zkhh zkhh = new Zkhh(optional1.get(), optional2.get(), str);
                        paramZtt.Zd(zkhh);
                      } catch (IllegalArgumentException illegalArgumentException) {
                        Zah.Zl(illegalArgumentException, Zk_.RETHROWN);
                        throw new Zs0z(a(13017, -13489) + a(13017, -13489) + String.valueOf(optional1));
                      } 
                      if (i == 0)
                        break; 
                      continue;
                    } 
                    throw new Zs0z(a(13022, -31020));
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          throw new Zs0z(a(13022, -31020));
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static void ZN(Zi7 paramZi7, Ztt paramZtt) {
    Zrmq zrmq = Zkha.Z_(paramZi7, a(13023, 21688));
    int i = Zrak.Zp();
    try {
      if (zrmq == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!zrmq.Zw())
        throw new Zs0z(a(12964, -12705)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (Zrmq zrmq1 : zrmq.ZO()) {
      try {
        if (!zrmq1.Za())
          throw new Zs0z(a(12953, -4463)); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      Optional<?> optional = Zkha.Zn((Zi7)zrmq1, a(12967, -154)).flatMap(Zk13::Zo);
      try {
        if (optional.isEmpty())
          throw new Zs0z(a(13012, 7374)); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      int j = ((Integer)optional.get()).intValue();
      Zm3o zm3o = Zn(j, zrmq1);
      Zq(zm3o);
      try {
        paramZtt.ZA(zm3o);
      } catch (IllegalStateException illegalStateException) {
        Zah.Zl(illegalStateException, Zk_.USER_ERROR);
        throw new Zs0z(a(13037, -30411));
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private static Zm3o Zn(int paramInt, Zrmq paramZrmq) {
    Map<Integer, Zto> map = Map.of(Integer.valueOf(5), Zto.ZM(a(12955, 24443), a(13052, 14230)), Integer.valueOf(16), Zto.ZM(a(13019, -9098), a(12977, 9542)), Integer.valueOf(257), Zto.ZM(a(12962, -8665), a(13041, 490)));
    int i = Zrak.ZW();
    Zto zto = map.get(Integer.valueOf(paramInt));
    try {
      if (zto == null)
        throw new Zs0z(a(13000, 10656)); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Optional<String> optional1 = Zkha.Zn((Zi7)paramZrmq, (String)zto.Zq);
    Optional<String> optional2 = Zkha.Zn((Zi7)paramZrmq, (String)zto.Zo);
    try {
      if (Zkha.Zy(optional1))
        throw new Zs0z(String.format(a(13054, -435), new Object[] { Zk13.Zk(paramInt), zto.Zq })); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (Zkha.Zy(optional2))
        throw new Zs0z(String.format(a(12976, -26763), new Object[] { Zk13.Zk(paramInt), zto.Zo })); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    HashSet<String> hashSet = new HashSet<>(Zu);
    hashSet.remove(zto.Zq);
    hashSet.remove(zto.Zo);
    for (String str : hashSet) {
      try {
        if (Zkha.Zn((Zi7)paramZrmq, str).isPresent())
          throw new Zs0z(String.format(a(12988, -24217), new Object[] { Zk13.Zk(paramInt), str })); 
      } catch (Zlh zlh) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    int j = Zkha.Zw((Zi7)paramZrmq, a(13005, 25756)).orElse(Zrx.ZW);
    return new Zm3o(paramInt, optional1.get(), optional2.get(), j);
  }
  
  private static void Zq(Zm3o paramZm3o) {
    String str1;
    String str2;
    try {
      if (paramZm3o.Zc() < 0)
        throw new Zs0z(a(12975, 24188)); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    switch (paramZm3o.Zd()) {
      case 16:
        str1 = paramZm3o.Zu();
        try {
          if (!Ze2x.Ze(str1))
            throw new Zs0z(a(12983, 9701) + a(12983, 9701) + str1); 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        break;
      case 5:
        str1 = paramZm3o.Zu();
        try {
          if (!Ze2x.Ze(str1))
            throw new Zs0z(a(13042, 11166) + a(13042, 11166) + str1); 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        str2 = paramZm3o.Zf();
        try {
          if (str2.length() <= 253) {
            try {
              if (!str2.matches(a(13032, 29498)))
                throw new Zs0z(a(13029, -6373)); 
            } catch (Zlh zlh) {
              throw a(null);
            } 
            break;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        throw new Zs0z(a(13029, -6373));
      case 257:
        str1 = paramZm3o.Zu();
        try {
          if (str1.matches(a(13004, -16918))) {
            try {
              if (str1.length() > 256)
                throw new Zs0z(a(13042, 11166) + a(13042, 11166) + str1); 
            } catch (Zlh zlh) {
              throw a(null);
            } 
            break;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        throw new Zs0z(a(13042, 11166) + a(13042, 11166) + str1);
    } 
  }
  
  private static void Zb(Zi7 paramZi7, Ztt paramZtt, String paramString) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::ZG);
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::ZJ);
    int i = Zrak.ZW();
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::ZT);
    Map<String, List<String>> map = Zq(paramZi7, paramString);
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      paramZtt.ZR((String)entry.getKey(), (List<String>)entry.getValue());
      if (i != 0)
        break; 
    } 
  }
  
  private static void Zr(Zi7 paramZi7, Ztt paramZtt, String paramString) {
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::Zt);
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::ZD);
    Objects.requireNonNull(paramZtt);
    Zkha.Zn(paramZi7, paramString + paramString).ifPresent(paramZtt::Zs);
    int i = Zrak.Zp();
    Map<String, List<String>> map = Zq(paramZi7, paramString);
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      paramZtt.Zc((String)entry.getKey(), (List<String>)entry.getValue());
      if (i == 0)
        break; 
    } 
  }
  
  private static Map<String, List<String>> Zq(Zi7 paramZi7, String paramString) {
    Zrmq zrmq = Zkha.Z_(paramZi7, paramString + paramString);
    int i = Zrak.ZW();
    try {
      if (zrmq == null)
        return Collections.emptyMap(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (zrmq.Zr())
        return Collections.singletonMap(null, Collections.singletonList(zrmq.ZW())); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (zrmq.Zw())
        return Collections.singletonMap(null, Zkha.Zh(zrmq, paramString, String.format(a(13013, 24823), new Object[] { paramString }))); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    if (zrmq.Za()) {
      HashMap<Object, Object> hashMap = new HashMap<>();
      Zi7 zi7 = zrmq.Zu();
      for (Map.Entry entry : zi7.ZX()) {
        String str = (String)entry.getKey();
        List<String> list = Zkha.Zh((Zrmq)entry.getValue(), paramString, String.format(a(13044, -23935), new Object[] { paramString, str }));
        hashMap.put(str, list);
        if (i != 0)
          break; 
      } 
      return (Map)hashMap;
    } 
    throw new Zs0z(String.format(a(12961, 18254), new Object[] { paramString }));
  }
  
  private static void Zw(Zi7 paramZi7, Consumer<InetAddress> paramConsumer) {
    Zrmq zrmq = Zkha.Z_(paramZi7, a(13031, 23404));
    try {
      if (zrmq == null)
        return; 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      if (!zrmq.Zr())
        throw new Zs0z(a(13003, 27576)); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    String str = zrmq.ZW();
    try {
      paramConsumer.accept(InetAddress.getByName(str));
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.USER_ERROR);
      throw new Zs0z(a(13050, 27542) + a(13050, 27542));
    } 
  }
  
  private static void Zr(Zi7 paramZi7, String paramString, Consumer<InetAddress> paramConsumer) {
    List<Zrmq> list = Zkha.Zc(paramZi7, paramString);
    int i = Zrak.Zp();
    try {
      for (Zrmq zrmq : list) {
        paramConsumer.accept(InetAddress.getByName(zrmq.ZW()));
        if (i == 0)
          break; 
      } 
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.USER_ERROR);
      throw new Zs0z(a(12999, 29961) + a(12999, 29961));
    } 
  }
  
  private static void ZX(Zi7 paramZi7, String paramString, Consumer<String> paramConsumer) {
    Zkha.Zn(paramZi7, paramString).ifPresent(paramConsumer);
  }
  
  private static void ZP(Zi7 paramZi7, Ztt paramZtt) {
    Zrmq zrmq = Zkha.Z_(paramZi7, a(13021, 20922));
    try {
      if (zrmq == null)
        return; 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    try {
      if (!zrmq.Za())
        throw new Zs0z(a(13011, 2148)); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    long l1 = Zkha.ZR((Zi7)zrmq, a(13033, -815)).orElse(10000000L);
    try {
      if (l1 < 1000L)
        throw new Zs0z(a(13015, -21460)); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    paramZtt.Zd(l1);
    long l2 = Zkha.ZR((Zi7)zrmq, a(12981, -17933)).orElse(Long.MAX_VALUE);
    try {
      if (l2 < 1000L)
        throw new Zs0z(a(12973, -32028)); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    paramZtt.Zs(l2);
  }
  
  private static Zs0z lambda$parseInterfaces$0() {
    return new Zs0z(a(12986, -12431));
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Â¢¶aQª$-ô\\n) ®\\rÝÜ;×o(.'çdEBÌ­aÊdº!CRmþèäñXXG5jCrü4Þ\\rÚivS¼ê8´;/ÄÓS 4õ8{+Tø×³'ÛR\\r¨æßô»/),³ÁHK{öÑs!óü\\nM1ÿk]¢ª»\\t­ÌçÜFðpw\\bmÕë %¨FíqXsØCe,ìl¡4F§¹r-D®Ýí Ý6?Ê\\tûwËV×6^\\f¹Å7pø?,Ê\\r@Ì^ñÔpØH¾D­e7y±:ÚFD®3(DÛIsÚt÷rZ9Ô'Rú{lBVd\\næ0v=ZÝ\\n0@Î%§Ási&wøKG\\tXTä)'¼F2Ý#%6ùÁÈw9EH#ffï8Å¯! Ó­¦_Wt,ÇSbK;õKQ7\âéÜÆ~«"ky¾l§£¹&eôå*Èj±üÛ¨W#£hÕ!lÝIUnQ)î<àèÞýÑN9L¡¬EYØø°ZÏ5&Þ-ç¢ Ò=9ùÆ"^Lç²aÌ¢CÄ%^GèÉ1[1Ëðz9ôD¯ïQo{Ð}ÞÓRõØ¤eRï\\b±HLK[_$¦õÎ<Mýè4N®·§v['W]b×eòÒCÜ`·7kxù[æÊ6ÔZþ¸Fªk´-e*ãð\\bdÿ¥MµK Ú%5ä¯ýrÖÈpB÷ÕE\EØÛÃò\\r¯L·g§Ì/ÒÁ;£­Qó¨«ìÎÝc(qqaöÊym¤,#'c³r5(ôÊcûm<ÛTWê3º3\\t=.·Ó§ø!æD*Â1)ð]PççÌb}!^Ã\\bM3odÚWQ.ààZ*w§;¢)cCÛFl9§\\bpýªu'êãÐÙâ,Þ¡c¿m?b³ã@Jzh>î£mò¥rÓXÈªte0+kÖcl_áBR}Ð`WïWLÞ»ü2%©ìÇÏ²¼4ÏvèD#â?löËDh5M³lÛ`\\byd-ÁÓiÿaRfÌ¹¸tkZþSªÂ«óÉµ¼ôæ£jçAÍ=×ÒRpLF¦¹G<|ýÎ4ØN6·´v9']S×C6ÒÛÜs·Uk0ãÜìx ÷®SKÖÁ\\fVåAÑO{NX#ß´ÛÔ=Ú\ h°b®?8(+Ö&ªÛD7æ`ù}óßAoR¬Áð¿`xß¶÷@x!lzlRBMs4£ÏY\\t.¯ý>Ý|Ãâüì¸jH¥¢îâ¡¸KoðÐówQùÑO%¾O»òé>O¿\$¯ ¸¨'ÏÐ°¯½~%ÃYz­jÄèpø×ÌëÒëfÄ¾¹¦±ýUáK!ï,Ñ¾§XdlÎ,L£Íýç/\(LGÈ!xþ$ dê×eõdÀ& a6þ?Ø4²mÔ$;åçð'ß¼¼¦ØP?\êñËØ_,®L*yÜQYNÞ½\\nÕ©·sSÇ'Ý©Z5øÈèöV_mÜ>ëøée|',üûíÿ~{½NÆOñ`°*>~ZFÂ9F¬?x¦xÈ¼?4ªòD²m"£JmS0VÀÓbà%2ÞüØZ+ÆCÚdC%¯k²\\nÝ@s%Öu¹uä()«¸M¸,I®Sk4)\\bÎv¦7~XþÃú\\t]Gæ]°j¦ÑÜ¦íj!yrîâ4¾ÒWã$u)±ú?6:å5 \\fz<ìfÞ.(çU: fóµ%U(,øoZÝuêe\\rÏ0ÍX»qs­ïn=êèÇ`ZÇ§ú"<Úç;É¤[f\\nñ{¹ÉC$i»4Ø°IT·ê%%36¼Òªå¡\TÐ«ÐY¡ÍG\¶yß\\rÒ!=l±\\r]G¡ZiÐ§t´þÝþd*®§<½ºëxßL}¬ÞY«áø}®Zø5m&-|ý¢ÎÒð9@Æ^ªçnaB¼/ÕDâAÏ*@É§ÑÿMFðF«zÕÿÒJÊÂñÂCú£²|ï²ñÈë\\tº©&qúÂÇÍÞ[\\f¸Mãý¥[Yoó¿ÁËÖÉîÜUIr<4W/ey0fmïßúÅ¢»&«Ô>¡²,øhzEõØ@ÂGj´fÊtÞt*À^a|V(è8ËPF²ÝSsGü¹£ð±p½ïª{]Cõ.Ô;¨®×ivñuÙbôß\\bÛØ+ðE/7[¿",Ý@ördMI¤Ò=Á LúÎ2ö<\\rÄÑvä(Þ»xÑ¼æ<¬¸ma&-\\fÿcÃDyú.GìÃe¤¾¯JzÙ(y¤w]}©¹m\\b>f~êKïÉMQÙ: Ì¨hÂÆµÐ'ízh_Êc((;ªú¢Êr»\\nÎµoU ®Ø¤Ìzá\ò9_Å%|eõ| ~:L×ÛüúÇ¾9_áY÷\h(³ú8Û?­q-i^É"Ù`\\tÞùâÈ"tþå\4î øqÓ^E_ÒªÑTò§ yÓ\\bópø'|ºnJKAE5ì4ÍÅÀË\üÛûè»ÃÒGÀºy»-¡Æ°¸"58#ÇLv\\t\ÚÞ)ò¯®¶n®RÖV9RûÏ%üà`_ðô,»Ò1Í¤8ßïQ%TÝ%ÿìTÁôEýs\\fî\\f"\\n(1XtÊÛw)/Î¶P×{6ùwE¯#ô¬³ëû!ZädÕÔ üÀéJO¡Òµ\\rú %ô&K=ÉàãXøkæÛ¯#=yZ­BãÞðVýqæa¸ßY~u·\\fDÞT¤2ªfW*È(õ\\rýjo«²Å²\\t8|DÉ+°ÿzföN0ÁAâlØ+¢iãaóÁ1@V\\tás#®í/?é@0|üòþ$\\fÇñçm\\flº%,IkçúZpëX`Ç|Ç"ÛE³\\bÂ÷ÙÂ*q4¨¯v«/hc@ú;èb¡þÙ¸¡VdÃ)ï&Y0ÈÐe^cÊx º;$ß[»u©BÞz]òûp%*SÕá<öï®ÂA"iÏ,1¨XgCTªøtn\\bäbÂ­E3 J/Ôj\\n*ä8U¨+Êg¹¹|,¿yªa³]i¯? å³Æ¶wQW¡ô5S)T1Tì ã¹ßÖ¸âê~\\r\\tA\\bO¾ÑUþ§X¸ØX0SOa%\\\t¢ªUÍ9ÿÎÃ`\\n-0#/»j¦EøûÙÈZf*~¨¨/£${!ø'»¤lÌPN¼a8¼)ÈlÈÁä­ÂÅqaUDØmå¤ô%ÉT¿¯9 yQ¤+\Hõ{>À.$|ö®¯SÜ\\tÅÀ¥¼ÿ¬bX\\nÿ5âÕ±×ðSnuDçm°¥Í¨ìéz[þ!9ÁÊUvÐYÓ46tìæÙy¹Z²×ü"3¥%{Q'\\b´Ç*áam\\r«úÓ\\fóÂ$p)VFæ¼\\fÆO5°tBîr[k¡3òèâÕqÄS"À\ßd÷¢ñtßk¨â\\fü%ÄÉºçQ*s¯á¬PTªEE>ÁZcKâU:.C.Súþ%/Ò-wÛû<»kLÑ<±°[:PÚ´óÏNRz_/ÿùªÅ/\|ébï´ IÊ\\f6ftÊ¡{\,)äã"Bø\\fÑ0«2å§Õ¾RV\\n8¼¥\XÝR%*Äp[l~õ-íàªª6ÍF¿®8\\r(ÛÖ8ªñ\\tVcT\\føùª¨,·À«ïóØ×Å¦ÂÓ³²[(H?æ³»Ç·åW¨s·æ\\fâäÂÎxæ^ä;ë\\tö´t6±<ÝN;ýYïl!ªt§Äú3·gÛ~x>^Üxª<£Ò¿õº\\f¨e R&2rµ4µ¨Ã?aMbÃM«Øµs6oÈº¢0ø~|Aënê]Ô¾`à»¢'9Ég\\t¹£OèCcÕÏ[º¤¢ÜvË\\bÅhL¡{úß°®Kë÷\\tãR'p~\\r_P\\fL3&å\\råD_mèÊwn´}U%ë"X5ÇÖÇNÛ³/\\b]Ùqa¨vþ/ÂcP@1¯;B7¡TÙíV1ÃïsC2-Ûóñ¾kjìÃiëeæáÝFqS¯^è4TÍ?´\\b!\\t\\n£'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #78
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '&çoN*ñoñq®LÍ)¢¶0óiôÎó«ûÕ< ¬quuÀãÅ»eâ÷ç×FÓ8AºCXìK´gvØd@/kõ$ÂE?NºYÁÔ©ºÏÞXIö×#JkXuk'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #85
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #104
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zs08.a : [Ljava/lang/String;
    //   131: bipush #100
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zs08.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #60
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #13019
    //   303: sipush #-9098
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: sipush #12977
    //   312: sipush #9542
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: sipush #13048
    //   321: sipush #-7242
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: sipush #13055
    //   330: sipush #3455
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   339: putstatic burp/Zs08.Zu : Ljava/util/Set;
    //   342: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x32FB) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
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
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 104;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs08.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */