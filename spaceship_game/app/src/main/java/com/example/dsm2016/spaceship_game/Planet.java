package com.example.dsm2016.spaceship_game;

public class Planet {
    int x, y;
    int planetSpeed = 15;

    Planet(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
        y+=planetSpeed;
    }
}
