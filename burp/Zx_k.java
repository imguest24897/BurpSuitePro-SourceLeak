package burp;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import net.portswigger.Zm2;
import net.portswigger.Zrzk;

public class Zx_k {
  private final ObservableList<Zgi> Zp = FXCollections.observableArrayList();
  
  public ObservableList<Zgi> Zp() {
    return this.Zp;
  }
  
  public void Zp(Consumer<List<Zgi>> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Ljavafx/collections/ObservableList;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> onChanged : (Lburp/Zx_k;Ljava/util/function/Consumer;)Ljavafx/collections/ListChangeListener;
    //   11: invokeinterface addListener : (Ljavafx/collections/ListChangeListener;)V
    //   16: return
  }
  
  public void Zc(List<Zg7g> paramList) {
    List list = paramList.stream().flatMap(Zx_k::lambda$detectAuthentications$1).map(Zx_k::lambda$detectAuthentications$2).distinct().peek(Zx_k::lambda$detectAuthentications$3).toList();
    list.forEach(Zx_k::lambda$detectAuthentications$4);
    this.Zp.clear();
    this.Zp.addAll(list);
  }
  
  public void Z_() {
    this.Zp.clear();
  }
  
  public Zgi Zs(int paramInt) {
    return (Zgi)this.Zp.remove(paramInt);
  }
  
  public Optional<Ztb0> ZX(Zgi paramZgi) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Ljavafx/collections/ObservableList;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   17: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   22: aload_1
    //   23: <illegal opcode> apply : (Lburp/Zgi;)Ljava/util/function/Function;
    //   28: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   33: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   38: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   43: invokeinterface findFirst : ()Ljava/util/Optional;
    //   48: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   53: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   56: aload_0
    //   57: aload_1
    //   58: <illegal opcode> get : (Lburp/Zx_k;Lburp/Zgi;)Ljava/util/function/Supplier;
    //   63: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   66: areturn
  }
  
  public Zgi Zd(int paramInt) {
    return (Zgi)this.Zp.get(paramInt);
  }
  
  public Optional<Zgi> Zp(Zgi paramZgi) {
    return this.Zp.stream().filter(paramZgi::lambda$findDetectedAuthMatching$7).findFirst();
  }
  
  public void Zb(int paramInt, Zgi paramZgi) {
    this.Zp.set(paramInt, paramZgi);
  }
  
  private static boolean lambda$findDetectedAuthMatching$7(Zgi paramZgi1, Zgi paramZgi2) {
    return paramZgi2.ZK(paramZgi1);
  }
  
  private Optional lambda$add$6(Zgi paramZgi) {
    this.Zp.add(paramZgi);
    return Optional.empty();
  }
  
  private static Ztcx lambda$add$5(Zgi paramZgi1, Zgi paramZgi2) {
    return paramZgi2.ZE(paramZgi1);
  }
  
  private static void lambda$detectAuthentications$4(Zgi paramZgi) {
    Zm2.ZB(paramZgi.ZY() ? Zec3.SCANNER_API_AUTHENTICATION_SUPPORTED : Zec3.SCANNER_API_AUTHENTICATION_UNSUPPORTED, paramZgi.ZR());
  }
  
  private static void lambda$detectAuthentications$3(Zgi paramZgi) {
    Zm2.Zo(Zze0.SCANNER_API_AUTHENTICATIONS_DETECTED);
  }
  
  private static Zgi lambda$detectAuthentications$2(Zrzk paramZrzk) {
    return Zgi.Zn(paramZrzk.ZI(), paramZrzk.Zs(), paramZrzk.ZJ(), paramZrzk.Zj());
  }
  
  private static Stream lambda$detectAuthentications$1(Zg7g paramZg7g) {
    return paramZg7g.Zg().Zo().stream();
  }
  
  private void lambda$onAuthenticationUpdated$0(Consumer paramConsumer, ListChangeListener.Change paramChange) {
    paramConsumer.accept(Collections.unmodifiableList((List<? extends Zgi>)this.Zp));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */