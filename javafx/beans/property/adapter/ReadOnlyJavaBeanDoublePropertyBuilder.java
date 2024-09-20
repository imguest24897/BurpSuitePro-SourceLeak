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
/*     */ public final class ReadOnlyJavaBeanDoublePropertyBuilder
/*     */ {
/*  61 */   private final ReadOnlyJavaBeanPropertyBuilderHelper<Number> helper = new ReadOnlyJavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ReadOnlyJavaBeanDoublePropertyBuilder create() {
/*  71 */     return new ReadOnlyJavaBeanDoublePropertyBuilder();
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
/*     */   public ReadOnlyJavaBeanDoubleProperty build() throws NoSuchMethodException {
/*  84 */     ReadOnlyPropertyDescriptor<Number> readOnlyPropertyDescriptor = this.helper.getDescriptor();
/*  85 */     if (!double.class.equals(readOnlyPropertyDescriptor.getType()) && !Number.class.isAssignableFrom(readOnlyPropertyDescriptor.getType())) {
/*  86 */       throw new IllegalArgumentException("Not a double property");
/*     */     }
/*  88 */     return new ReadOnlyJavaBeanDoubleProperty(readOnlyPropertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanDoublePropertyBuilder name(String paramString) {
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
/*     */   public ReadOnlyJavaBeanDoublePropertyBuilder bean(Object paramObject) {
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
/*     */   public ReadOnlyJavaBeanDoublePropertyBuilder beanClass(Class<?> paramClass) {
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
/*     */   public ReadOnlyJavaBeanDoublePropertyBuilder getter(String paramString) {
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
/*     */   public ReadOnlyJavaBeanDoublePropertyBuilder getter(Method paramMethod) {
/* 146 */     this.helper.getter(paramMethod);
/* 147 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanDoublePropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */