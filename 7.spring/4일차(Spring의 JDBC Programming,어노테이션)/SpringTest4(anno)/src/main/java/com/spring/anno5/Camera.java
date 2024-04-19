package com.spring.anno5;

/*
 * beans 관련된 클래스가 업무에 따라서 많아 질경우 -> 지금까지는 개발자가 필요로 할 때마다 수동으로 등록하는 방식을 썼다면
 * 예제는 @Component 를 이용할 것임. 
 * 
 * ''' 
 * @Component : 클랫와 연관된 어노테이션.
 *  스프링컨테이너가 어느 특정 패키지를 지정함
 *  자동적으로 그 패키지에 들어가 있는 모든 클래스 중에서 @Component 가 붙어있는 클래스를 자동ㅇ로 beans 등록
 * */

import org.springframework.stereotype.Component;

@Component("home")
public class Camera {




}
