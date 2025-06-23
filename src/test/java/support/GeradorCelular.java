package support;
import java.util.Random;

    public class GeradorCelular {

        private static final Random random = new Random();

        public static String gerarNumeroCelular() {
            int ddd = 11 + random.nextInt(19); // DDDs de 11 a 29 (pode ajustar)
            int parte1 = 90000 + random.nextInt(10000); // começa com 9 e mais 4 dígitos
            int parte2 = 1000 + random.nextInt(9000); // últimos 4 dígitos

            return String.format("(%d) %d-%d", ddd, parte1, parte2);
        }
    }

