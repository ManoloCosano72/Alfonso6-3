public class Operaciones {
//Esta clase sirve para hacer operaciones
    double suma(double a, double b) {
        return a + b;
    }


    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }


    double multiplica(double a, double b) {
        return (a * b);
    }


    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }


    double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }


    public double raizCuadrada(double radicando) throws OperacionInvalidaException {
        if (radicando < 0)
            throw new OperacionInvalidaException("No se puede calcular la raíz cuadrada de un número negativo");

        double result = Math.sqrt(radicando);
        return result;
    }
    public class OperacionInvalidaException extends Throwable {
        public OperacionInvalidaException(String s) {
            System.out.println(s);
        }
    }
}
