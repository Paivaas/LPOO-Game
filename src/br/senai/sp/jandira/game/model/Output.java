package br.senai.sp.jandira.game.model;

public class Output {

    public void PrintPlayer(Player player){
        System.out.println("-------------------------");
        System.out.println("O nome do player é " + player.name);
        System.out.println("A skin é " + player.skin);
    }

    public void PrintEnemy(Enemy enemy){
        System.out.println("-------------------------");
        System.out.print("O nome do inimigo é " + enemy.name);
        System.out.print("A skin é " + enemy.skin);
    }

}
