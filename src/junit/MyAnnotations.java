package junit;

public @interface MyAnnotations {
    int count();
    String value() default "hello";
}
