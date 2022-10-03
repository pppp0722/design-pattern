package com.pppp0722.designpattern.strategy;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.swim(); // swim()은 Duck에 구현되어 있다.
        mallardDuck.display(); // display()는 추상 메소드이므로 반드시 구현해야 한다.
        mallardDuck.performFly(); // 전략 패턴의 핵심으로 상속 대신 구성(has-a)을 사용한다.

        Duck modelDuck = new ModelDuck();
        mallardDuck.swim();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocket()); // 전략 패턴을 사용했기 때문에 동적으로 재설정했다.
        modelDuck.performFly();
    }
}
