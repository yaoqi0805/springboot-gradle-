package com.formularoom.mata_annotation;

import java.lang.annotation.Inherited;

@Inherited
public @interface Greeting {

    enum FontColor{BULE,RED,GREEN};

    String name();

    FontColor fonColor()default FontColor.RED;
}
