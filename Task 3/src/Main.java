<<<<<<< HEAD
public class Main {
    public class Vector {
        // Три приватных поля
        private double x;
        private double y;
        private double z;

        // С тремя параметрами
        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Длина вектора. Корень из суммы квадратов
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // метод, вычисляющий скалярное произведение
        public double scalarProduct(Vector vector) {
            return x * vector.x + y * vector.y + z * vector.z;
        }
    }
}
=======
public class Main {
    public class Vector {
        // Три приватных поля
        private double x;
        private double y;
        private double z;

        // С тремя параметрами
        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Длина вектора. Корень из суммы квадратов
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // метод, вычисляющий скалярное произведение
        public double scalarProduct(Vector vector) {
            return x * vector.x + y * vector.y + z * vector.z;
        }
    }
}
>>>>>>> origin/main
