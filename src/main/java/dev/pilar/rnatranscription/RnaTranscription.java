package dev.pilar.rnatranscription;

public class RnaTranscription {
    public static String transcribirADNaARN(String adn) {
        StringBuilder arn = new StringBuilder();

        
        for (char nucleotido : adn.toCharArray()) {
            switch (nucleotido) {
                case 'G':
                    arn.append('C');
                    break;
                case 'C':
                    arn.append('G');
                    break;
                case 'T':
                    arn.append('A');
                    break;
                case 'A':
                    arn.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Secuencia de ADN inválida.");
            }
        }
        return arn.toString();
    }
}

