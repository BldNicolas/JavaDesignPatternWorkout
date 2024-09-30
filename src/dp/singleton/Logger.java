package dp.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private PrintWriter writerInfo;
    private PrintWriter writerWarning;
    private PrintWriter writerError;

    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter("app.log", true); // true for append mode
            FileWriter fileWriterInfo = new FileWriter("app.info", true);
            FileWriter fileWriterWarning = new FileWriter("app.warning", true);
            FileWriter fileWriterError = new FileWriter("app.error", true);
            writer = new PrintWriter(fileWriter);
            writerInfo = new PrintWriter(fileWriterInfo);
            writerWarning = new PrintWriter(fileWriterWarning);
            writerError = new PrintWriter(fileWriterError);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message, String level) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        // Si le level est null, on considère que c'est un log général
        if (level == null) {
            writer.println(timestamp + " - " + message);
            writer.flush();
        } else {
            switch (level.toLowerCase()) {
                case "info":
                    writerInfo.println(timestamp + " - " + message);
                    writerInfo.flush(); // Assure que le message est bien écrit dans le fichier
                    break;
                case "warning":
                    writerWarning.println(timestamp + " - " + message);
                    writerWarning.flush();
                    break;
                case "error":
                    writerError.println(timestamp + " - " + message);
                    writerError.flush();
                    break;
                default:
                    writer.println(timestamp + " - " + message); // Si le niveau est inconnu
                    writer.flush();
                    break;
            }
        }
    }

    public void log(String message) {
        log(message, null);
    }
}
