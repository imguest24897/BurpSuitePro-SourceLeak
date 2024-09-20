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
/*     */ public class SimpleFloatProperty
/*     */   extends FloatPropertyBase
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
/*     */   public SimpleFloatProperty() {
/*  64 */     this(DEFAULT_BEAN, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleFloatProperty(float paramFloat) {
/*  74 */     this(DEFAULT_BEAN, "", paramFloat);
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
/*     */   public SimpleFloatProperty(Object paramObject, String paramString) {
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
/*     */   public SimpleFloatProperty(Object paramObject, String paramString, float paramFloat) {
/* 101 */     super(paramFloat);
/* 102 */     this.bean = paramObject;
/* 103 */     this.name = (paramString == null) ? "" : paramString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SimpleFloatProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */