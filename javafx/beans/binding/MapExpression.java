/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.StringFormatter;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.beans.value.ObservableObjectValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
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
/*     */ public abstract class MapExpression<K, V>
/*     */   implements ObservableMapValue<K, V>
/*     */ {
/*     */   public ObservableMap<K, V> getValue() {
/*  59 */     return (ObservableMap<K, V>)get();
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
/*     */   public static <K, V> MapExpression<K, V> mapExpression(final ObservableMapValue<K, V> value) {
/*  86 */     if (value == null) {
/*  87 */       throw new NullPointerException("Map must be specified.");
/*     */     }
/*  89 */     return (value instanceof MapExpression) ? (MapExpression<K, V>)value : 
/*  90 */       new MapBinding<K, V>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/*  97 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected ObservableMap<K, V> computeValue() {
/* 102 */           return (ObservableMap<K, V>)value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<?> getDependencies() {
/* 107 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSize() {
/* 117 */     return size();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectBinding<V> valueAt(K paramK) {
/* 139 */     return Bindings.valueAt((ObservableMap<K, V>)this, paramK);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectBinding<V> valueAt(ObservableValue<K> paramObservableValue) {
/* 150 */     return Bindings.valueAt((ObservableMap<K, V>)this, paramObservableValue);
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
/*     */   public BooleanBinding isEqualTo(ObservableMap<?, ?> paramObservableMap) {
/* 164 */     return Bindings.equal((ObservableObjectValue<?>)this, paramObservableMap);
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
/*     */   public BooleanBinding isNotEqualTo(ObservableMap<?, ?> paramObservableMap) {
/* 178 */     return Bindings.notEqual((ObservableObjectValue<?>)this, paramObservableMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNull() {
/* 187 */     return Bindings.isNull((ObservableObjectValue<?>)this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanBinding isNotNull() {
/* 196 */     return Bindings.isNotNull((ObservableObjectValue<?>)this);
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
/*     */   public StringBinding asString() {
/* 208 */     return (StringBinding)StringFormatter.convert((ObservableValue)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 213 */     return getNonNull().size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 218 */     return getNonNull().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsKey(Object paramObject) {
/* 223 */     return getNonNull().containsKey(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsValue(Object paramObject) {
/* 228 */     return getNonNull().containsValue(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public V put(K paramK, V paramV) {
/* 233 */     return (V)getNonNull().put(paramK, paramV);
/*     */   }
/*     */ 
/*     */   
/*     */   public V remove(Object paramObject) {
/* 238 */     return (V)getNonNull().remove(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void putAll(Map<? extends K, ? extends V> paramMap) {
/* 243 */     getNonNull().putAll(paramMap);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 248 */     getNonNull().clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<K> keySet() {
/* 253 */     return getNonNull().keySet();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<V> values() {
/* 258 */     return getNonNull().values();
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<Map.Entry<K, V>> entrySet() {
/* 263 */     return getNonNull().entrySet();
/*     */   }
/*     */ 
/*     */   
/*     */   public V get(Object paramObject) {
/* 268 */     return (V)getNonNull().get(paramObject);
/*     */   }
/*     */   
/*     */   private ObservableMap<K, V> getNonNull() {
/* 272 */     ObservableMap<K, V> observableMap = (ObservableMap)get();
/*     */     
/* 274 */     return (observableMap == null) ? FXCollections.emptyObservableMap() : observableMap;
/*     */   }
/*     */   
/*     */   public abstract ReadOnlyIntegerProperty sizeProperty();
/*     */   
/*     */   public abstract ReadOnlyBooleanProperty emptyProperty();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\MapExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */