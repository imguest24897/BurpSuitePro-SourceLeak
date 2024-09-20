/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.adapter.ReadOnlyJavaBeanPropertyBuilderHelper;
/*     */ import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
/*     */ import java.lang.reflect.Method;
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
/*     */ public final class ReadOnlyJavaBeanBooleanPropertyBuilder
/*     */ {
/*  61 */   private final ReadOnlyJavaBeanPropertyBuilderHelper<Boolean> helper = new ReadOnlyJavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ReadOnlyJavaBeanBooleanPropertyBuilder create() {
/*  71 */     return new ReadOnlyJavaBeanBooleanPropertyBuilder();
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
/*     */   public ReadOnlyJavaBeanBooleanProperty build() throws NoSuchMethodException {
/*  84 */     ReadOnlyPropertyDescriptor<Boolean> readOnlyPropertyDescriptor = this.helper.getDescriptor();
/*  85 */     if (!boolean.class.equals(readOnlyPropertyDescriptor.getType()) && !Boolean.class.equals(readOnlyPropertyDescriptor.getType())) {
/*  86 */       throw new IllegalArgumentException("Not a boolean property");
/*     */     }
/*  88 */     return new ReadOnlyJavaBeanBooleanProperty(readOnlyPropertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanBooleanPropertyBuilder name(String paramString) {
/*  98 */     this.helper.name(paramString);
/*  99 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanBooleanPropertyBuilder bean(Object paramObject) {
/* 109 */     this.helper.bean(paramObject);
/* 110 */     return this;
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
/*     */   public ReadOnlyJavaBeanBooleanPropertyBuilder beanClass(Class<?> paramClass) {
/* 122 */     this.helper.beanClass(paramClass);
/* 123 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanBooleanPropertyBuilder getter(String paramString) {
/* 134 */     this.helper.getterName(paramString);
/* 135 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanBooleanPropertyBuilder getter(Method paramMethod) {
/* 146 */     this.helper.getter(paramMethod);
/* 147 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanBooleanPropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */