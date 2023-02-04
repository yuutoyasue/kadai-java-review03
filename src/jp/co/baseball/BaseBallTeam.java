package jp.co.baseball;

public class BaseBallTeam {

        //フィールド
        private String name; //名前
        private int win; //勝ち
        private int lose; //負け
        private int draw; //引き分け

        //引数ありのコンストラクタ
        public BaseBallTeam(String name, int win, int lose, int draw) {
            this.name = name;
            this.win = win;
            this.lose = lose;
            this.draw = draw;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWin() {
            return win;
        }

        public void setWin(int win) {
            this.win = win;
        }

        public int getLose() {
            return lose;
        }

        public void setLose(int lose) {
            this.lose = lose;
        }

        public int getDraw() {
            return draw;
        }

        public void setDraw(int draw) {
            this.draw = draw;
        }

        public void report() {
            double rate = getRate();
            System.out.println(this.name + "の2022年の成績は" + this.win +"勝" + this.lose + "敗"+this.draw +"分、勝率は" + rate + "です。");
        }
        public double getRate() {
            double rate = (double)this.win / (double)(this.win + this.lose);
            return rate;
        }

            }
