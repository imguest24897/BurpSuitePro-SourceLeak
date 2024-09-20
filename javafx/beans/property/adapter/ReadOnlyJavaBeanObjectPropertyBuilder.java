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
/*     */ 
/*     */ 
/*     */ public final class ReadOnlyJavaBeanObjectPropertyBuilder<T>
/*     */ {
/*  63 */   private final ReadOnlyJavaBeanPropertyBuilderHelper<T> helper = new ReadOnlyJavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> ReadOnlyJavaBeanObjectPropertyBuilder<T> create() {
/*  74 */     return new ReadOnlyJavaBeanObjectPropertyBuilder<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanObjectProperty<T> build() throws NoSuchMethodException {
/*  85 */     ReadOnlyPropertyDescriptor<T> readOnlyPropertyDescriptor = this.helper.getDescriptor();
/*  86 */     return new ReadOnlyJavaBeanObjectProperty<>(readOnlyPropertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanObjectPropertyBuilder<T> name(String paramString) {
/*  96 */     this.helper.name(paramString);
/*  97 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanObjectPropertyBuilder<T> bean(Object paramObject) {
/* 107 */     this.helper.bean(paramObject);
/* 108 */     return this;
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
/*     */   public ReadOnlyJavaBeanObjectPropertyBuilder<T> beanClass(Class<?> paramClass) {
/* 120 */     this.helper.beanClass(paramClass);
/* 121 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanObjectPropertyBuilder<T> getter(String paramString) {
/* 132 */     this.helper.getterName(paramString);
/* 133 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyJavaBeanObjectPropertyBuilder<T> getter(Method paramMethod) {
/* 144 */     this.helper.getter(paramMethod);
/* 145 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanObjectPropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */