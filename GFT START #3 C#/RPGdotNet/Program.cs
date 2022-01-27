using static System.Console;
using desafios.src.Entities;

namespace Desafios
{
    class Program
    {
        static void Main(string[] args)
        {
            Knight hero = new Knight() { Name = "Taylor", Level = 2, HeroType = "Guerreiro" };
            Knight opponent = new Knight("Diablo", 10, "Demo");
            Wizard friend = new Wizard("Sheldon", 2, "Mago");

            opponent.Attack(10);
            WriteLine(opponent);
            hero.Defense();
            WriteLine(hero);
            opponent.Attack(10);
            WriteLine(opponent);
            hero.Deflect();
            WriteLine(hero);
            hero.Attack();
            WriteLine(hero);
            hero.Attack(20);
            WriteLine(hero);
            opponent.Defense();
            WriteLine(opponent);
            friend.Heal();
            WriteLine(friend);


        }
    }

}