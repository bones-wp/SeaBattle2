class Main {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "h");
        board.shoot(2, 2, "h");
        board.shoot(2, 3, "d");



        for (int i = 0; i < board.getField().length; i++) {
            for (int j = 0; j < board.getField().length; j++) {
                System.out.print(board.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }
}