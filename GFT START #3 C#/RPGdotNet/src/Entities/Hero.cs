namespace desafios.src.Entities
{
    public abstract class Hero
    {
        public string Name { get; set; }
        public int Level { get; set; }
        public string HeroType { get; set; }
        public int XP { get; set; }

        public int Life { get; set; }
        public Hero(string name, int level, string heroType)
        {
            this.Name = name;
            this.Level = level;
            this.HeroType = heroType;
            this.XP = 0;
            this.Life = 10;
        }

        public Hero() { }

        public override string ToString()
        {
            return "Name: " + this.Name + "\nLevel: " + this.Level + "\nHero Type: " + this.HeroType + "\nXP: " + this.XP + "\nHP: " + this.Life;
        }

        public virtual string Attack()
        {
            return this.Name = this.Name + " Atacou com sua espada";
        }

        public virtual string Defense()
        {
            LostHP();
            return this.Name = this.Name + " Defendeu com seu escudo";
        }

        public virtual string Deflect()
        {
            return this.Name = this.Name + " Desviou";
        }

        public virtual int WinXP(int xp)
        {
            this.XP = this.XP + xp;
            UPLevel();
            return this.XP;
        }

        public virtual void UPLevel()
        {
            if (this.XP > 100)
            {
                this.Level = +1;
                WinHP();
            }
        }

        public virtual int LostHP()
        {
            return this.Life = this.Life - 10;
        }

        public virtual int WinHP()
        {
            return this.Life = this.Life + 10;
        }
    }

}