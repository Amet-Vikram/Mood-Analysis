

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("sad")){
            return "Sad";
        }
        return "Happy";
    }
}