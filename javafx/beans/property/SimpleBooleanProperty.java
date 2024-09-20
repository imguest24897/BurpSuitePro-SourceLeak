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
/*     */ public class SimpleBooleanProperty
/*     */   extends BooleanPropertyBase
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
/*     */   public SimpleBooleanProperty() {
/*  64 */     this(DEFAULT_BEAN, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleBooleanProperty(boolean paramBoolean) {
/*  74 */     this(DEFAULT_BEAN, "", paramBoolean);
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
/*     */   public SimpleBooleanProperty(Object paramObject, String paramString) {
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
/*     */   public SimpleBooleanProperty(Object paramObject, String paramString, boolean paramBoolean) {
/* 101 */     super(paramBoolean);
/* 102 */     this.bean = paramObject;
/* 103 */     this.name = (paramString == null) ? "" : paramString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SimpleBooleanProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */