package com.annotatedsql.annotation.sql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface RawQuery {
    String value();
}
