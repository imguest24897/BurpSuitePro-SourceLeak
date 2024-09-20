/*     */ package javafx.beans.property;
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
/*     */ public class SimpleLongProperty
/*     */   extends LongPropertyBase
/*     */ {
/*  38 */   private static final Object DEFAULT_BEAN = null;
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
/*  49 */     return this.bean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  57 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleLongProperty() {
/*  64 */     this(DEFAULT_BEAN, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleLongProperty(long paramLong) {
/*  74 */     this(DEFAULT_BEAN, "", paramLong);
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
/*     */   public SimpleLongProperty(Object paramObject, String paramString) {
/*  86 */     this.bean = paramObject;
/*  87 */     this.name = (paramString == null) ? "" : paramString;
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
/*     */   public SimpleLongProperty(Object paramObject, String paramString, long paramLong) {
/* 101 */     super(paramLong);
/* 102 */     this.bean = paramObject;
/* 103 */     this.name = (paramString == null) ? "" : paramString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SimpleLongProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */