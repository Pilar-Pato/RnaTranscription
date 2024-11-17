package dev.pilar.rnatranscription;

import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.*;  
public class RnaTranscriptionTest {

    @Test
    public void testTranscribirADNaARN() {
        
        String adn = "GCTA";
        String esperado = "CGAU";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));

        
        adn = "";
        esperado = "";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));

        
        adn = "ATGCGTACG";
        esperado = "UACGCAUGC";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));

        
        adn = "AAAA";
        esperado = "UUUU";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));

        
        adn = "TTTT";
        esperado = "AAAA";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));

        
        adn = "GTCA";
        esperado = "CAGU";
        assertEquals(esperado, RnaTranscription.transcribirADNaARN(adn));
    }

    @Test
    public void testSecuenciaInvalida() {
        
        String adn = "ATXCGT"; 
        assertThrows(IllegalArgumentException.class, () -> {
            RnaTranscription.transcribirADNaARN(adn);
        });
    }
}
