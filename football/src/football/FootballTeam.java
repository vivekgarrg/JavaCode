package football;

public class FootballTeam {
        private String name;
        private int wins;
        private int losses;

        public FootballTeam(String name, int wins, int looses) {
            this.name = name;
            this.wins = wins;
            this.losses = losses;
        }

        public FootballTeam(String name) {
            this(name, 0, 0);
        }

        public String getName() {
            return name;
        }

        public int getWins() {
            return wins;
        }
		
        public int getLosses() {
            return losses;
        }

        void win() {
            wins++;
        }

        void lose() {
            losses++;
        }

        public boolean GoodRecord() {
            return (wins > losses);
        }

        public static void main(String arg[]){
            FootballTeam team = new FootballTeam("Cristiano", 3, 5);
            System.out.println(team.GoodRecord());
            for (int i = 0; i < 3; i++) {
                team.win();
            }
            System.out.println(team.GoodRecord());
        }
}


