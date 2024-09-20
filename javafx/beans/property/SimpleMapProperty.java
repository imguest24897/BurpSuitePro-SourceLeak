/*     */ package javafx.beans.property;
/*     */ 
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
/*     */ public class SimpleMapProperty<K, V>
/*     */   extends MapPropertyBase<K, V>
/*     */ {
/*  42 */   private static final Object DEFAULT_BEAN = null;
/*     */ 
/*     */   
/*     */   private static final String DEFAULT_NAME = "";
/*     */   
/*     */   private final Object bean;
/*     */   
/*     */   private final String name;
/*     */ 
/*     */   
/*     */   public Object getBean() {
/*  53 */     return this.bean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  61 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleMapProperty() {
/*  68 */     this(DEFAULT_BEAN, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleMapProperty(ObservableMap<K, V> paramObservableMap) {
/*  78 */     this(DEFAULT_BEAN, "", paramObservableMap);
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
/*     */   public SimpleMapProperty(Object paramObject, String paramString) {
/*  90 */     this.bean = paramObject;
/*  91 */     this.name = (paramString == null) ? "" : paramString;
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
/*     */   public SimpleMapProperty(Object paramObject, String paramString, ObservableMap<K, V> paramObservableMap) {
/* 105 */     super(paramObservableMap);
/* 106 */     this.bean = paramObject;
/* 107 */     this.name = (paramString == null) ? "" : paramString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SimpleMapProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */