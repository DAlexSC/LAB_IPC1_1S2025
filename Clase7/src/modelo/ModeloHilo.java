package modelo;

import java.security.SecureRandom;

/**
 *
 * @author Douglas Soch
 */
public class ModeloHilo {

    public int seconds;
    public String timeFormatted; // 00:00
    
    public void incrementSeconds(){
        seconds++;
    }
    
    public String currentTime() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        timeFormatted = String.format("%02d:%02d", minutes, remainingSeconds);
        return timeFormatted;
    }
    
    private final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private SecureRandom random = new SecureRandom();

    // Método para generar una cadena aleatoria de 10 caracteres
    public String generateRandomString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(randomIndex));
        }
        return builder.toString();
    }
    
}
