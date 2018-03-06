package khasang.level1.battleship;

    public enum TypeShip {
        BATTLESHIP(4), CRUISER(3), DESTROYER(2), SUBMARINE(1);

        private final int sum;

        TypeShip(int sum) {
            this.sum = sum;
        }

        public int getSum() {
            return sum;
        }
    }