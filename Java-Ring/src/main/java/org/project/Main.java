package org.project;

import org.project.entity.Entity;
import org.project.entity.enemies.Dragon;
import org.project.entity.enemies.Skeleton;
import org.project.entity.enemies.Goblin;
import org.project.entity.players.Knight;
import org.project.entity.players.Wizard;
import org.project.entity.players.Assassin;
import org.project.entity.enemies.Enemy;
import org.project.location.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Game Started");
        System.out.println("Choose your Fighter🥷\n1.Knight\n2.Wizard\n3.Assassin");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Entity player = null;

        if (choice == 1) {
            player = new Knight();
        } else if (choice == 2) {
            player = new Wizard();
        } else if (choice == 3) {
            player = new Assassin();
        } else {
            System.out.println("Invalid choice! Defaulting to Knight.");
            player = new Knight();
        }


        List<Location> locations = new ArrayList<>();
        Location london = new Location(new ArrayList<>(), new ArrayList<>());
        london.setlocatinname("🌆 London");

        Location tehran = new Location(new ArrayList<>(), new ArrayList<>());
        tehran.setlocatinname("🌇 Tehran");

        locations.add(london);
        locations.add(tehran);


        System.out.println("Choose a location:\n1. London\n2. Tehran");
        int locationChoice = sc.nextInt();

        Location selectedLocation;
        if (locationChoice == 1) {
            selectedLocation = london;
        } else if (locationChoice == 2) {
            selectedLocation = tehran;
        } else {
            System.out.println("Invalid choice! Defaulting to London.");
            selectedLocation = london;
        }

        System.out.println("You entered " + selectedLocation.getName());


        Random random = new Random();
        Enemy enemy;
        int enemyType = random.nextInt(3); // 0: Skeleton, 1: Goblin, 2: Dragon

        if (enemyType == 0) {
            enemy = new Skeleton();
        } else if (enemyType == 1) {
            enemy = new Goblin();
        } else {
            enemy = new Dragon();
        }

        System.out.println(player.getName() + " fight with " + enemy.getName());

      //gameplay
        while (player.alive() && enemy.alive()) {
            player.attack(enemy);
            System.out.println(player.getName() + " attacked " + enemy.getName());
            System.out.println(enemy.getName() + " HP is " + enemy.getHp());

            if (!enemy.alive()) {
                if (enemy instanceof Skeleton) {
                    System.out.println("💀 Skeleton is about to use its revive ability...");
                    enemy.Ability(enemy);
                    System.out.println("💀 Skeleton revive ability executed!");

                    if (enemy.alive()) {
                        System.out.println(enemy.getName() + " revived!");
                    } else {
                        System.out.println("❌ Skeleton failed to revive!");
                        break;
                    }
                } else {
                    break;
                }
            }

            if (player instanceof Wizard) {
                player.Ability(player);
            } else {
                player.Ability(enemy);
            }
            if (enemy instanceof Dragon) {
                enemy.Ability(player);
            }

            if (player instanceof Assassin && ((Assassin) player).isInvisible()) {
                System.out.println("⚡ " + player.getName() + " dodged the attack! (Invisible)");
            } else if (enemy.alive()) {
                enemy.attack(player);
                System.out.println(enemy.getName() + " attacked " + player.getName());
                System.out.println(player.getName() + " HP is " + player.getHp());
            }
        }

        if (player.alive()) {
            System.out.println(player.getName() + " Won!");
        } else {
            System.out.println(enemy.getName() + " Won!");
        }

        selectedLocation.resetLocation();
    }
}
