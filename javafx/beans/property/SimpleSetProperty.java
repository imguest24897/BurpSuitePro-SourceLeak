/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.collections.ObservableSet;
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
/*     */ public class SimpleSetProperty<E>
/*     */   extends SetPropertyBase<E>
/*     */ {
/*  41 */   private static final Object DEFAULT_BEAN = null;
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
/*  52 */     return this.bean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  60 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleSetProperty() {
/*  67 */     this(DEFAULT_BEAN, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleSetProperty(ObservableSet<E> paramObservableSet) {
/*  77 */     this(DEFAULT_BEAN, "", paramObservableSet);
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
/*     */   public SimpleSetProperty(Object paramObject, String paramString) {
/*  89 */     this.bean = paramObject;
/*  90 */     this.name = (paramString == null) ? "" : paramString;
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
/*     */   public SimpleSetProperty(Object paramObject, String paramString, ObservableSet<E> paramObservableSet) {
/* 104 */     super(paramObservableSet);
/* 105 */     this.bean = paramObject;
/* 106 */     this.name = (paramString == null) ? "" : paramString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SimpleSetProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */