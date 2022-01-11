package battleship;

public class BattleShip {

    private String[][] battleField;

    public BattleShip() {
        this.battleField = new String[11][11];
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField[i].length; j++) {
                if (i == 0 && j == 0) {
                    battleField[i][j] = " ";
                } else if (i == 0) {
                    battleField[i][j] = Integer.toString(j);
                } else if (j == 0) {
                    battleField[i][j] = Character.toString((char) i + 64);
                } else {
                    battleField[i][j] = "~";
                }
            }
        }
    }

        public void printInfo() {
            System.out.println(" ");
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField[i].length; j++) {
                    System.out.print(battleField[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(" ");
        }

        public void placingShip(String[] coordinates) {
        int startColumn = coordinates[0].charAt(1) - 48;
        int finishColumn = coordinates[1].charAt(1) - 48;
        int startRow = coordinates[0].charAt(0) - 64;
        int finishRow = coordinates[1].charAt(0) - 64;
        if (startRow == finishRow) {
            for (int i = startColumn; i <= finishColumn; i++){
                battleField[startRow][i] = "O";
            }
        } else {
            for (int i = startRow; i <= finishRow; i++){
                battleField[i][startColumn] = "O";
            }
        }
        }

        public String getInfo(String coordinates) {
            return battleField[coordinates.charAt(1)][coordinates.charAt(0)];
        }

    }

