/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*    */ import com.github.weisj.jsvg.util.ConstantProvider;
/*    */ import com.github.weisj.jsvg.util.LazyProvider;
/*    */ import com.github.weisj.jsvg.util.Provider;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ChannelStorage<T>
/*    */ {
/*    */   @NotNull
/* 36 */   private final Map<Object, Provider<T>> storage = new HashMap<>();
/*    */   
/*    */   public void addResult(@NotNull FilterChannelKey key, @NotNull T value) {
/* 39 */     this.storage.put(key.key(), new ConstantProvider(value));
/*    */   }
/*    */   
/*    */   public void addResult(@NotNull FilterChannelKey key, @NotNull Supplier<T> value) {
/* 43 */     this.storage.put(key.key(), new LazyProvider(value));
/*    */   }
/*    */   @NotNull
/*    */   public T get(@NotNull FilterChannelKey key) {
/* 47 */     Provider<T> provider = this.storage.get(key.key());
/* 48 */     if (provider == null) throw new IllegalFilterStateException("Channel " + key + " not found."); 
/* 49 */     return (T)provider.get();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\ChannelStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */