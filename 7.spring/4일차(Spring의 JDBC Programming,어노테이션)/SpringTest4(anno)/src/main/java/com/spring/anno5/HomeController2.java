package com.spring.anno5;

import anno4.Camera;

import javax.annotation.Resource;
import javax.inject.Inject;

public class HomeController2 {

    @Inject
    private Camera camera;

    private Camera2 camera2;

    @Resource
    private Camera3 camera3;


    @Override
    public String toString() {
        return "HomeController2[camera3= " + camera3+"]";
    }
}
