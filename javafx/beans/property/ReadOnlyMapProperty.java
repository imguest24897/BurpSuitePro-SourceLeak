/*     */ package javafx.beans.property;
/*     */ 
/*     */ import java.util.Map;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.MapExpression;
/*     */ import javafx.collections.ObservableMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyMapProperty<K, V>
/*     */   extends MapExpression<K, V>
/*     */   implements ReadOnlyProperty<ObservableMap<K, V>>
/*     */ {
/*     */   public void bindContentBidirectional(ObservableMap<K, V> paramObservableMap) {
/*  65 */     Bindings.bindContentBidirectional((ObservableMap)this, paramObservableMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindContentBidirectional(Object paramObject) {
/*  77 */     Bindings.unbindContentBidirectional(this, paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindContent(ObservableMap<K, V> paramObservableMap) {
/*  93 */     Bindings.bindContent((Map)this, paramObservableMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindContent(Object paramObject) {
/* 105 */     Bindings.unbindContent(this, paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 110 */     if (paramObject == this) {
/* 111 */       return true;
/*     */     }
/* 113 */     if (paramObject instanceof Map) { Map map = (Map)paramObject; if (map.size() == size()) {
/*     */         
/*     */         try {
/*     */ 
/*     */           
/* 118 */           for (Map.Entry entry : entrySet()) {
/* 119 */             Object object1 = entry.getKey();
/* 120 */             Object object2 = entry.getValue();
/* 121 */             if (object2 == null) {
/* 122 */               if (map.get(object1) != null || !map.containsKey(object1))
/* 123 */                 return false;  continue;
/*     */             } 
/* 125 */             if (!object2.equals(map.get(object1))) {
/* 126 */               return false;
/*     */             }
/*     */           } 
/*     */           
/* 130 */           return true;
/* 131 */         } catch (ClassCastException|NullPointerException classCastException) {
/* 132 */           return false;
/*     */         } 
/*     */       } }
/*     */     
/*     */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 142 */     int i = 0;
/* 143 */     for (Map.Entry entry : entrySet()) {
/* 144 */       i += entry.hashCode();
/*     */     }
/* 146 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 155 */     Object object = getBean();
/* 156 */     String str = getName();
/* 157 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyMapProperty [");
/*     */     
/* 159 */     if (object != null) {
/* 160 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 162 */     if (str != null && !str.equals("")) {
/* 163 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 165 */     stringBuilder.append("value: ").append(get()).append("]");
/* 166 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyMapProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */