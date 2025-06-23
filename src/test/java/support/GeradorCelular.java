package support;
import java.util.Random;

    public class GeradorCelular {

        private static final Random random = new Random();

        public static String gerarNumeroCelular() {
            int ddd = 11 + random.nextInt(19);
            int parte1 = 90000 + random.nextInt(10000);
            int parte2 = 1000 + random.nextInt(9000);

            return String.format("(%d) %d-%d", ddd, parte1, parte2);
        }
    }

