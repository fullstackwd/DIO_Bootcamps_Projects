namespace desafios.src.Entities
{
    public class Wizard : Hero
    {


        public Wizard(string name, int level, string heroType) : base(name, level, heroType)
        {
            this.Name = name;
            this.Level = level;
            this.HeroType = heroType;
        }

        public override string Attack()
        {
            return this.Name = this.Name + " Lançou Magia";
        }

        public string Attack(int bonus)
        {
            if (bonus > 6)
            {
                this.XP = this.WinXP(20);
                return this.Name = this.Name + " Lançou Magia super efetiva com " + bonus + " de bônus";
            }
            else
                return this.Name = this.Name + " Lançou Magia com força fraca com " + bonus + "de bônus";

        }

        public override string Defense()
        {
            return this.Name = this.Name + " Defendeu com seu escudo Mágico";
        }

        public string Heal()
        {
            WinHP();
            return this.Name = this.Name + " Curou com sua mágia";
        }

    }
}