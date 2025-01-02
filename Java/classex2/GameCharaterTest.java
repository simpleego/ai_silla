package com.simple.exam.classex2;

public class GameCharaterTest {
    public static void main(String[] args) {
        GameCharacter character=  new GameCharacter();
        character.add("Sword",1,100);
        character.add("Gun",2,50);
        character.print();
    }
}
