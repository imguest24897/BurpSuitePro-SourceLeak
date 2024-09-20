package burp;

import java.util.List;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public final class Zx4a<T> extends Record implements ListChangeListener<T> {
  private final ObservableList<T> ZK;
  
  private final Zgra<Runnable> ZW;
  
  public Zx4a(ObservableList<T> paramObservableList, Zgra<Runnable> paramZgra) {
    this.ZK = paramObservableList;
    this.ZW = paramZgra;
  }
  
  public void onChanged(ListChangeListener.Change<? extends T> paramChange) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual next : ()Z
    //   8: ifeq -> 138
    //   11: aload_1
    //   12: invokevirtual getFrom : ()I
    //   15: istore_3
    //   16: aload_1
    //   17: invokevirtual wasPermutated : ()Z
    //   20: ifeq -> 64
    //   23: new java/util/ArrayList
    //   26: dup
    //   27: aload_1
    //   28: invokevirtual getList : ()Ljavafx/collections/ObservableList;
    //   31: iload_3
    //   32: aload_1
    //   33: invokevirtual getTo : ()I
    //   36: invokeinterface subList : (II)Ljava/util/List;
    //   41: invokespecial <init> : (Ljava/util/Collection;)V
    //   44: astore #4
    //   46: aload_0
    //   47: getfield ZW : Lburp/Zgra;
    //   50: aload_0
    //   51: aload #4
    //   53: iload_3
    //   54: <illegal opcode> run : (Lburp/Zx4a;Ljava/util/List;I)Ljava/lang/Runnable;
    //   59: invokeinterface ZB : (Ljava/lang/Object;)V
    //   64: aload_1
    //   65: invokevirtual wasRemoved : ()Z
    //   68: ifeq -> 96
    //   71: aload_1
    //   72: invokevirtual getRemovedSize : ()I
    //   75: istore #4
    //   77: aload_0
    //   78: getfield ZW : Lburp/Zgra;
    //   81: aload_0
    //   82: aload_1
    //   83: iload_3
    //   84: iload #4
    //   86: <illegal opcode> run : (Lburp/Zx4a;Ljavafx/collections/ListChangeListener$Change;II)Ljava/lang/Runnable;
    //   91: invokeinterface ZB : (Ljava/lang/Object;)V
    //   96: aload_1
    //   97: invokevirtual wasAdded : ()Z
    //   100: ifeq -> 134
    //   103: new java/util/ArrayList
    //   106: dup
    //   107: aload_1
    //   108: invokevirtual getAddedSubList : ()Ljava/util/List;
    //   111: invokespecial <init> : (Ljava/util/Collection;)V
    //   114: astore #4
    //   116: aload_0
    //   117: getfield ZW : Lburp/Zgra;
    //   120: aload_0
    //   121: iload_3
    //   122: aload #4
    //   124: <illegal opcode> run : (Lburp/Zx4a;ILjava/util/List;)Ljava/lang/Runnable;
    //   129: invokeinterface ZB : (Ljava/lang/Object;)V
    //   134: iload_2
    //   135: ifne -> 4
    //   138: aload_0
    //   139: getfield ZW : Lburp/Zgra;
    //   142: invokeinterface Zv : ()V
    //   147: return
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx4a;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx4a;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx4a;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private void lambda$onChanged$2(int paramInt, List paramList) {
    this.ZK.addAll(paramInt, paramList);
  }
  
  private void lambda$onChanged$1(ListChangeListener.Change paramChange, int paramInt1, int paramInt2) {
    int i = Ztdp.Zy();
    if (paramChange.getRemovedSize() == this.ZK.size() && paramInt1 == 0) {
      this.ZK.clear();
      if (i == 0) {
        this.ZK.remove(paramInt1, paramInt1 + paramInt2);
        return;
      } 
      return;
    } 
    this.ZK.remove(paramInt1, paramInt1 + paramInt2);
  }
  
  private void lambda$onChanged$0(List paramList, int paramInt) {
    int j = paramList.size();
    int i = Ztdp.Zy();
    byte b = 0;
    while (b < j) {
      this.ZK.set(b + paramInt, paramList.get(b));
      b++;
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */