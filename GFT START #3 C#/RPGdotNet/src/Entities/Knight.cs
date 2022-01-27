namespace desafios.src.Entities
{
    public class Knight : Hero
    {
        public Knight(string name, int level, string heroType) : base(name, level, heroType)
        {
            this.Name = name;
            this.Level = level;
            this.HeroType = heroType;
        }

        public Knight() { }

        public string Attack(int bonus)
        {
            if (bonus > 6)
            {
                this.XP = this.WinXP(30);
                return this.Name = this.Name + " Lançou Magia super efetiva com " + bonus + " de bônus";
            }
            else
                return this.Name = this.Name + " Lançou Magia com força fraca com " + bonus + "de bônus";

        }
    }
}