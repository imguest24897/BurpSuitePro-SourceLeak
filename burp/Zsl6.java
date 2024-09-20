package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsl6 implements Zkbs {
  private final EnumSet<Zgu3> Zu;
  
  private final Zl8t Zm;
  
  private final Runnable ZO;
  
  private final Consumer<Zge7> ZC;
  
  private final List<Zml7> ZT;
  
  private final List<Zkvi> Zd;
  
  private final List<Zt8o> ZR;
  
  private Zte0<Zoh> ZG;
  
  private Zte0<Zgi0> Za;
  
  private Zz99 ZK;
  
  private boolean Zp;
  
  Zsl6(EnumSet<Zgu3> paramEnumSet, Zl8t paramZl8t, Runnable paramRunnable, Consumer<Zge7> paramConsumer) {
    this.Zu = paramEnumSet;
    this.Zm = paramZl8t;
    this.ZO = paramRunnable;
    this.ZC = paramConsumer;
    this.ZT = new ArrayList<>();
    this.Zd = new ArrayList<>();
    this.ZR = new ArrayList<>();
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zp = paramBoolean;
  }
  
  public void ZM(Zte0<Zoh> paramZte0) {
    try {
      if (!this.Zp) {
        try {
          if (this.Zu.contains(Zgu3.HTTP_REQUEST)) {
            try {
              if (this.ZG == null)
                try {
                  if (paramZte0.Zn((List)this.ZT))
                    return; 
                } catch (MatchException matchException) {
                  throw a(null);
                }  
            } catch (MatchException matchException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    List<?> list = this.ZT.stream().filter(paramZte0::lambda$httpRequestEditorProviderConfigChanged$0).toList();
    this.ZT.removeAll(list);
    list.forEach(this.ZC);
    this.ZG = paramZte0;
    this.ZO.run();
  }
  
  public void Zl(Zte0<Zgi0> paramZte0) {
    try {
      if (!this.Zp) {
        try {
          if (this.Zu.contains(Zgu3.HTTP_RESPONSE)) {
            try {
              if (this.Za == null)
                try {
                  if (paramZte0.Zn((List)this.Zd))
                    return; 
                } catch (MatchException matchException) {
                  throw a(null);
                }  
            } catch (MatchException matchException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    List<?> list = this.Zd.stream().filter(paramZte0::lambda$httpResponseEditorProviderConfigChanged$1).toList();
    this.Zd.removeAll(list);
    list.forEach(this.ZC);
    this.Za = paramZte0;
    this.ZO.run();
  }
  
  public void Zj(Zz99 paramZz99) {
    try {
      if (!this.Zp) {
        try {
          if (this.Zu.contains(Zgu3.WS_MESSAGE)) {
            try {
              if (this.ZK == null)
                try {
                  if (paramZz99.Zt((List)this.ZR))
                    return; 
                } catch (MatchException matchException) {
                  throw a(null);
                }  
            } catch (MatchException matchException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    List<?> list = this.ZR.stream().filter(paramZz99::lambda$webSocketMessageProviderConfigChanged$2).toList();
    this.ZR.removeAll(list);
    list.forEach(this.ZC);
    this.ZK = paramZz99;
    this.ZO.run();
  }
  
  public boolean Zd(Zgu3 paramZgu3) {
    try {
      switch (Zg7r.Zv[paramZgu3.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (this.ZG != null);
        case 2:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (this.Za != null);
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (this.ZK != null);
  }
  
  public List<? extends Zge7> Zk(Zgu3 paramZgu3) {
    try {
      switch (Zg7r.Zv[paramZgu3.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    List<Zt8o> list = Zr();
    return List.copyOf((Collection)list);
  }
  
  private List<Zml7> Zb() {
    try {
      if (this.ZG == null)
        return this.ZT; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.ZT.clear();
    Objects.requireNonNull(this.Zm);
    this.ZT.addAll(ZO(this.Zm::ZN, this.ZG));
    this.ZG = null;
    return this.ZT;
  }
  
  private List<Zkvi> ZD() {
    try {
      if (this.Za == null)
        return this.Zd; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.Zd.clear();
    Objects.requireNonNull(this.Zm);
    this.Zd.addAll(ZO(this.Zm::Zy, this.Za));
    this.Za = null;
    return this.Zd;
  }
  
  private List<Zt8o> Zr() {
    try {
      if (this.ZK == null)
        return this.ZR; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    this.ZR.clear();
    Objects.requireNonNull(this.Zm);
    this.ZR.addAll(ZO(this.Zm::Zc, this.ZK));
    this.ZK = null;
    return this.ZR;
  }
  
  private static <P, W> List<W> ZO(Function<P, W> paramFunction, Iterable<P> paramIterable) {
    ArrayList<W> arrayList = new ArrayList();
    Iterator<P> iterator = paramIterable.iterator();
    int[] arrayOfInt = Zbdf.ZM();
    while (iterator.hasNext()) {
      P p = iterator.next();
      try {
        arrayList.add(paramFunction.apply(p));
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.EXTENSION_GENERATED);
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean lambda$webSocketMessageProviderConfigChanged$2(Zz99 paramZz99, Zt8o paramZt8o) {
    Objects.requireNonNull(paramZt8o);
    return paramZz99.Za().noneMatch(paramZt8o::ZA);
  }
  
  private static boolean lambda$httpResponseEditorProviderConfigChanged$1(Zte0 paramZte0, Zkvi paramZkvi) {
    Objects.requireNonNull(paramZkvi);
    return paramZte0.Zw().noneMatch(paramZkvi::Zq);
  }
  
  private static boolean lambda$httpRequestEditorProviderConfigChanged$0(Zte0 paramZte0, Zml7 paramZml7) {
    Objects.requireNonNull(paramZml7);
    return paramZte0.Zw().noneMatch(paramZml7::Zq);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */