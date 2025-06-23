package support;
import java.util.Random;

import java.util.InputMismatchException;

public class GeradorNome {




        private static final String[] NOMES = {
                "Marcos", "Ana", "Carlos", "Beatriz", "Lucas", "Julia", "Pedro", "Mariana", "João", "Fernanda"
        };

        private static final String[] SOBRENOMES = {
                "Silva", "Souza", "Oliveira", "Lima", "Costa", "Almeida", "Pereira", "Rodrigues", "Martins", "Gomes"
        };

        private static final Random random = new Random();

        public static String gerarNomeCompleto() {
            String nome = NOMES[random.nextInt(NOMES.length)];
            String sobrenome = SOBRENOMES[random.nextInt(SOBRENOMES.length)];
            return nome + " " + sobrenome;
        }
    }
